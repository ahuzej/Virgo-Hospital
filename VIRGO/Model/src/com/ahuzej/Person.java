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
public class Person {
    
    private String FirstName;
    private String LastName;
    private String MiddleName;
    private Date DateOfBirth;
    private ContactInfo Contact;
    private char Sex;

    public char getSex() {
        return Sex;
    }

    public void setSex(char Sex) {
        this.Sex = Sex;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public Person(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public ContactInfo getContact() {
        return Contact;
    }

    public void setContact(ContactInfo Contact) {
        this.Contact = Contact;
    }

    public Person(String FirstName, String LastName, String MiddleName, Date DateOfBirth, ContactInfo Contact, char sex) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.MiddleName = MiddleName;
        this.DateOfBirth = DateOfBirth;
        this.Contact = Contact;
        this.Sex = sex;
    }
    
     public Person(String FirstName, String LastName, String MiddleName, ContactInfo Contact) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.MiddleName = MiddleName;
        this.Contact = Contact;
    }   
    
    
    
}
