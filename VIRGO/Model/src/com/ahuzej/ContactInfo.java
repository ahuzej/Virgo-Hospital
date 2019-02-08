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
public class ContactInfo {
    
    private final String Email;
    private final String Pager;
    private final String Fax;
    private final String[] Phones;
    private final String[] Addresses;


    public ContactInfo(String Email, String Pager, String Fax, String[] Phones, String[] Addresses) {
        this.Email = Email;
        this.Pager = Pager;
        this.Fax = Fax;
        this.Phones = Phones;
        this.Addresses = Addresses;
    }

    public String[] getAddresses() {
        return Addresses;
    }

    public String getEmail() {
        return Email;
    }

    public String getPager() {
        return Pager;
    }

    public String getFax() {
        return Fax;
    }

    public String[] getPhones() {
        return Phones;
    }
    
    
}
