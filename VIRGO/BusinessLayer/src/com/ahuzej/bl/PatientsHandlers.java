/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej.bl;

import com.ahuzej.Patient;
import java.util.List;

/**
 *
 * @author User
 */
public class PatientsHandlers extends HandlerBase {
    
    public List<Patient> getPatientsForDoctor(int idDoctor) {
        return repository.getPatientsForDoctor(idDoctor);
    }
    
    public int insertPatient(Patient pat) {
        return repository.insertPatient(pat);
    }

    public List<Patient> getUnassignedPatients() {
        return repository.getUnassignedPatients();
    }
    
    public Patient getPatient(int idPatient) {
        return repository.getPatient(idPatient);
    }
}
