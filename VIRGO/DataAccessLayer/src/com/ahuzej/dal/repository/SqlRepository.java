/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej.dal.repository;

import com.ahuzej.ConditionDetails;
import com.ahuzej.ContactInfo;
import com.ahuzej.Doctor;
import com.ahuzej.Doctor.DoctorType;
import com.ahuzej.NextOfKin;
import com.ahuzej.Patient;
import com.ahuzej.PersonalDetails;
import com.ahuzej.dal.sql.DataSourceSingleton;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 *
 * @author Albert
 */
public class SqlRepository implements IRepository {

    private static final String GET_DOCTORS = "{ CALL getDoctors }";
    private static final String INSERT_NEXTOFKIN = "{ CALL insertNextOfKin (?,?,?,?,?,?,?,?,?,?,?,?) }";
    private static final String GET_BILLS = "{ CALL getBilledPatients }";
    private static final String GET_DOCTOR = "{ CALL getDoctor (?) }";
    private static final String INSERT_DOCTOR = "{ CALL insertDoctor (?,?,?,?,?) }";
    private static final String INSERT_PATIENT = "{ CALL insertPatient (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) }";
    private static final String GET_UNASSIGNED_PATIENTS = "{ CALL getUnassignedPatients }";
    private static final String GET_DETAILED_PATIENT_INFO = "{ CALL getDetailedPatientInfo (?) }";
    private static final String UPDATE_DOCTOR = "{ CALL updateDoctor (?,?,?,?,?) }";
    private static final String DELETE_DOCTOR = "{ CALL deleteDoctor (?) }";
    private static final String GET_PATIENT_TELEPHONES = "{ CALL getPatientTelephones (?) }";
    private static final String GET_NOK_TELEPHONES = "{ CALL getNokTelephones (?) }";
    private static final String GET_PATIENTS_FOR_DOCTOR = "{ CALL getPatientsForDoctor (?) }";
    private static final String ASSIGN_PATIENT_TO_DOCTOR = "{ CALL assignPatientToDoctor (?,?) }";
    private static final String BILL_PATIENT = "{ CALL billPatient (?,?,?) }";

    @Override
    public int insertDoctor(Doctor doctor) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement statement = con.prepareCall(INSERT_DOCTOR);
             ){
            statement.setString(1, doctor.getFirstName());
            statement.setString(2, doctor.getLastName());
            statement.setString(3, doctor.getTitle());
            statement.setString(4, doctor.getType().toString());
            statement.registerOutParameter(5, Types.INTEGER);

            statement.executeUpdate();
            return statement.getInt(5);
            
        } catch (Exception ex) {
            Logger.getLogger(SqlRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public void updateDoctor(Doctor dummy, int idDoctor) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement statement = con.prepareCall(UPDATE_DOCTOR);
             ){
            statement.setString(1, dummy.getFirstName());
            statement.setString(2, dummy.getLastName());
            statement.setString(3, dummy.getTitle());
            statement.setString(4, dummy.getType().toString());
            statement.setInt(5, idDoctor);

            statement.executeUpdate();
            
        } catch (Exception ex) {
            Logger.getLogger(SqlRepository.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public void deleteDoctor(int idDoctor) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement statement = con.prepareCall(DELETE_DOCTOR);
             ){
            statement.setInt(1, idDoctor);

            statement.executeUpdate();
            
        } catch (Exception ex) {
            Logger.getLogger(SqlRepository.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }

    @Override
    public Doctor getDoctor(int idDoctor) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement statement = con.prepareCall(GET_DOCTOR);
             ){
            
            statement.setInt(1, idDoctor);
            try(ResultSet resultSet = statement.executeQuery()) {
                
                if(resultSet.next()) {
                    return new Doctor(resultSet.getInt("IDDoctor"),
                            resultSet.getString("FirstName"),
                            resultSet.getString("LastName"),
                            resultSet.getString("Title"),
                            null,
                            DoctorType.valueOf(resultSet.getString("Type")
                    ));
                }
                
            }
            
        } catch (Exception ex) {
            Logger.getLogger(SqlRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;    
    }

    @Override
    public List<Doctor> getDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement statement = con.prepareCall(GET_DOCTORS);
             ResultSet resultSet = statement.executeQuery()){
            
            while(resultSet.next()) {
                
                doctors.add(
                        new Doctor(
                                resultSet.getInt("IDDoctor"),
                                resultSet.getString("FirstName"),
                                resultSet.getString("LastName"),
                                resultSet.getString("Title"),
                                null, 
                                DoctorType.valueOf(resultSet.getString("Type")
                                )
                        ));
            }
            return doctors;
            
        } catch (Exception ex) {
            Logger.getLogger(SqlRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return doctors;
    }

    @Override
    public List<Doctor> getPatients() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Patient> getPatientsForDoctor(int idDoctor) {
        List<Patient> patients = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement statement = con.prepareCall(GET_PATIENTS_FOR_DOCTOR);
             ){
            
            statement.setInt(1, idDoctor);
            try(ResultSet resultSet = statement.executeQuery()) {
                
                while(resultSet.next()) {
                    patients.add(new Patient(resultSet.getInt("IDPatient"),
                            resultSet.getString("FirstName"),
                            resultSet.getString("LastName"),
                            resultSet.getBoolean("isBilled")
                    ));
                }
                
                return patients;
                
            }
            
        } catch (Exception ex) {
            Logger.getLogger(SqlRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public int insertPatient(Patient patient) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement statement = con.prepareCall(INSERT_PATIENT);
             ){
            statement.setString(1, patient.getFirstName());
            statement.setString(2, patient.getLastName());
            statement.setString(3, patient.getMiddleName());
            statement.setString(4, String.valueOf(patient.getSex()));
            statement.setDate(5, new java.sql.Date(patient.getDateOfBirth().getTime()));
            statement.setString(6,  patient.getContact().getAddresses()[0]);            
            statement.setString(7,  patient.getContact().getAddresses()[1]);
            statement.setString(8, patient.getContact().getPager());
            statement.setString(9, patient.getContact().getFax());
            statement.setString(10, patient.getContact().getEmail());
            
            statement.setString(11, patient.getPersonalDetails().getMaritalStatus());
            statement.setInt(12, patient.getPersonalDetails().getNumberOfDependents());
            statement.setInt(13, patient.getPersonalDetails().getHeight());
            statement.setDouble(14, patient.getPersonalDetails().getWeight());
            statement.setString(15, patient.getPersonalDetails().getBloodType());
            statement.setString(16, patient.getPersonalDetails().getOccupation());
            statement.setInt(17, patient.getPersonalDetails().getAnnualIncome());
            statement.setBoolean(18, patient.getPersonalDetails().getVegeterian());
            statement.setBoolean(19, patient.getPersonalDetails().getIsSmoking());
            statement.setString(20, patient.getPersonalDetails().getAverageCigarettesPerDay());
            statement.setBoolean(21, patient.getPersonalDetails().getIsDrinking());
            statement.setString(22, patient.getPersonalDetails().getAverageDrinksPerDay());
            statement.setString(23, patient.getPersonalDetails().getStimulantUse());
            statement.setString(24, patient.getPersonalDetails().getCoffeeConsumption());
            statement.setString(25, patient.getPersonalDetails().getSoftDrinkConsumption());
            statement.setString(26, patient.getPersonalDetails().getHasRegularMeals());
            statement.setString(27, patient.getPersonalDetails().getMealsLocation());
            statement.setString(28, patient.getConditionDetails().getStatementOfComplaint());
            statement.setString(29, patient.getConditionDetails().getPreviousTreatmentHistory());
            statement.setString(30, patient.getConditionDetails().getPhysicianOrHospitalTreated());
            statement.setBoolean(31, patient.getConditionDetails().getDiabetic());
            statement.setBoolean(32, patient.getConditionDetails().getHypertensive());
            statement.setString(33, patient.getConditionDetails().getCardiacCondition());
            statement.setString(34, patient.getConditionDetails().getRespiratoryCondition());
            statement.setString(35, patient.getConditionDetails().getDigestiveCondition());
            statement.setString(36, patient.getConditionDetails().getOrthopedicCondition());
            statement.setString(37, patient.getConditionDetails().getMuscularCondition());
            statement.setString(38, patient.getConditionDetails().getNeurologicalCondition());
            statement.setString(39, patient.getConditionDetails().getKnownAllergies());
            statement.setString(40, patient.getConditionDetails().getKnownReactionsToSpecificDrugs());
            statement.setString(41, patient.getConditionDetails().getSurgeriesHistory());
            //statement.setString(4, patient.getType().toString());
            statement.registerOutParameter(42, Types.INTEGER);
            
            statement.executeUpdate();
            insertNextOfKin(patient.getNextOfKin(),statement.getInt(42));
            return statement.getInt(42);
            
        } catch (Exception ex) {
            Logger.getLogger(SqlRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public List<Patient> getUnassignedPatients() {
        List<Patient> patients = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement statement = con.prepareCall(GET_UNASSIGNED_PATIENTS);
             ResultSet resultSet = statement.executeQuery()){
            
            while(resultSet.next()) {
                String[] telephones = getTelephones(resultSet.getInt("IDPatient"), 'P');
                ContactInfo patientInfo = new ContactInfo(
                                            resultSet.getString("Email"),
                                            resultSet.getString("Pager"),
                                            resultSet.getString("Fax"),
                                            telephones,
                                            new String[]{resultSet.getString("PresentAddress"),resultSet.getString("PermanentAddress")});
                
                ConditionDetails conditionDetails = new ConditionDetails.ConditionDetaisBuilder()
                        .setCardiacCondition(resultSet.getString("CardiacCondition"))
                        .setDiabetic(resultSet.getBoolean("Diabetic"))
                        .setDigestiveCondition(resultSet.getString("DigestiveCondition"))
                        .setHypertensive(resultSet.getBoolean("Hypertensive"))
                        .setKnownAllergies(resultSet.getString("KnownAllergies"))
                        .setKnownReactionsToSpecificDrugs(resultSet.getString("KnownReactionsToSpecificDrugs"))
                        .setMuscularCondition(resultSet.getString("MuscularCondition"))
                        .setNeurologicalCondition(resultSet.getString("NeurologicalCondition"))
                        .setOrthopedicCondition(resultSet.getString("OrthopedicCondition"))
                        .setPhysicianOrHospitalTreated(resultSet.getString("PhysicianOrHospitalTreated"))
                        .setPreviousTreatmentHistory(resultSet.getString("PreviousTreatmentHistory"))
                        .setRespiratoryCondition(resultSet.getString("RespiratoryCondition"))
                        .setStatementOfComplaint(resultSet.getString("StatementOfComplaint"))
                        .setSurgeriesHistory(resultSet.getString("SurgeriesHistory"))
                        .build();
                
                PersonalDetails personalDetails = new PersonalDetails.PersonalDetailsBuilder()
                        .setAnnualIncome(resultSet.getInt("AnualIncome"))
                        .setAverageCigarettesPerDay(resultSet.getString("AverageCigarettesPerDay"))
                        .setAverageDrinksPerDay(resultSet.getString("AverageDrinksPerDay"))
                        .setBloodType(resultSet.getString("BloodType"))
                        .setCoffeeConsumption(resultSet.getString("CoffeeConsumption"))
                        .setHasRegularMeals(resultSet.getString("HasRegularMeals"))
                        .setHeight(resultSet.getInt("Height"))
                        .setIsDrinking(resultSet.getBoolean("Alcoholic"))
                        .setIsSmoking(resultSet.getBoolean("Smoker"))
                        .setMaritalStatus(resultSet.getString("MaritalStatus"))
                        .setMealsLocation(resultSet.getString("MealsLocation"))
                        .setNumberOfDependents(resultSet.getInt("NumberOfDependents"))
                        .setOccupation(resultSet.getString("Occupation"))
                        .setSoftDrinkConsumption(resultSet.getString("SoftDrinkConsumption"))
                        .setStimulantUse(resultSet.getString("StimulantUse"))
                        .setVegeterian(resultSet.getBoolean("Vegeterian"))
                        .setWeight(resultSet.getInt("Weight"))
                        .build();
                if(resultSet.getString("Sex") != null) {
                        Patient p = new Patient(
                        resultSet.getInt("IDPatient"),
                        resultSet.getString("FirstName"), 
                        resultSet.getString("LastName"), 
                        resultSet.getString("MiddleName"), 
                        resultSet.getDate("DOB"), 
                        patientInfo, 
                        resultSet.getString("Sex").charAt(0), 
                        personalDetails, conditionDetails);   
                        patients.add(p);
                }
                else {
                    
                }
                
                
            }
            return patients;
            
        } catch (Exception ex) {
            Logger.getLogger(SqlRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return patients;
    }
    
    private String[] getTelephones(int idPatient, char person) {
        String[] telephones = new String[3];
        int index=0;
        DataSource dataSource = DataSourceSingleton.getInstance();
        switch(person) {
            case 'P':
                try (Connection con = dataSource.getConnection();
             CallableStatement statement = con.prepareCall(GET_PATIENT_TELEPHONES);
             ){
            
            statement.setInt(1, idPatient);
            try(ResultSet resultSet = statement.executeQuery()) {
                
                while(resultSet.next()) {
                    telephones[index++] = resultSet.getString("TelephoneNumber");
                }
                
            }
            return telephones;
            
        } catch (Exception ex) {
            Logger.getLogger(SqlRepository.class.getName()).log(Level.SEVERE, null, ex);
        }    
            break;
            case 'N':
            try (Connection con = dataSource.getConnection();
             CallableStatement statement = con.prepareCall(GET_NOK_TELEPHONES);
             ){
            
            statement.setInt(1, idPatient);
            try(ResultSet resultSet = statement.executeQuery()) {
                
                while(resultSet.next()) {
                    telephones[index++] = resultSet.getString("TelephoneNumber");
                }
                
            }
            return telephones;
            
        } catch (Exception ex) {
            Logger.getLogger(SqlRepository.class.getName()).log(Level.SEVERE, null, ex);
        }        
                break;
            default:
                break;
        }
        
        return null;   
    }

    @Override
    public void assignPatientToDoctor(int idPatient, int idDoctor) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement statement = con.prepareCall(ASSIGN_PATIENT_TO_DOCTOR);
             ){
            statement.setInt(2, idDoctor);
            statement.setInt(1, idPatient);

            statement.executeUpdate();
            
        } catch (Exception ex) {
            Logger.getLogger(SqlRepository.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void billPatient(int idDoctor, int idPatient, int ammount) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement statement = con.prepareCall(BILL_PATIENT);
             ){
            statement.setInt(1, idDoctor);
            statement.setInt(2, idPatient);
            statement.setInt(3, ammount);
            statement.executeUpdate();
            
        } catch (Exception ex) {
            Logger.getLogger(SqlRepository.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    @Override
    public List<String> getBillHistory() {
        List<String> bills = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement statement = con.prepareCall(GET_BILLS);
             ResultSet resultSet = statement.executeQuery()){
            
            while(resultSet.next()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bill ").append(resultSet.getInt("IDBilling"))
                        .append(": Patient ")
                        .append(resultSet.getString("FirstNamePat"))
                        .append(" ")
                        .append(resultSet.getString("LastNamePat"))
                        .append(", Doctor ")
                        .append(resultSet.getString("FirstName"))
                        .append(" ")
                        .append(resultSet.getString("LastName"))
                        .append(", Amount: ")
                        .append(resultSet.getInt("Ammount"))
                        .append("$ ")
                        .append("Date: ")
                        .append(resultSet.getDate("InsertDate"));
                bills.add(sb.toString());
                /*doctors.add(
                        new Doctor(
                                resultSet.getInt("IDDoctor"),
                                resultSet.getString("FirstName"),
                                resultSet.getString("LastName"),
                                resultSet.getString("Title"),
                                null, 
                                DoctorType.valueOf(resultSet.getString("Type")
                                )
                        ));*/
            }
            return bills;
            
        } catch (Exception ex) {
            Logger.getLogger(SqlRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Patient getPatient(int idPatient) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement statement = con.prepareCall(GET_DETAILED_PATIENT_INFO);
             ){
            
            statement.setInt(1, idPatient);
            try(ResultSet resultSet = statement.executeQuery()) {
                if(resultSet.next()) {
                
                String[] telephones = getTelephones(idPatient, 'P');
                String[] telephonesNok = getTelephones(resultSet.getInt("IDNextOfKin"), 'N');
                ContactInfo patientInfo = new ContactInfo(
                                            resultSet.getString("Email"),
                                            resultSet.getString("Pager"),
                                            resultSet.getString("Fax"),
                                            telephones,
                                            new String[]{resultSet.getString("PresentAddress"),resultSet.getString("PermanentAddress")});
                
                ContactInfo nokInfo = new ContactInfo(
                                            resultSet.getString("EmailNOK"),
                                            resultSet.getString("PagerNOK"),
                                            resultSet.getString("FaxNOK"),
                                            telephonesNok,
                                            new String[]{resultSet.getString("AddressNOK")});
                
                ConditionDetails conditionDetails = new ConditionDetails.ConditionDetaisBuilder()
                        .setCardiacCondition(resultSet.getString("CardiacCondition"))
                        .setDiabetic(resultSet.getBoolean("Diabetic"))
                        .setDigestiveCondition(resultSet.getString("DigestiveCondition"))
                        .setHypertensive(resultSet.getBoolean("Hypertensive"))
                        .setKnownAllergies(resultSet.getString("KnownAllergies"))
                        .setKnownReactionsToSpecificDrugs(resultSet.getString("KnownReactionsToSpecificDrugs"))
                        .setMuscularCondition(resultSet.getString("MuscularCondition"))
                        .setNeurologicalCondition(resultSet.getString("NeurologicalCondition"))
                        .setOrthopedicCondition(resultSet.getString("OrthopedicCondition"))
                        .setPhysicianOrHospitalTreated(resultSet.getString("PhysicianOrHospitalTreated"))
                        .setPreviousTreatmentHistory(resultSet.getString("PreviousTreatmentHistory"))
                        .setRespiratoryCondition(resultSet.getString("RespiratoryCondition"))
                        .setStatementOfComplaint(resultSet.getString("StatementOfComplaint"))
                        .setSurgeriesHistory(resultSet.getString("SurgeriesHistory"))
                        .build();
                
                PersonalDetails personalDetails = new PersonalDetails.PersonalDetailsBuilder()
                        .setAnnualIncome(resultSet.getInt("AnualIncome"))
                        .setAverageCigarettesPerDay(resultSet.getString("AverageCigarettesPerDay"))
                        .setAverageDrinksPerDay(resultSet.getString("AverageDrinksPerDay"))
                        .setBloodType(resultSet.getString("BloodType"))
                        .setCoffeeConsumption(resultSet.getString("CoffeeConsumption"))
                        .setHasRegularMeals(resultSet.getString("HasRegularMeals"))
                        .setHeight(resultSet.getInt("Height"))
                        .setIsDrinking(resultSet.getBoolean("Alcoholic"))
                        .setIsSmoking(resultSet.getBoolean("Smoker"))
                        .setMaritalStatus(resultSet.getString("MaritalStatus"))
                        .setMealsLocation(resultSet.getString("MealsLocation"))
                        .setNumberOfDependents(resultSet.getInt("NumberOfDependents"))
                        .setOccupation(resultSet.getString("Occupation"))
                        .setSoftDrinkConsumption(resultSet.getString("SoftDrinkConsumption"))
                        .setStimulantUse(resultSet.getString("StimulantUse"))
                        .setVegeterian(resultSet.getBoolean("Vegeterian"))
                        .setWeight(resultSet.getInt("Weight"))
                        .build();
                
                NextOfKin nok = new NextOfKin(resultSet.getString("FirstNameNOK"), 
                        resultSet.getString("LastNameNOK"), 
                        resultSet.getString("MiddleNameNOK"), 
                        nokInfo, 
                        resultSet.getString("RelationshipWithPatient"));
                
                if(resultSet.getString("Sex") != null) {
                        Patient p = new Patient(
                        resultSet.getInt("IDPatient"),
                        resultSet.getString("FirstName"), 
                        resultSet.getString("LastName"), 
                        resultSet.getString("MiddleName"), 
                        resultSet.getDate("DOB"), 
                        patientInfo, 
                        resultSet.getString("Sex").charAt(0), 
                        personalDetails, conditionDetails,nok);   
                        return p;
                        
                }
                else {
                       Patient p = new Patient(
                        resultSet.getInt("IDPatient"),
                        resultSet.getString("FirstName"), 
                        resultSet.getString("LastName"), 
                        resultSet.getString("MiddleName"), 
                        resultSet.getDate("DOB"), 
                        patientInfo, 
                        'M', 
                        personalDetails, conditionDetails,nok);   
                        return p; 
                }
                    
            }
                
                
            }
            
        } catch (Exception ex) {
            Logger.getLogger(SqlRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;  
    }

    private void insertNextOfKin(NextOfKin nextOfKin, int idPatient) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement statement = con.prepareCall(INSERT_NEXTOFKIN);
             ){
            statement.setString(1, nextOfKin.getFirstName());
            statement.setString(2, nextOfKin.getLastName());
            statement.setString(3, nextOfKin.getMiddleName());
            statement.setInt(4, idPatient);
            statement.setString(5, nextOfKin.getContact().getAddresses()[0]);
            statement.setString(6, nextOfKin.getContact().getPager());
            statement.setString(7, nextOfKin.getContact().getFax());
            statement.setString(8, nextOfKin.getContact().getEmail());
            statement.setString(9, nextOfKin.getContact().getPhones()[0]);
            statement.setString(10, nextOfKin.getContact().getPhones()[1]);
            statement.setString(11, nextOfKin.getContact().getPhones()[2]);
            statement.setString(12, nextOfKin.getRelationshipWithPatient());
            //statement.registerOutParameter(6, Types.INTEGER);

            statement.executeUpdate();
            
        } catch (Exception ex) {
            Logger.getLogger(SqlRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
