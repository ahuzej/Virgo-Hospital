/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author User
 */
public class PatientInfo extends javax.swing.JFrame {

    /**
     * Creates new form PatientInfo
     * @param p
     */
    public PatientInfo(Patient p) {
        initComponents();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
        //lblID.setText(String.valueOf(p.getIDPatient()));
        tfFirstName.setText(p.getFirstName());
        tfMiddleName.setText(p.getLastName());
        tfLastName.setText(p.getMiddleName());
        if(p.getDateOfBirth() != null)
            tfDob.setText(df.format(p.getDateOfBirth()));
        tfPresentAddress.setText(p.getContact().getAddresses()[0]);
        tfPermanentAddress.setText(p.getContact().getAddresses()[1]);
        tfFax.setText(p.getContact().getFax());
        tfEmail.setText(p.getContact().getEmail());
        lblSex.setText(String.valueOf(p.getSex()));
        lblNoOfDependents.setText(String.valueOf(p.getPersonalDetails().getNumberOfDependents()));
        tfMaritalStatus.setText(p.getPersonalDetails().getMaritalStatus());
        tfHeight.setText(String.valueOf(p.getPersonalDetails().getHeight()));
        tfWeight.setText(String.valueOf(p.getPersonalDetails().getWeight()));
        lblBloodType.setText(p.getPersonalDetails().getBloodType());
        tfOccupation.setText(p.getPersonalDetails().getOccupation());
        tfAnnualIncome.setText(String.valueOf(p.getPersonalDetails().getAnnualIncome()));
        tfCigarettesPerDay.setText(p.getPersonalDetails().getAverageCigarettesPerDay());
        tfDrinksPerDay.setText(p.getPersonalDetails().getAverageDrinksPerDay());
        tfStimulantUse.setText(p.getPersonalDetails().getStimulantUse());
        tfCoffeeConsumption.setText(p.getPersonalDetails().getCoffeeConsumption());
        tfSoftDrinkConsumption.setText(p.getPersonalDetails().getSoftDrinkConsumption());
        tfMealsLocation.setText(p.getPersonalDetails().getMealsLocation());
        if(p.getContact().getPhones()[0] != null)
            tfTelephoneWork.setText(p.getContact().getPhones()[0]);
        
        if(p.getContact().getPhones()[1] != null)
            tfTelephoneHome.setText(p.getContact().getPhones()[1]);
        
        tfPager.setText(p.getContact().getPager());
        tfNOKFirstName.setText(p.getNextOfKin().getFirstName());
        tfNOKMiddleName.setText(p.getNextOfKin().getMiddleName());
        tfNOKLastName.setText(p.getNextOfKin().getLastName());
        tfNOKRelationship.setText(p.getNextOfKin().getRelationshipWithPatient());
        
        if(p.getNextOfKin().getContact().getAddresses()[0] != null)
            tfNOKPresentAddress.setText(p.getNextOfKin().getContact().getAddresses()[0]);
        
        if(p.getNextOfKin().getContact().getPhones()[0] != null)
            tfNOKTelephoneWork.setText(p.getNextOfKin().getContact().getPhones()[0]);
         
        if(p.getNextOfKin().getContact().getPhones()[1] != null)
            tfNOKTelephoneHome.setText(p.getNextOfKin().getContact().getPhones()[1]);
        
        if(p.getNextOfKin().getContact().getPhones()[2] != null)
            tfNOKMobile.setText(p.getNextOfKin().getContact().getPhones()[2]);
        
        tfNOKPager.setText(p.getNextOfKin().getContact().getPager());
        tfNOKFax.setText(p.getNextOfKin().getContact().getFax());
        tfNOKEmail.setText(p.getNextOfKin().getContact().getEmail());
        taStatementOfComplaint.setText(p.getConditionDetails().getStatementOfComplaint());
        taPreviousTreatmentHistory.setText(p.getConditionDetails().getPreviousTreatmentHistory());
        taPhysicianHospitalTreated.setText(p.getConditionDetails().getPhysicianOrHospitalTreated());
        taCardiacCon.setText(p.getConditionDetails().getCardiacCondition());
        tfRespiratoryCon.setText(p.getConditionDetails().getRespiratoryCondition());
        tfDigestiveCon.setText(p.getConditionDetails().getDigestiveCondition());
        tfOrthopedicCon.setText(p.getConditionDetails().getOrthopedicCondition());
        tfMuscularCon.setText(p.getConditionDetails().getMuscularCondition());
        tfNeurologicalCon.setText(p.getConditionDetails().getNeurologicalCondition());
        tfKnownAllergies.setText(p.getConditionDetails().getKnownAllergies());
        tfKnownReactionToDrugs.setText(p.getConditionDetails().getKnownReactionsToSpecificDrugs());
        tfSurgeriesHistory.setText(p.getConditionDetails().getSurgeriesHistory());
        
        chbSmoker.setSelected(p.getPersonalDetails().getIsSmoking());
        chbDrinksAlcohol.setSelected(p.getPersonalDetails().getIsDrinking());
        chbRegularMeals.setSelected(p.getPersonalDetails().getHasRegularMeals().startsWith("1"));
        chbVegeterian.setSelected(p.getPersonalDetails().getVegeterian());
        chbDiabetic.setSelected(p.getConditionDetails().getDiabetic());
        chbHypertensive.setSelected(p.getConditionDetails().getHypertensive());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfMiddleName = new javax.swing.JTextField();
        tfFirstName = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        tfMaritalStatus = new javax.swing.JTextField();
        tfPresentAddress = new javax.swing.JTextField();
        tfPermanentAddress = new javax.swing.JTextField();
        tfDob = new javax.swing.JTextField();
        tfFax = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfDrinksPerDay = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfWeight = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tfOccupation = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tfAnnualIncome = new javax.swing.JTextField();
        chbVegeterian = new javax.swing.JCheckBox();
        chbSmoker = new javax.swing.JCheckBox();
        chbDrinksAlcohol = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        tfHeight = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tfCigarettesPerDay = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tfStimulantUse = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tfCoffeeConsumption = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tfSoftDrinkConsumption = new javax.swing.JTextField();
        chbRegularMeals = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        tfMealsLocation = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taStatementOfComplaint = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        taPreviousTreatmentHistory = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        chbDiabetic = new javax.swing.JCheckBox();
        chbHypertensive = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tfRespiratoryCon = new javax.swing.JTextField();
        tfDigestiveCon = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tfOrthopedicCon = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        tfMuscularCon = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        tfNeurologicalCon = new javax.swing.JTextField();
        tfKnownAllergies = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        tfKnownReactionToDrugs = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        tfSurgeriesHistory = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        tfTelephoneWork = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        tfTelephoneHome = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tfNOKFirstName = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        tfNOKMiddleName = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        tfNOKLastName = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        tfNOKRelationship = new javax.swing.JTextField();
        tfNOKPresentAddress = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        tfNOKMobile = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        tfNOKPager = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        tfNOKTelephoneWork = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        tfNOKTelephoneHome = new javax.swing.JTextField();
        tfNOKFax = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        tfNOKEmail = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        tfPager = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        lblNoOfDependents = new javax.swing.JLabel();
        lblBloodType = new javax.swing.JLabel();
        lblSex = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taPhysicianHospitalTreated = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        taCardiacCon = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("Personal Information");

        jSeparator1.setPreferredSize(new java.awt.Dimension(10, 10));

        jLabel5.setText("First Name:");

        jLabel6.setText("Last Name:");

        jLabel7.setText("Middle Name:");

        jLabel8.setText("Sex:");

        jLabel9.setText("DOB(D/M/Y):");

        jLabel10.setText("Present Address:");

        jLabel11.setText("Permanent Address:");

        jLabel12.setText("Fax:");

        jLabel13.setText("Email:");

        jLabel14.setText("Marital Status:");

        jLabel15.setText("Number of dependents:");

        tfMiddleName.setEditable(false);
        tfMiddleName.setText("John");

        tfFirstName.setEditable(false);
        tfFirstName.setText("Gaga");
        tfFirstName.setMinimumSize(new java.awt.Dimension(12, 30));
        tfFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFirstNameActionPerformed(evt);
            }
        });

        tfLastName.setEditable(false);
        tfLastName.setText("Doe");

        tfMaritalStatus.setEditable(false);

        tfPresentAddress.setEditable(false);

        tfPermanentAddress.setEditable(false);

        tfDob.setEditable(false);
        tfDob.setText("20061212");

        tfFax.setEditable(false);

        tfEmail.setEditable(false);

        tfDrinksPerDay.setEditable(false);

        jLabel16.setText("Height(cm):");

        tfWeight.setEditable(false);
        tfWeight.setText("131");

        jLabel17.setText("Weight(kg):");

        jLabel18.setText("Blood type:");

        jLabel19.setText("Occupation:");

        tfOccupation.setEditable(false);

        jLabel20.setText("Annual income:");

        tfAnnualIncome.setEditable(false);
        tfAnnualIncome.setText("150");

        chbVegeterian.setText("Vegeterian");
        chbVegeterian.setEnabled(false);

        chbSmoker.setText("Smoker");
        chbSmoker.setEnabled(false);

        chbDrinksAlcohol.setText("Drinks alcohol");
        chbDrinksAlcohol.setEnabled(false);

        jLabel21.setText("Cigarettes per day(avg):");

        tfHeight.setEditable(false);
        tfHeight.setText("131");

        jLabel22.setText("Drinks per day(avg):");

        tfCigarettesPerDay.setEditable(false);

        jLabel23.setText("Stimulant use:");

        tfStimulantUse.setEditable(false);
        tfStimulantUse.setMinimumSize(new java.awt.Dimension(12, 30));
        tfStimulantUse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStimulantUseActionPerformed(evt);
            }
        });

        jLabel24.setText("Coffee consumption:");

        tfCoffeeConsumption.setEditable(false);
        tfCoffeeConsumption.setMinimumSize(new java.awt.Dimension(12, 30));
        tfCoffeeConsumption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCoffeeConsumptionActionPerformed(evt);
            }
        });

        jLabel25.setText("Soft drink consumption:");

        tfSoftDrinkConsumption.setEditable(false);
        tfSoftDrinkConsumption.setMinimumSize(new java.awt.Dimension(12, 30));
        tfSoftDrinkConsumption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSoftDrinkConsumptionActionPerformed(evt);
            }
        });

        chbRegularMeals.setText("Regular meals");
        chbRegularMeals.setEnabled(false);

        jLabel26.setText("Eat home food/out:");

        tfMealsLocation.setEditable(false);
        tfMealsLocation.setMinimumSize(new java.awt.Dimension(12, 30));
        tfMealsLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMealsLocationActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel27.setText("Treatment information");

        jSeparator2.setPreferredSize(new java.awt.Dimension(10, 10));

        jLabel28.setText("Statement of complaint:");

        taStatementOfComplaint.setEditable(false);
        taStatementOfComplaint.setColumns(20);
        taStatementOfComplaint.setRows(5);
        taStatementOfComplaint.setText("\n");
        jScrollPane2.setViewportView(taStatementOfComplaint);

        taPreviousTreatmentHistory.setEditable(false);
        taPreviousTreatmentHistory.setColumns(20);
        taPreviousTreatmentHistory.setRows(5);
        jScrollPane3.setViewportView(taPreviousTreatmentHistory);

        jLabel29.setText("Previous treatment history:");

        jLabel30.setText("Physician/Hospital treated:");

        chbDiabetic.setText("Diabetic");
        chbDiabetic.setEnabled(false);
        chbDiabetic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbDiabeticActionPerformed(evt);
            }
        });

        chbHypertensive.setText("Hypertensive");
        chbHypertensive.setEnabled(false);

        jLabel31.setText("Cardiac condition:");

        jLabel32.setText("Respiratory condition:");

        tfRespiratoryCon.setEditable(false);

        tfDigestiveCon.setEditable(false);

        jLabel33.setText("Digestive condition:");

        tfOrthopedicCon.setEditable(false);

        jLabel34.setText("Ortohpedic condition:");

        tfMuscularCon.setEditable(false);

        jLabel35.setText("Muscular condition:");

        jLabel36.setText("Neurological condition:");

        tfNeurologicalCon.setEditable(false);

        tfKnownAllergies.setEditable(false);

        jLabel37.setText("Known allergies:");

        jLabel38.setText("Known reaction to specific drugs:");

        tfKnownReactionToDrugs.setEditable(false);

        jLabel39.setText("Surgeries history:");

        tfSurgeriesHistory.setEditable(false);

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        jLabel40.setText("Telephone(Work):");

        tfTelephoneWork.setEditable(false);
        tfTelephoneWork.setMinimumSize(new java.awt.Dimension(12, 30));
        tfTelephoneWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelephoneWorkActionPerformed(evt);
            }
        });

        jLabel41.setText("Telephone(Home):");

        tfTelephoneHome.setEditable(false);
        tfTelephoneHome.setMinimumSize(new java.awt.Dimension(12, 30));
        tfTelephoneHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelephoneHomeActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel44.setText("Next-Of-Kin Information");

        jSeparator3.setPreferredSize(new java.awt.Dimension(10, 10));

        tfNOKFirstName.setEditable(false);
        tfNOKFirstName.setMinimumSize(new java.awt.Dimension(12, 30));
        tfNOKFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNOKFirstNameActionPerformed(evt);
            }
        });

        jLabel42.setText("First Name:");

        tfNOKMiddleName.setEditable(false);
        tfNOKMiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNOKMiddleNameActionPerformed(evt);
            }
        });

        jLabel43.setText("Middle Name:");

        tfNOKLastName.setEditable(false);

        jLabel45.setText("Last Name:");

        jLabel46.setText("Relationship with patient:");

        tfNOKRelationship.setEditable(false);

        tfNOKPresentAddress.setEditable(false);

        jLabel47.setText("Contact Address:");

        tfNOKMobile.setEditable(false);
        tfNOKMobile.setMinimumSize(new java.awt.Dimension(12, 30));
        tfNOKMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNOKMobileActionPerformed(evt);
            }
        });

        jLabel48.setText("Mobile:");

        tfNOKPager.setEditable(false);
        tfNOKPager.setMinimumSize(new java.awt.Dimension(12, 30));
        tfNOKPager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNOKPagerActionPerformed(evt);
            }
        });

        jLabel49.setText("Pager:");

        jLabel50.setText("Telephone(Work):");

        tfNOKTelephoneWork.setEditable(false);
        tfNOKTelephoneWork.setMinimumSize(new java.awt.Dimension(12, 30));
        tfNOKTelephoneWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNOKTelephoneWorkActionPerformed(evt);
            }
        });

        jLabel51.setText("Telephone(Home):");

        tfNOKTelephoneHome.setEditable(false);
        tfNOKTelephoneHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNOKTelephoneHomeActionPerformed(evt);
            }
        });

        tfNOKFax.setEditable(false);

        jLabel52.setText("Fax:");

        tfNOKEmail.setEditable(false);

        jLabel53.setText("Email:");

        tfPager.setEditable(false);

        jLabel54.setText("Pager:");

        jLabel55.setText("$");

        lblNoOfDependents.setText("1");

        lblBloodType.setText("AB+");

        lblSex.setText("N");

        taPhysicianHospitalTreated.setEditable(false);
        taPhysicianHospitalTreated.setColumns(20);
        taPhysicianHospitalTreated.setRows(5);
        taPhysicianHospitalTreated.setText("\n");
        jScrollPane4.setViewportView(taPhysicianHospitalTreated);

        taCardiacCon.setEditable(false);
        taCardiacCon.setColumns(20);
        taCardiacCon.setRows(5);
        jScrollPane5.setViewportView(taCardiacCon);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(tfDob, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfFax, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(tfMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfPresentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfPermanentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(lblSex)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(tfHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(tfWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(lblBloodType))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblNoOfDependents)
                                            .addComponent(tfAnnualIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel55))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(tfCigarettesPerDay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(tfSoftDrinkConsumption, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(tfDrinksPerDay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chbDrinksAlcohol)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(tfMealsLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfStimulantUse, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel23))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addComponent(tfCoffeeConsumption, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel40)
                                            .addComponent(tfTelephoneWork, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel41)
                                            .addComponent(tfTelephoneHome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(chbSmoker)
                            .addComponent(jLabel44)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNOKFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNOKMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45)
                                    .addComponent(tfNOKLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel46)
                                    .addComponent(tfNOKRelationship, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(chbRegularMeals)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbVegeterian)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbDiabetic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbHypertensive)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel54)
                                    .addComponent(tfPager, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel48)
                                            .addComponent(tfNOKMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel49)
                                            .addComponent(tfNOKPager, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(tfNOKPresentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel50)
                                            .addComponent(tfNOKTelephoneWork, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel51)
                                            .addComponent(tfNOKTelephoneHome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel52)
                                            .addComponent(tfNOKFax, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel53)
                                            .addComponent(tfNOKEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(426, 426, 426)
                                .addComponent(btnOk))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel32)
                                                .addComponent(tfRespiratoryCon, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel33)
                                                .addComponent(tfDigestiveCon, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel34)
                                                .addComponent(tfOrthopedicCon, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel35)
                                                .addComponent(tfMuscularCon, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel36)
                                                .addComponent(tfNeurologicalCon, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel37)
                                                .addComponent(tfKnownAllergies, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(tfKnownReactionToDrugs, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel39)
                                                .addComponent(tfSurgeriesHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel30)
                                            .addGap(104, 104, 104)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel31)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSex))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfPresentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPermanentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNoOfDependents)))
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17)
                                .addComponent(jLabel19)
                                .addComponent(jLabel20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAnnualIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55)
                            .addComponent(lblBloodType))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chbSmoker)
                            .addComponent(chbDrinksAlcohol))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addComponent(tfOrthopedicCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfRespiratoryCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDigestiveCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMuscularCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNeurologicalCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfKnownAllergies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfKnownReactionToDrugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSurgeriesHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOk)
                        .addGap(176, 176, 176))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDrinksPerDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCigarettesPerDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfStimulantUse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCoffeeConsumption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel26))
                                    .addGap(5, 5, 5)
                                    .addComponent(tfSoftDrinkConsumption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(tfMealsLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel40)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(tfTelephoneWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel41)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(tfTelephoneHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chbDiabetic)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(chbRegularMeals)
                                        .addComponent(chbVegeterian)
                                        .addComponent(chbHypertensive))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel54)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel51))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfNOKTelephoneHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNOKTelephoneWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfNOKMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfNOKLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfNOKFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfNOKRelationship, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel45)
                                                .addComponent(jLabel43)
                                                .addComponent(jLabel42))
                                            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(32, 32, 32)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(tfNOKPresentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel47))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel48)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(tfNOKMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel49)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(tfNOKPager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel53))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfNOKFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNOKEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(97, 97, 97))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1118, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 883, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFirstNameActionPerformed

    private void tfStimulantUseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStimulantUseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStimulantUseActionPerformed

    private void tfCoffeeConsumptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCoffeeConsumptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCoffeeConsumptionActionPerformed

    private void tfSoftDrinkConsumptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSoftDrinkConsumptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSoftDrinkConsumptionActionPerformed

    private void tfMealsLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMealsLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMealsLocationActionPerformed

    private void chbDiabeticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbDiabeticActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbDiabeticActionPerformed

    private void tfTelephoneWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelephoneWorkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelephoneWorkActionPerformed

    private void tfTelephoneHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelephoneHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelephoneHomeActionPerformed

    private void tfNOKFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNOKFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNOKFirstNameActionPerformed

    private void tfNOKMiddleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNOKMiddleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNOKMiddleNameActionPerformed

    private void tfNOKMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNOKMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNOKMobileActionPerformed

    private void tfNOKPagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNOKPagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNOKPagerActionPerformed

    private void tfNOKTelephoneWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNOKTelephoneWorkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNOKTelephoneWorkActionPerformed

    private void tfNOKTelephoneHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNOKTelephoneHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNOKTelephoneHomeActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOkActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JCheckBox chbDiabetic;
    private javax.swing.JCheckBox chbDrinksAlcohol;
    private javax.swing.JCheckBox chbHypertensive;
    private javax.swing.JCheckBox chbRegularMeals;
    private javax.swing.JCheckBox chbSmoker;
    private javax.swing.JCheckBox chbVegeterian;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblBloodType;
    private javax.swing.JLabel lblNoOfDependents;
    private javax.swing.JLabel lblSex;
    private javax.swing.JTextArea taCardiacCon;
    private javax.swing.JTextArea taPhysicianHospitalTreated;
    private javax.swing.JTextArea taPreviousTreatmentHistory;
    private javax.swing.JTextArea taStatementOfComplaint;
    private javax.swing.JTextField tfAnnualIncome;
    private javax.swing.JTextField tfCigarettesPerDay;
    private javax.swing.JTextField tfCoffeeConsumption;
    private javax.swing.JTextField tfDigestiveCon;
    private javax.swing.JTextField tfDob;
    private javax.swing.JTextField tfDrinksPerDay;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFax;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfHeight;
    private javax.swing.JTextField tfKnownAllergies;
    private javax.swing.JTextField tfKnownReactionToDrugs;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfMaritalStatus;
    private javax.swing.JTextField tfMealsLocation;
    private javax.swing.JTextField tfMiddleName;
    private javax.swing.JTextField tfMuscularCon;
    private javax.swing.JTextField tfNOKEmail;
    private javax.swing.JTextField tfNOKFax;
    private javax.swing.JTextField tfNOKFirstName;
    private javax.swing.JTextField tfNOKLastName;
    private javax.swing.JTextField tfNOKMiddleName;
    private javax.swing.JTextField tfNOKMobile;
    private javax.swing.JTextField tfNOKPager;
    private javax.swing.JTextField tfNOKPresentAddress;
    private javax.swing.JTextField tfNOKRelationship;
    private javax.swing.JTextField tfNOKTelephoneHome;
    private javax.swing.JTextField tfNOKTelephoneWork;
    private javax.swing.JTextField tfNeurologicalCon;
    private javax.swing.JTextField tfOccupation;
    private javax.swing.JTextField tfOrthopedicCon;
    private javax.swing.JTextField tfPager;
    private javax.swing.JTextField tfPermanentAddress;
    private javax.swing.JTextField tfPresentAddress;
    private javax.swing.JTextField tfRespiratoryCon;
    private javax.swing.JTextField tfSoftDrinkConsumption;
    private javax.swing.JTextField tfStimulantUse;
    private javax.swing.JTextField tfSurgeriesHistory;
    private javax.swing.JTextField tfTelephoneHome;
    private javax.swing.JTextField tfTelephoneWork;
    private javax.swing.JTextField tfWeight;
    // End of variables declaration//GEN-END:variables
}
