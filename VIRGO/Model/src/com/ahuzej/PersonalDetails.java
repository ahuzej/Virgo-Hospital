/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej;

/**
 *
 * @author User
 */
public class PersonalDetails {
    private final String MaritalStatus;
    private final int NumberOfDependents;
    private final int Height;
    private final double Weight;
    private final String BloodType;
    private final String Occupation;
    private final int AnnualIncome;
    private final Boolean Vegeterian;
    private final Boolean IsSmoking;
    private final String AverageCigarettesPerDay;
    private final Boolean IsDrinking;
    private final String AverageDrinksPerDay;
    private final String StimulantUse;
    private final String CoffeeConsumption;
    private final String SoftDrinkConsumption;
    private final String HasRegularMeals;
    private final String MealsLocation;

    public String getMaritalStatus() {
        return MaritalStatus;
    }

    public int getNumberOfDependents() {
        return NumberOfDependents;
    }

    public int getHeight() {
        return Height;
    }

    public double getWeight() {
        return Weight;
    }

    public String getBloodType() {
        return BloodType;
    }

    public String getOccupation() {
        return Occupation;
    }

    public int getAnnualIncome() {
        return AnnualIncome;
    }

    public Boolean getVegeterian() {
        return Vegeterian;
    }

    public Boolean getIsSmoking() {
        return IsSmoking;
    }

    public String getAverageCigarettesPerDay() {
        return AverageCigarettesPerDay;
    }

    public Boolean getIsDrinking() {
        return IsDrinking;
    }

    public String getAverageDrinksPerDay() {
        return AverageDrinksPerDay;
    }

    public String getStimulantUse() {
        return StimulantUse;
    }

    public String getCoffeeConsumption() {
        return CoffeeConsumption;
    }

    public String getSoftDrinkConsumption() {
        return SoftDrinkConsumption;
    }

    public String getHasRegularMeals() {
        return HasRegularMeals;
    }

    public String getMealsLocation() {
        return MealsLocation;
    }
    
    private PersonalDetails(PersonalDetailsBuilder b) {
        this.MaritalStatus = b.MaritalStatus;
        this.NumberOfDependents = b.NumberOfDependents;
        this.Height = b.Height;
        this.Weight = b.Weight;
        this.BloodType = b.BloodType;
        this.Occupation = b.Occupation;
        this.AnnualIncome = b.AnnualIncome;
        this.Vegeterian = b.Vegeterian;
        this.IsSmoking = b.IsSmoking;
        this.AverageCigarettesPerDay = b.AverageCigarettesPerDay;
        this.IsDrinking = b.IsDrinking;
        this.AverageDrinksPerDay = b.AverageDrinksPerDay;
        this.StimulantUse = b.StimulantUse;
        this.CoffeeConsumption = b.CoffeeConsumption;
        this.SoftDrinkConsumption = b.SoftDrinkConsumption;
        this.HasRegularMeals = b.HasRegularMeals;
        this.MealsLocation = b.MealsLocation;
    }
    
    public static class PersonalDetailsBuilder {
    
    private String MaritalStatus;
    private int NumberOfDependents;
    private int Height;
    private double Weight;
    private String BloodType;
    private String Occupation;
    private int AnnualIncome;
    private Boolean Vegeterian;
    private Boolean IsSmoking;
    private String AverageCigarettesPerDay;
    private Boolean IsDrinking;
    private String AverageDrinksPerDay;
    private String StimulantUse;
    private String CoffeeConsumption;
    private String SoftDrinkConsumption;
    private String HasRegularMeals;
    private String MealsLocation;

        public PersonalDetailsBuilder setMaritalStatus(String MaritalStatus) {
            this.MaritalStatus = MaritalStatus;
            return this;
        }

        public PersonalDetailsBuilder setNumberOfDependents(int NumberOfDependents) {
            this.NumberOfDependents = NumberOfDependents;
            return this;
        }

        public PersonalDetailsBuilder setHeight(int Height) {
            this.Height = Height;
            return this;
        }

        public PersonalDetailsBuilder setWeight(double Weight) {
            this.Weight = Weight;
            return this;
        }

        public PersonalDetailsBuilder setBloodType(String BloodType) {
            this.BloodType = BloodType;
            return this;
        }

        public PersonalDetailsBuilder setOccupation(String Occupation) {
            this.Occupation = Occupation;
            return this;
        }

        public PersonalDetailsBuilder setAnnualIncome(int AnnualIncome) {
            this.AnnualIncome = AnnualIncome;
            return this;
        }

        public PersonalDetailsBuilder setVegeterian(Boolean Vegeterian) {
            this.Vegeterian = Vegeterian;
            return this;
        }

        public PersonalDetailsBuilder setIsSmoking(Boolean IsSmoking) {
            this.IsSmoking = IsSmoking;
            return this;
        }

        public PersonalDetailsBuilder setAverageCigarettesPerDay(String AverageCigarettesPerDay) {
            this.AverageCigarettesPerDay = AverageCigarettesPerDay;
            return this;
        }

        public PersonalDetailsBuilder setIsDrinking(Boolean IsDrinking) {
            this.IsDrinking = IsDrinking;
            return this;
        }

        public PersonalDetailsBuilder setAverageDrinksPerDay(String AverageDrinksPerDay) {
            this.AverageDrinksPerDay = AverageDrinksPerDay;
            return this;
        }

        public PersonalDetailsBuilder setStimulantUse(String StimulantUse) {
            this.StimulantUse = StimulantUse;
            return this;
        }

        public PersonalDetailsBuilder setCoffeeConsumption(String CoffeeConsumption) {
            this.CoffeeConsumption = CoffeeConsumption;
            return this;
        }

        public PersonalDetailsBuilder setSoftDrinkConsumption(String SoftDrinkConsumption) {
            this.SoftDrinkConsumption = SoftDrinkConsumption;
            return this;
        }

        public PersonalDetailsBuilder setHasRegularMeals(String HasRegularMeals) {
            this.HasRegularMeals = HasRegularMeals;
            return this;
        }

        public PersonalDetailsBuilder setMealsLocation(String MealsLocation) {
            this.MealsLocation = MealsLocation;
            return this;
        }
        
        public PersonalDetails build() {
            return new PersonalDetails(this);
        }
    
    
    
    
}
    /*private String StatementOfComplaint;
    private String PreviousTreatmentHistory;
    private String PhysicianOrHospitalTreated;
    private String Diabetic;
    private String Hypertensive;
    private String CardiacCondition;
    private String RespiratoryCondition;
    private String DigestiveCondition;
    private String OrthopedicCondition;
    private String MuscularCondition;
    private String NeurologicalCondition;
    private String KnownAllergies;
    private String KnownReactionsToSpecificDrugs;
    private String SurgeriesHistory;*/
}
