/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej.bl;

import java.util.List;

/**
 *
 * @author User
 */
public class ReceptionHandler extends HandlerBase {
    
    public void assignPatientToDoctor(int idPatient, int idDoctor) {
        repository.assignPatientToDoctor(idPatient, idDoctor);
    }
    
    public void billPatient(int idDoctor, int idPatient, int ammount) {
        repository.billPatient(idDoctor, idPatient, ammount);
    }
    
    public List<String> getBillHistory() {
        return repository.getBillHistory();
    }
}
