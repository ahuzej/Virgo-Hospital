/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej.bl;

import com.ahuzej.Doctor;
import java.util.List;

/**
 *
 * @author Albert
 */
public class DoctorsHandlers extends HandlerBase {
    
    public List<Doctor> getDoctors() {
        return repository.getDoctors();
    }
        
    public Doctor getDoctor(int idDoctor) {
        return repository.getDoctor(idDoctor);
    }
    public int insertDoctor(Doctor doc) {
        return repository.insertDoctor(doc);
    }
    
    public void updateDoctor(Doctor dummy, int idDoctor) {
        repository.updateDoctor(dummy, idDoctor);
    }
    
    public void deleteDoctor(int idDoctor) {
        repository.deleteDoctor(idDoctor);
    }
}
