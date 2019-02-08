/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej.dal.repository;

import java.util.List;
import com.ahuzej.Doctor;
import com.ahuzej.NextOfKin;
import com.ahuzej.Patient;

/**
 *
 * @author Albert
 */
public interface IRepository {
    int insertDoctor(Doctor doctor);
    int insertPatient(Patient patient);
    void updateDoctor(Doctor dummy, int idDoctor);
    void deleteDoctor(int idDoctor);
    Doctor getDoctor(int idDoctor);
    List<Doctor> getDoctors();
    List<Doctor> getPatients();
    List<Patient> getPatientsForDoctor(int idDoctor);
    List<Patient> getUnassignedPatients();
    void assignPatientToDoctor(int idPatient, int idDoctor);
    void billPatient(int idDoctor, int idPatient, int ammount);
    List<String> getBillHistory();
    Patient getPatient(int idPatient);
    
}
