USE [master]
GO
/****** Object:  Database [VirgoHospital]    Script Date: 4.9.2018. 10:14:00 ******/
CREATE DATABASE [VirgoHospital]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'VirgoHospital', FILENAME = N'D:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\VirgoHospital.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'VirgoHospital_log', FILENAME = N'D:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\VirgoHospital_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [VirgoHospital] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [VirgoHospital].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [VirgoHospital] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [VirgoHospital] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [VirgoHospital] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [VirgoHospital] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [VirgoHospital] SET ARITHABORT OFF 
GO
ALTER DATABASE [VirgoHospital] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [VirgoHospital] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [VirgoHospital] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [VirgoHospital] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [VirgoHospital] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [VirgoHospital] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [VirgoHospital] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [VirgoHospital] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [VirgoHospital] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [VirgoHospital] SET  ENABLE_BROKER 
GO
ALTER DATABASE [VirgoHospital] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [VirgoHospital] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [VirgoHospital] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [VirgoHospital] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [VirgoHospital] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [VirgoHospital] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [VirgoHospital] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [VirgoHospital] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [VirgoHospital] SET  MULTI_USER 
GO
ALTER DATABASE [VirgoHospital] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [VirgoHospital] SET DB_CHAINING OFF 
GO
ALTER DATABASE [VirgoHospital] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [VirgoHospital] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [VirgoHospital] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [VirgoHospital] SET QUERY_STORE = OFF
GO
USE [VirgoHospital]
GO
ALTER DATABASE SCOPED CONFIGURATION SET IDENTITY_CACHE = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION SET LEGACY_CARDINALITY_ESTIMATION = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET LEGACY_CARDINALITY_ESTIMATION = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET MAXDOP = 0;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET MAXDOP = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET PARAMETER_SNIFFING = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET PARAMETER_SNIFFING = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET QUERY_OPTIMIZER_HOTFIXES = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET QUERY_OPTIMIZER_HOTFIXES = PRIMARY;
GO
USE [VirgoHospital]
GO
/****** Object:  Table [dbo].[Billings]    Script Date: 4.9.2018. 10:14:00 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Billings](
	[IDBilling] [int] IDENTITY(1,1) NOT NULL,
	[DoctorID] [int] NULL,
	[PatientID] [int] NULL,
	[Ammount] [int] NULL,
	[InsertDate] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDBilling] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Doctors]    Script Date: 4.9.2018. 10:14:00 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Doctors](
	[IDDoctor] [int] IDENTITY(1,1) NOT NULL,
	[FirstName] [nvarchar](25) NULL,
	[LastName] [nvarchar](25) NULL,
	[Title] [nvarchar](25) NULL,
	[Type] [nvarchar](25) NULL,
	[InsertDate] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDDoctor] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DoctorsPatients]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DoctorsPatients](
	[IDDoctorPatient] [int] IDENTITY(1,1) NOT NULL,
	[DoctorID] [int] NULL,
	[PatientID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDDoctorPatient] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NextOfKin]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NextOfKin](
	[IDNextOfKin] [int] IDENTITY(1,1) NOT NULL,
	[FirstName] [nvarchar](25) NULL,
	[LastName] [nvarchar](25) NULL,
	[MiddleName] [nvarchar](25) NULL,
	[PatientID] [int] NULL,
	[Address] [nvarchar](50) NULL,
	[Pager] [nvarchar](25) NULL,
	[Fax] [nvarchar](25) NULL,
	[Email] [nvarchar](25) NULL,
	[RelationshipWithPatient] [nvarchar](25) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDNextOfKin] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NextOfKinRelationship]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NextOfKinRelationship](
	[IDRelationship] [int] IDENTITY(1,1) NOT NULL,
	[Relationship] [nvarchar](25) NULL,
	[NextOfKinID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDRelationship] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NextOfKinTelephones]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NextOfKinTelephones](
	[IDNextOfKinTelephone] [int] IDENTITY(1,1) NOT NULL,
	[NextOfKinID] [int] NULL,
	[TelephoneNumber] [nvarchar](20) NULL,
	[TelephoneType] [char](1) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDNextOfKinTelephone] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Patients]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Patients](
	[IDPatient] [int] IDENTITY(1,1) NOT NULL,
	[FirstName] [nvarchar](25) NOT NULL,
	[LastName] [nvarchar](25) NOT NULL,
	[MiddleName] [nvarchar](25) NULL,
	[Sex] [char](1) NULL,
	[DOB] [date] NULL,
	[PresentAddress] [nvarchar](50) NULL,
	[PermanentAddress] [nvarchar](50) NULL,
	[Pager] [nvarchar](25) NULL,
	[Fax] [nvarchar](25) NULL,
	[Email] [nvarchar](25) NULL,
	[MaritalStatus] [nvarchar](25) NULL,
	[NumberOfDependents] [int] NULL,
	[Height] [int] NULL,
	[Weight] [float] NULL,
	[BloodType] [nvarchar](5) NULL,
	[Occupation] [nvarchar](25) NULL,
	[AnualIncome] [int] NULL,
	[Vegeterian] [bit] NULL,
	[Smoker] [bit] NULL,
	[AverageCigarettesPerDay] [nvarchar](25) NULL,
	[Alcoholic] [bit] NULL,
	[AverageDrinksPerDay] [nvarchar](25) NULL,
	[StimulantUse] [nvarchar](100) NULL,
	[CoffeeConsumption] [nvarchar](25) NULL,
	[SoftDrinkConsumption] [nvarchar](25) NULL,
	[HasRegularMeals] [nvarchar](25) NULL,
	[MealsLocation] [nvarchar](50) NULL,
	[StatementOfComplaint] [nvarchar](500) NULL,
	[PreviousTreatmentHistory] [nvarchar](500) NULL,
	[PhysicianOrHospitalTreated] [nvarchar](50) NULL,
	[Diabetic] [bit] NULL,
	[Hypertensive] [bit] NULL,
	[CardiacCondition] [nvarchar](50) NULL,
	[RespiratoryCondition] [nvarchar](50) NULL,
	[DigestiveCondition] [nvarchar](50) NULL,
	[OrthopedicCondition] [nvarchar](50) NULL,
	[MuscularCondition] [nvarchar](50) NULL,
	[NeurologicalCondition] [nvarchar](50) NULL,
	[KnownAllergies] [nvarchar](50) NULL,
	[KnownReactionsToSpecificDrugs] [nvarchar](50) NULL,
	[SurgeriesHistory] [nvarchar](100) NULL,
	[isBilled] [bit] NULL,
 CONSTRAINT [PK__Patients__44AED675C6D300D4] PRIMARY KEY CLUSTERED 
(
	[IDPatient] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PatientTelephones]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PatientTelephones](
	[IDPatientTelephone] [int] IDENTITY(1,1) NOT NULL,
	[PatientID] [int] NULL,
	[TelephoneNumber] [nvarchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDPatientTelephone] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Billings] ADD  CONSTRAINT [timestamp]  DEFAULT (getdate()) FOR [InsertDate]
GO
ALTER TABLE [dbo].[Doctors] ADD  DEFAULT (getdate()) FOR [InsertDate]
GO
ALTER TABLE [dbo].[Patients] ADD  CONSTRAINT [billDefault]  DEFAULT ((0)) FOR [isBilled]
GO
ALTER TABLE [dbo].[Billings]  WITH CHECK ADD  CONSTRAINT [FK_DoctorBilling] FOREIGN KEY([DoctorID])
REFERENCES [dbo].[Doctors] ([IDDoctor])
GO
ALTER TABLE [dbo].[Billings] CHECK CONSTRAINT [FK_DoctorBilling]
GO
ALTER TABLE [dbo].[Billings]  WITH CHECK ADD  CONSTRAINT [FK_PatientBilling] FOREIGN KEY([PatientID])
REFERENCES [dbo].[Patients] ([IDPatient])
GO
ALTER TABLE [dbo].[Billings] CHECK CONSTRAINT [FK_PatientBilling]
GO
ALTER TABLE [dbo].[DoctorsPatients]  WITH CHECK ADD FOREIGN KEY([DoctorID])
REFERENCES [dbo].[Doctors] ([IDDoctor])
GO
ALTER TABLE [dbo].[DoctorsPatients]  WITH CHECK ADD  CONSTRAINT [FK__DoctorsPa__Patie__76969D2E] FOREIGN KEY([PatientID])
REFERENCES [dbo].[Patients] ([IDPatient])
GO
ALTER TABLE [dbo].[DoctorsPatients] CHECK CONSTRAINT [FK__DoctorsPa__Patie__76969D2E]
GO
ALTER TABLE [dbo].[NextOfKin]  WITH CHECK ADD  CONSTRAINT [FK__NextOfKin__Patie__5EBF139D] FOREIGN KEY([PatientID])
REFERENCES [dbo].[Patients] ([IDPatient])
GO
ALTER TABLE [dbo].[NextOfKin] CHECK CONSTRAINT [FK__NextOfKin__Patie__5EBF139D]
GO
ALTER TABLE [dbo].[NextOfKinRelationship]  WITH CHECK ADD FOREIGN KEY([NextOfKinID])
REFERENCES [dbo].[NextOfKin] ([IDNextOfKin])
GO
ALTER TABLE [dbo].[NextOfKinTelephones]  WITH CHECK ADD FOREIGN KEY([NextOfKinID])
REFERENCES [dbo].[NextOfKin] ([IDNextOfKin])
GO
ALTER TABLE [dbo].[PatientTelephones]  WITH CHECK ADD  CONSTRAINT [FK__PatientTe__Patie__656C112C] FOREIGN KEY([PatientID])
REFERENCES [dbo].[Patients] ([IDPatient])
GO
ALTER TABLE [dbo].[PatientTelephones] CHECK CONSTRAINT [FK__PatientTe__Patie__656C112C]
GO
/****** Object:  StoredProcedure [dbo].[assignPatientToDoctor]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[assignPatientToDoctor]
@IDPatient int,
@IDDoctor int
AS
BEGIN
INSERT INTO DoctorsPatients(DoctorID, PatientID) VALUES (@IDDoctor,@IDPatient)
END
GO
/****** Object:  StoredProcedure [dbo].[billPatient]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[billPatient]
@IDDoctor int,
@IDPatient int,
@Ammount int
AS
BEGIN
INSERT INTO Billings(DoctorID, PatientID, Ammount) VALUES (@IDDoctor, @IDPatient,@Ammount)
UPDATE Patients set isBilled=1 WHERE IDPatient=@IDPatient
END
GO
/****** Object:  StoredProcedure [dbo].[deleteDoctor]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[deleteDoctor]
@IDDoctor int
AS
BEGIN
--
--DELETE FROM Patients WHERE IDPatient IN (SELECT Billings.PatientID FROM DoctorsPatients as dp INNER JOIN Billings ON dp.DoctorID = Billings.DoctorID WHERE Billings.DoctorID = @IDDoctor)
--
DELETE FROM DoctorsPatients
WHERE DoctorID = @IDDoctor

DELETE FROM Billings WHERE DoctorID = @IDDoctor

DELETE FROM Doctors WHERE IDDoctor = @IDDoctor
END
GO
/****** Object:  StoredProcedure [dbo].[getBilledPatients]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[getBilledPatients]
AS
SELECT 
b.IDBilling,
p.IDPatient, 
p.FirstName as 'FirstNamePat', 
p.LastName as 'LastNamePat', 
d.FirstName, d.LastName, b.Ammount, b.InsertDate FROM Patients as p
INNER JOIN DoctorsPatients as dp
ON dp.PatientID = p.IDPatient
INNER JOIN Doctors as d
ON d.IDDoctor = dp.DoctorID
INNER JOIN Billings as b
ON b.PatientID =  p.IDPatient
WHERE p.isBilled = 1

SELECT * FROM NextOfKinTelephones
GO
/****** Object:  StoredProcedure [dbo].[getDetailedPatientInfo]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[getDetailedPatientInfo]
@IDPatient int
AS
BEGIN
SELECT
p.IDPatient,
p.FirstName, 
p.LastName, 
p.MiddleName, 
p.Sex, 
p.DOB, 
p.PresentAddress, 
p.PermanentAddress, 
p.Pager, 
p.Fax, 
p.Email, 
MaritalStatus, 
NumberOfDependents, 
Height, 
Weight, 
BloodType, 
Occupation, 
AnualIncome, 
Vegeterian, 
Smoker, 
AverageCigarettesPerDay, 
Alcoholic, 
AverageDrinksPerDay, 
StimulantUse, 
CoffeeConsumption,
SoftDrinkConsumption, 
HasRegularMeals, 
MealsLocation, 
StatementOfComplaint, 
PreviousTreatmentHistory, 
PhysicianOrHospitalTreated, 
Diabetic, 
Hypertensive, 
CardiacCondition, 
RespiratoryCondition, 
DigestiveCondition, 
OrthopedicCondition, 
MuscularCondition, 
NeurologicalCondition, 
KnownAllergies, 
KnownReactionsToSpecificDrugs, 
SurgeriesHistory,
pt.TelephoneNumber,
n.IDNextOfKin,
n.FirstName as 'FirstNameNOK',
n.LastName as 'LastNameNOK',
n.MiddleName as 'MiddleNameNOK',
n.Address as 'AddressNOK',
n.Email as 'EmailNOK',
n.Fax as 'FaxNOK',
n.Pager as 'PagerNOK',
n.RelationshipWithPatient,
nt.TelephoneNumber as 'TelephoneNumberNOK',
nt.TelephoneType as 'TelephoneTypeNOK'
FROM Patients as p
LEFT OUTER JOIN PatientTelephones as pt
ON p.IDPatient = pt.PatientID
LEFT OUTER JOIN NextOfKin as n
ON n.PatientID = p.IDPatient
LEFT OUTER JOIN NextOfKinTelephones as nt
ON nt.NextOfKinID = n.IDNextOfKin
WHERE p.IDPatient = @IDPatient
END
GO
/****** Object:  StoredProcedure [dbo].[getDoctors]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[getDoctors]
AS
SELECT * FROM Doctors
GO
/****** Object:  StoredProcedure [dbo].[getnokTelephones]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[getnokTelephones]
@IDNextOfKin int
AS
BEGIN
SELECT * FROM NextOfKinTelephones as n
WHERE n.NextOfKinID = @IDNextOfKin
END
GO
/****** Object:  StoredProcedure [dbo].[getPatientsForDoctor]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[getPatientsForDoctor]
@idDoctor int
AS
BEGIN
SELECT * FROM DoctorsPatients as d
INNER JOIN Patients as p
ON d.PatientID = p.IDPatient
WHERE @idDoctor IN (
SELECT d.DoctorID FROM Patients as P where d.PatientID = p.IDPatient)
END
GO
/****** Object:  StoredProcedure [dbo].[getPatientTelephones]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[getPatientTelephones]
@IDPatient int
AS
BEGIN
SELECT * FROM PatientTelephones as p
WHERE p.PatientID = @IDPatient
END
GO
/****** Object:  StoredProcedure [dbo].[getUnassignedPatients]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[getUnassignedPatients]
AS
BEGIN
SELECT * FROM Patients as p
WHERE p.IDPatient NOT IN (SELECT dp.PatientID FROM DoctorsPatients as dp) AND p.isBilled = 0
END
GO
/****** Object:  StoredProcedure [dbo].[insertDoctor]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[insertDoctor]
@FirstName nvarchar(50),
@LastName nvarchar(50),
@Title nvarchar(50),
@Type nvarchar(50),
@IDDoctor int OUT
AS
BEGIN
INSERT INTO Doctors(FirstName, LastName, Title, Type) VALUES (@FirstName,@LastName,@Title,@Type)
SELECT @IDDoctor = SCOPE_IDENTITY()
END
GO
/****** Object:  StoredProcedure [dbo].[insertNextOfKin]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[insertNextOfKin]
@FistName nvarchar(25),
@LastName nvarchar(25),
@MiddleName nvarchar(25),
@PatientID int,
@Address nvarchar(50),
@Pager nvarchar(50),
@Fax nvarchar(25),
@Email nvarchar(25),
@TelephoneWork nvarchar(20),
@TelephoneHome nvarchar(20),
@Mobile nvarchar(20),
@Relationship nvarchar(25)
AS
BEGIN
	DECLARE @IDNok int
INSERT INTO NextOfKin(FirstName, LastName, MiddleName, PatientID, Address, Pager, Fax, Email, RelationshipWithPatient)
VALUES (@FistName,@LastName,@MiddleName,@PatientID,@Address,@Pager,@Fax,@Email,@Relationship)

SET @IDNok = SCOPE_IDENTITY()

INSERT INTO NextOfKinTelephones(NextOfKinID, TelephoneNumber, TelephoneType) 
VALUES (@IDNok, @TelephoneWork, 'W')

INSERT INTO NextOfKinTelephones(NextOfKinID, TelephoneNumber, TelephoneType) 
VALUES (@IDNok, @TelephoneHome, 'H')
END
GO
/****** Object:  StoredProcedure [dbo].[insertPatient]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[insertPatient]
@FirstName nvarchar(max),
@LastName nvarchar(max),
@MiddleName nvarchar(max),
@Sex char,
@DOB Date,
@PresentAddress nvarchar(max),
@PermanentAddress nvarchar(max),
@Pager nvarchar(max),
@Fax nvarchar(max),
@Email nvarchar(max),
@MaritalStatus nvarchar(max),
@NumberOfDependents int,
@Height int,
@Weight int,
@BloodType nvarchar(5),
@Occupation nvarchar(25), 
@AnualIncome int, 
@Vegeterian bit, 
@Smoker bit, 
@AverageCigarettesPerDay nvarchar(25), 
@Alcoholic bit, 
@AverageDrinksPerDay nvarchar(25), 
@StimulantUse nvarchar(100), 
@CoffeeConsumption nvarchar(25),
@SoftDrinkConsumption nvarchar(25), 
@HasRegularMeals nvarchar(25), 
@MealsLocation nvarchar(50), 
@StatementOfComplaint nvarchar(500), 
@PreviousTreatmentHistory nvarchar(500), 
@PhysicianOrHospitalTreated nvarchar(50), 
@Diabetic bit, 
@Hypertensive bit, 
@CardiacCondition nvarchar(50), 
@RespiratoryCondition nvarchar(50), 
@DigestiveCondition nvarchar(50), 
@OrthopedicCondition nvarchar(50), 
@MuscularCondition nvarchar(50), 
@NeurologicalCondition nvarchar(50), 
@KnownAllergies nvarchar(50), 
@KnownReactionsToSpecificDrugs nvarchar(50), 
@SurgeriesHistory nvarchar(100),
@IDPatient int OUT
AS
BEGIN
INSERT INTO Patients
(FirstName, 
LastName, 
MiddleName, 
Sex, 
DOB, 
PresentAddress, 
PermanentAddress, 
Pager, 
Fax, 
Email, 
MaritalStatus, 
NumberOfDependents, 
Height, 
Weight, 
BloodType, 
Occupation, 
AnualIncome, 
Vegeterian, 
Smoker, 
AverageCigarettesPerDay, 
Alcoholic, 
AverageDrinksPerDay, 
StimulantUse, 
CoffeeConsumption,
SoftDrinkConsumption, 
HasRegularMeals, 
MealsLocation, 
StatementOfComplaint, 
PreviousTreatmentHistory, 
PhysicianOrHospitalTreated, 
Diabetic, 
Hypertensive, 
CardiacCondition, 
RespiratoryCondition, 
DigestiveCondition, 
OrthopedicCondition, 
MuscularCondition, 
NeurologicalCondition, 
KnownAllergies, 
KnownReactionsToSpecificDrugs, 
SurgeriesHistory
)
VALUES
(@FirstName, 
@LastName, 
@MiddleName, 
@Sex, 
@DOB, 
@PresentAddress, 
@PermanentAddress, 
@Pager, 
@Fax, 
@Email, 
@MaritalStatus, 
@NumberOfDependents, 
@Height, 
@Weight, 
@BloodType, 
@Occupation, 
@AnualIncome, 
@Vegeterian, 
@Smoker, 
@AverageCigarettesPerDay, 
@Alcoholic, 
@AverageDrinksPerDay, 
@StimulantUse, 
@CoffeeConsumption,
@SoftDrinkConsumption, 
@HasRegularMeals, 
@MealsLocation, 
@StatementOfComplaint, 
@PreviousTreatmentHistory, 
@PhysicianOrHospitalTreated, 
@Diabetic, 
@Hypertensive, 
@CardiacCondition, 
@RespiratoryCondition, 
@DigestiveCondition, 
@OrthopedicCondition, 
@MuscularCondition, 
@NeurologicalCondition, 
@KnownAllergies, 
@KnownReactionsToSpecificDrugs, 
@SurgeriesHistory)
SELECT @IDPatient = SCOPE_IDENTITY()
RETURN
END
GO
/****** Object:  StoredProcedure [dbo].[updateDoctor]    Script Date: 4.9.2018. 10:14:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[updateDoctor]
@FirstName nvarchar(50),
@LastName nvarchar(50),
@Title nvarchar(50),
@Type nvarchar(50),
@IDDoctor int
AS
BEGIN
UPDATE Doctors SET FirstName = @FirstName, LastName = @LastName, Title = @Title, Type = @Type WHERE IDDoctor = @IDDoctor
END
GO
USE [master]
GO
ALTER DATABASE [VirgoHospital] SET  READ_WRITE 
GO
