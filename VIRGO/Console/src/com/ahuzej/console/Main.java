/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej.console;

import com.ahuzej.Doctor;
import com.ahuzej.Patient;

import java.util.List;
import com.ahuzej.bl.DoctorsHandlers;
import com.ahuzej.bl.PatientsHandlers;
import com.ahuzej.bl.ReceptionHandler;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Albert
 */
public class Main {

    private static final DoctorsHandlers DOCTORS_HANDLER = new DoctorsHandlers();
    private static final PatientsHandlers PATIENTS_HANDLER = new PatientsHandlers();
    private static final ReceptionHandler  RECEPTION_HANDLER = new ReceptionHandler();
    /**
     * @param args the command line arguments
     */
    public static void start() {
       performTesting();
    }

    private static void performTesting() {
        displayMenu();
        Scanner s = new Scanner(System.in);
        //System.out.println(s.next());
        //List<Patient> patientList = new ArrayList<Patient>();
        switch(s.next()) {
            case "1":
                List<Patient> patients = PATIENTS_HANDLER.getUnassignedPatients();
                patients.forEach((patient) -> {
                    System.out.println(patient);
                } );
                break;
            case "2":
                showPatientsForDoctor(s);
                break;
            case "3":
                showDoctorList();
                break;
            case "4":
                showBillings();
                break;
            default:
                displayMenu();
                break;
        }
        
        System.out.println("Continue? (Type 1 to continue, 0 to exit)");
        int cont=1;
                    try {
                        cont = s.nextInt();   
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
        
        if(cont == 1) {
            displayMenu();
            performTesting();
        }
        //List<Doctor> doctors = DOCTORS_HANDLER.getDoctors();
        //System.out.println(doctors);
        
        //Doctor doc = new Doctor("Rade", "Radic", "Mr", Doctor.DoctorType.Physician);
        //int id = DOCTORS_HANDLER.insertDoctor(doc);
        //System.out.println(id);
        /*Doctor doc = new Doctor("Update", "Dateovic", "Mr", Doctor.DoctorType.Physician);
        DOCTORS_HANDLER.updateDoctor(doc, 2);
        
        DOCTORS_HANDLER.deleteDoctor(2);*/
    }
    
    private static void displayMenu() {
        System.out.println("Please select an option:");
        System.out.println("1. Show patient list");
        System.out.println("2. Show patients for doctor");
        System.out.println("3. Show doctor list");
        System.out.println("4. Show billings");
        System.out.println("--------------------------");
    }
    
    private static void showPatientsForDoctor(Scanner s) {
                
                List<Doctor> doctors = DOCTORS_HANDLER.getDoctors();
                doctors.forEach((doctor) -> {
                    System.out.println(doctor.getIDDoctor() + ". " + doctor.getFirstName());} );
                    System.out.println("Please write the number of doctor to check");
                    int sDoc=0;
                    try {
                        sDoc = s.nextInt();   
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    List<Patient> doctorPatients = PATIENTS_HANDLER.getPatientsForDoctor(sDoc);
                    doctorPatients.forEach((patient) -> {
                        System.out.println(patient);
                    });
                
    }
    
    private static void showDoctorList() {
                List<Doctor> doctors = DOCTORS_HANDLER.getDoctors();
                doctors.forEach((doctor) -> {
                    System.out.println(doctor.getIDDoctor() + ". " + doctor.getFirstName());} );
    }
    
    
    private static void showBillings() {
        List<String> bills = RECEPTION_HANDLER.getBillHistory();
        bills.forEach((bill) -> {
            System.out.println(bill);
        });
    }
    
    
}
