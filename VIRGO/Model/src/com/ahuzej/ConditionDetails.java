/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej;

/**
 *
 * @author Albert
 */
public class ConditionDetails {
    
    private final String StatementOfComplaint;
    private final String PreviousTreatmentHistory;
    private final String PhysicianOrHospitalTreated;
    private final Boolean Diabetic;
    private final Boolean Hypertensive;
    private final String CardiacCondition;
    private final String RespiratoryCondition;
    private final String DigestiveCondition;
    private final String OrthopedicCondition;
    private final String MuscularCondition;
    private final String NeurologicalCondition;
    private final String KnownAllergies;
    private final String KnownReactionsToSpecificDrugs;
    private final String SurgeriesHistory;

    public String getStatementOfComplaint() {
        return StatementOfComplaint;
    }

    public String getPreviousTreatmentHistory() {
        return PreviousTreatmentHistory;
    }

    public String getPhysicianOrHospitalTreated() {
        return PhysicianOrHospitalTreated;
    }

    public Boolean getDiabetic() {
        return Diabetic;
    }

    public Boolean getHypertensive() {
        return Hypertensive;
    }

    public String getCardiacCondition() {
        return CardiacCondition;
    }

    public String getRespiratoryCondition() {
        return RespiratoryCondition;
    }

    public String getDigestiveCondition() {
        return DigestiveCondition;
    }

    public String getOrthopedicCondition() {
        return OrthopedicCondition;
    }

    public String getMuscularCondition() {
        return MuscularCondition;
    }

    public String getNeurologicalCondition() {
        return NeurologicalCondition;
    }

    public String getKnownAllergies() {
        return KnownAllergies;
    }

    public String getKnownReactionsToSpecificDrugs() {
        return KnownReactionsToSpecificDrugs;
    }

    public String getSurgeriesHistory() {
        return SurgeriesHistory;
    }
    
    private ConditionDetails(ConditionDetaisBuilder b) {
        this.CardiacCondition = b.CardiacCondition;
        this.Diabetic = b.Diabetic;
        this.DigestiveCondition = b.DigestiveCondition;
        this.Hypertensive = b.Hypertensive;
        this.KnownAllergies = b.KnownAllergies;
        this.KnownReactionsToSpecificDrugs = b.KnownReactionsToSpecificDrugs;
        this.MuscularCondition = b.MuscularCondition;
        this.NeurologicalCondition = b.NeurologicalCondition;
        this.OrthopedicCondition = b.OrthopedicCondition;
        this.PhysicianOrHospitalTreated = b.PhysicianOrHospitalTreated;
        this.PreviousTreatmentHistory = b.PreviousTreatmentHistory;
        this.RespiratoryCondition = b.RespiratoryCondition;
        this.StatementOfComplaint = b.StatementOfComplaint;
        this.SurgeriesHistory = b.SurgeriesHistory;
    }
    
    public static class ConditionDetaisBuilder {
        
    private String StatementOfComplaint;
    private String PreviousTreatmentHistory;
    private String PhysicianOrHospitalTreated;
    private Boolean Diabetic;
    private Boolean Hypertensive;
    private String CardiacCondition;
    private String RespiratoryCondition;
    private String DigestiveCondition;
    private String OrthopedicCondition;
    private String MuscularCondition;
    private String NeurologicalCondition;
    private String KnownAllergies;
    private String KnownReactionsToSpecificDrugs;
    private String SurgeriesHistory;
    
    public ConditionDetaisBuilder setStatementOfComplaint(String newStatementOfComplaint) {
        this.StatementOfComplaint = newStatementOfComplaint;
        return this;
    }
    
    public ConditionDetaisBuilder setPreviousTreatmentHistory(String newPreviousTreatmentHistory) {
        this.PreviousTreatmentHistory = newPreviousTreatmentHistory;
        return this;
    }
        
    public ConditionDetaisBuilder setPhysicianOrHospitalTreated(String newPhysicianOrHospitalTreated) {
        this.PhysicianOrHospitalTreated = newPhysicianOrHospitalTreated;
        return this;
    }
        
    public ConditionDetaisBuilder setDiabetic(Boolean newDiabetic) {
        this.Diabetic = newDiabetic;
        return this;
    }
    
    public ConditionDetaisBuilder setHypertensive(Boolean newHypertensive) {
        this.Hypertensive = newHypertensive;
        return this;
    }
        
    public ConditionDetaisBuilder setCardiacCondition(String newCardiacCondition) {
        this.CardiacCondition = newCardiacCondition;
        return this;
    }
            
    public ConditionDetaisBuilder setRespiratoryCondition(String newRespiratoryCondition) {
        this.RespiratoryCondition = newRespiratoryCondition;
        return this;
    }
    
    public ConditionDetaisBuilder setDigestiveCondition(String newDigestiveCondition) {
        this.DigestiveCondition = newDigestiveCondition;
        return this;
    }
        
    public ConditionDetaisBuilder setOrthopedicCondition(String newOrthopedicCondition) {
        this.OrthopedicCondition = newOrthopedicCondition;
        return this;
    }
                
    public ConditionDetaisBuilder setMuscularCondition(String newMuscularCondition) {
        this.MuscularCondition = newMuscularCondition;
        return this;
    }
    
    public ConditionDetaisBuilder setNeurologicalCondition(String newNeurologicalCondition) {
        this.NeurologicalCondition = newNeurologicalCondition;
        return this;
    }
        
    public ConditionDetaisBuilder setKnownAllergies(String newKnownAllergies) {
        this.KnownAllergies = newKnownAllergies;
        return this;
    }
                    
    public ConditionDetaisBuilder setKnownReactionsToSpecificDrugs(String newKnownReactionsToSpecificDrugs) {
        this.KnownReactionsToSpecificDrugs = newKnownReactionsToSpecificDrugs;
        return this;
    }
    
    public ConditionDetaisBuilder setSurgeriesHistory(String newSurgeriesHistory) {
        this.SurgeriesHistory = newSurgeriesHistory;
        return this;
    }
    
    public ConditionDetails build() {
        return new ConditionDetails(this);
    }
    
    }
}
