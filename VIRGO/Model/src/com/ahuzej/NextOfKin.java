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
public class NextOfKin extends Person {
    
    private String RelationshipWithPatient;

    public String getRelationshipWithPatient() {
        return RelationshipWithPatient;
    }
    
    public NextOfKin(String FirstName, String LastName, String MiddleName, ContactInfo Contact, String RelationshipWithPatient) {
        super(FirstName, LastName, MiddleName, Contact);
        this.RelationshipWithPatient = RelationshipWithPatient;
    }
    
}
