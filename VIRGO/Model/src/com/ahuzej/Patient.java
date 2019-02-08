/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej;

import java.util.Date;

/**
 *
 * @author User
 */
public class Patient extends Person {
    private int IDPatient;
    private PersonalDetails PersonalDetails;
    private ProfessionDetails ProfessionDetails;
    private ConditionDetails ConditionDetails;
    private Boolean isBilled;

    public void setIsBilled(Boolean isBilled) {
        this.isBilled = isBilled;
    }
    private NextOfKin NextOfKin;

    public NextOfKin getNextOfKin() {
        return NextOfKin;
    }

    public Boolean getIsBilled() {
        return isBilled;
    }
    
    public Patient(int IDPatient, String FirstName, String LastName, Boolean isBilled) {
        super(FirstName, LastName);
        this.IDPatient = IDPatient;
        this.isBilled = isBilled;
    }
    
    public Patient(String FirstName, String LastName, String MiddleName, Date DateOfBirth, ContactInfo Contact, char Sex,PersonalDetails PersonalDetails, ConditionDetails ConditionDetails,NextOfKin NextOfKin) {
        super(FirstName, LastName, MiddleName, DateOfBirth, Contact, Sex);
        this.PersonalDetails = PersonalDetails;
        this.ConditionDetails = ConditionDetails;
        this.NextOfKin = NextOfKin;
        
    }
    
        public Patient(int IDPatient, String FirstName, String LastName, String MiddleName, Date DateOfBirth, ContactInfo Contact, char Sex,PersonalDetails PersonalDetails, ConditionDetails ConditionDetails,NextOfKin NextOfKin) {
        super(FirstName, LastName, MiddleName, DateOfBirth, Contact, Sex);
        this.IDPatient = IDPatient;
        this.PersonalDetails = PersonalDetails;
        this.ConditionDetails = ConditionDetails;
        this.NextOfKin = NextOfKin;
    }
    
        public Patient(int IDPatient, String FirstName, String LastName, String MiddleName, Date DateOfBirth, ContactInfo Contact, char Sex,PersonalDetails PersonalDetails, ConditionDetails ConditionDetails) {
        super(FirstName, LastName, MiddleName, DateOfBirth, Contact, Sex);
        this.IDPatient = IDPatient;
        this.PersonalDetails = PersonalDetails;
        this.ConditionDetails = ConditionDetails;
    }

    @Override
    public String toString() {
        return "Patient " + this.getFirstName() + this.getLastName() + " [P" + IDPatient + "]";
    }

    public int getIDPatient() {
        return IDPatient;
    }

    public PersonalDetails getPersonalDetails() {
        return PersonalDetails;
    }

    public ConditionDetails getConditionDetails() {
        return ConditionDetails;
    }
    
    
    

    @Override
    public boolean equals(Object obj) {
       if (this == obj)
           return true;
       if (obj == null)
           return false;
       if (getClass() != obj.getClass())
           return false;
       final Patient other = (Patient) obj;
       if (this.IDPatient != other.IDPatient)
           return false;
       return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.IDPatient;
        return hash;
    }
    
    
    
    
    
    
}
