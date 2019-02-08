/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej;

import java.util.List;

/**
 *
 * @author User
 */
public class Doctor extends Person {
    
    public enum DoctorType {
        Surgeon,
        Physician
    }
    
    private int IDDoctor;
    private String Title;
    private List<Patient> Patients;
    private DoctorType Type;

    public int getIDDoctor() {
        return IDDoctor;
    }

    public void setIDDoctor(int IDDoctor) {
        this.IDDoctor = IDDoctor;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public List<Patient> getPatients() {
        return Patients;
    }

    public void setPatients(List<Patient> Patients) {
        this.Patients = Patients;
    }

    public DoctorType getType() {
        return Type;
    }

    public void setType(DoctorType Type) {
        this.Type = Type;
    }

    public Doctor(int IDDoctor, String FirstName, String LastName, String Title, List<Patient> Patients, DoctorType Type) {
        super(FirstName, LastName);
        this.IDDoctor = IDDoctor;
        this.Title = Title;
        this.Patients = Patients;
        this.Type = Type;
    }

    public Doctor(String FirstName, String LastName, String Title, DoctorType Type) {
        super(FirstName, LastName);;
        this.Title = Title;
        this.Type = Type;
    }
    
    

    @Override
    public String toString() {
        return this.getType() + " " + this.getFirstName() + " " + this.getLastName() + "[D" + IDDoctor + "]";
    }
    
    
    
    
    
    
}
