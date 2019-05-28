/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.view;

import lk.edu.ijse.utill.IDGenarator;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import lk.edu.ijse.controller.ControllerFactory;
import lk.edu.ijse.controller.custom.BatchController;
import lk.edu.ijse.controller.custom.CourseController;
import lk.edu.ijse.controller.custom.DailyCollectionController;
import lk.edu.ijse.controller.custom.PaymentController;
import lk.edu.ijse.controller.custom.RegistrationController;
import lk.edu.ijse.controller.custom.StudentController;
import lk.edu.ijse.dto.BatchDTO;
import lk.edu.ijse.dto.CourseDTO;
import lk.edu.ijse.dto.DailycollectionDTO;
import lk.edu.ijse.dto.PaymentDTO;
import lk.edu.ijse.dto.RegistrationDTO;
import lk.edu.ijse.dto.StudentDTO;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author epc
 */
public class RegistrationWithPayment extends javax.swing.JFrame {

    private String nxtPaymnt;
    private int calArrearss;
    private int Discount;
    private int Tax;
    private int DisAndTaxAdd;
    private int x;
    private int y;
    private int b;
    private RegistrationController registrationController;
    private CourseController courseController;
    private BatchController batchController;
    private StudentController studentController;
    private PaymentController paymentController;
    private DailyCollectionController dailyCollectionController;
    private String prefix;
    private String tableName;
    private String columName;
    private String Dis;
    private String NICC;
    private String StartDAteeee;
    private String Taxxx;

    /**
     * Creates new form RegistrationWithPayment
     */
    public RegistrationWithPayment() {
        initComponents();
        setLocationRelativeTo(null);
        registrationController = (RegistrationController) ControllerFactory.getIntense().getServices(ControllerFactory.getServicesType.REGISTRATION);
        dailyCollectionController =  (DailyCollectionController) ControllerFactory.getIntense().getServices(ControllerFactory.getServicesType.DAILYCOLLECTION);
        studentController = (StudentController) ControllerFactory.getIntense().getServices(ControllerFactory.getServicesType.STUDENT);
        batchController = (BatchController) ControllerFactory.getIntense().getServices(ControllerFactory.getServicesType.BATCH);
        courseController = (CourseController) ControllerFactory.getIntense().getServices(ControllerFactory.getServicesType.COURSE);
        paymentController = (PaymentController) ControllerFactory.getIntense().getServices(ControllerFactory.getServicesType.PAYMENT);
        Idgent();
        setTime();
        setDate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        HOME_TIME1 = new javax.swing.JLabel();
        HOME_TIME = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        RegIdSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        autoFillFee = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        AutoFillCourseName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        AutoFillStudentId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        AutoFillBatch = new javax.swing.JTextField();
        AutoFillName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TxtArrears = new javax.swing.JTextField();
        CmbPaymentStete = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        taxWithPayment = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PaimentId = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        NextpaymentText = new datechooser.beans.DateChooserCombo();
        taxWithPayment1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        taxWithPayment2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        jPanel1.setBackground(java.awt.Color.gray);

        jPanel3.setBackground(java.awt.Color.darkGray);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PAYMENT");

        HOME_TIME1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        HOME_TIME1.setForeground(new java.awt.Color(255, 255, 255));

        HOME_TIME.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        HOME_TIME.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HOME_TIME1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HOME_TIME, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HOME_TIME1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HOME_TIME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Reg Id");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, -1, -1));

        RegIdSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegIdSearchMouseClicked(evt);
            }
        });
        RegIdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegIdSearchActionPerformed(evt);
            }
        });
        jPanel2.add(RegIdSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 12, 479, -1));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 6, -1, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setText("Student ID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 116, -1, -1));

        autoFillFee.setEditable(false);
        autoFillFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoFillFeeActionPerformed(evt);
            }
        });
        jPanel2.add(autoFillFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 204, 479, -1));

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel9.setText("Student Name");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 70, -1, -1));

        AutoFillCourseName.setEditable(false);
        AutoFillCourseName.setMinimumSize(new java.awt.Dimension(6, 30));
        jPanel2.add(AutoFillCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 158, 479, -1));

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel10.setText("Fee");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 208, -1, -1));

        AutoFillStudentId.setEditable(false);
        AutoFillStudentId.setMinimumSize(new java.awt.Dimension(6, 30));
        AutoFillStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoFillStudentIdActionPerformed(evt);
            }
        });
        jPanel2.add(AutoFillStudentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 112, 479, -1));

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel11.setText("Course Name");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 162, -1, -1));

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel12.setText("Batch");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 254, -1, -1));

        AutoFillBatch.setEditable(false);
        AutoFillBatch.setMinimumSize(new java.awt.Dimension(6, 30));
        jPanel2.add(AutoFillBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 250, 479, -1));

        AutoFillName.setEditable(false);
        AutoFillName.setMinimumSize(new java.awt.Dimension(6, 30));
        jPanel2.add(AutoFillName, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 66, 479, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/edu/ijse/Images/seamless-white-pattern-background-vector-id508007780.jpg"))); // NOI18N
        jLabel17.setText("jLabel14");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 310));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/edu/ijse/Images/seamless-white-pattern-background-vector-id508007780.jpg"))); // NOI18N
        jLabel26.setText("jLabel14");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 550, 310));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Payment Id");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 71, -1, -1));

        TxtArrears.setEditable(false);
        jPanel4.add(TxtArrears, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 21, 225, -1));

        CmbPaymentStete.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        CmbPaymentStete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full Payment", "Part Payment" }));
        CmbPaymentStete.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbPaymentSteteItemStateChanged(evt);
            }
        });
        jPanel4.add(CmbPaymentStete, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 20, 179, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Payment State");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 25, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton2.setText("Pay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 310, 127, 45));

        taxWithPayment.setEditable(false);
        jPanel4.add(taxWithPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 493, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setText("Payment With Discount  And Tax");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 164, -1, -1));

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel13.setText("Arrears");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 25, -1, -1));

        PaimentId.setEditable(false);
        PaimentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaimentIdActionPerformed(evt);
            }
        });
        jPanel4.add(PaimentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 67, 493, -1));

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, 127, 45));

        jLabel14.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel14.setText("Next tPayment Date");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 113, -1, -1));

        NextpaymentText.setCalendarPreferredSize(new java.awt.Dimension(370, 370));
        jPanel4.add(NextpaymentText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 113, 493, -1));

        taxWithPayment1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                taxWithPayment1KeyReleased(evt);
            }
        });
        jPanel4.add(taxWithPayment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 206, 493, -1));

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel15.setText("Payment");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 210, -1, -1));

        taxWithPayment2.setEditable(false);
        jPanel4.add(taxWithPayment2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 252, 493, -1));

        jLabel16.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel16.setText("Balance");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 256, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/edu/ijse/Images/seamless-white-pattern-background-vector-id508007780.jpg"))); // NOI18N
        jLabel19.setText("jLabel14");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 370));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/edu/ijse/Images/seamless-white-pattern-background-vector-id508007780.jpg"))); // NOI18N
        jLabel27.setText("jLabel14");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 550, 370));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegIdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegIdSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegIdSearchActionPerformed

    private void autoFillFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoFillFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autoFillFeeActionPerformed

    private void AutoFillStudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoFillStudentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutoFillStudentIdActionPerformed

    private void PaimentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaimentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaimentIdActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MainPage mainPage = new MainPage();
        mainPage.setVisible(true);
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        try {

            PaymentDTO p = paymentController.SearchAllAndShort(RegIdSearch.getText());
            if (p != null) {
                TxtArrears.setText("You Paid Your 1st Payment");
                PaimentId.setText("You Paid Your 1st Payment");
                taxWithPayment.setText("You Paid Your 1st Payment");
                jButton2.setEnabled(false);
            } else {
                jButton2.setEnabled(true);
                Idgent();
            }

            try {
                RegistrationDTO SearchAllAndShort = registrationController.SearchAllAndShort(RegIdSearch.getText());
                if (SearchAllAndShort != null) {
                    System.out.println(SearchAllAndShort.getBatchid() + "");
                    BatchDTO SearchAllAndShort2 = batchController.Search(SearchAllAndShort.getBatchid());
                    System.out.println(SearchAllAndShort2.toString());

                    if (SearchAllAndShort != null) {
                        CourseDTO SearchAllAndShort3 = courseController.Search(SearchAllAndShort2.getCourseId());

                        if (SearchAllAndShort3 != null) {
                            StudentDTO SearchAllAndShort4 = studentController.Search(SearchAllAndShort.getStudentid());

                            if (SearchAllAndShort4 != null) {
                                AutoFillName.setText(SearchAllAndShort4.getFullname());

//                                iid = SearchAllAndShort1.getBid();
                                StartDAteeee = SearchAllAndShort2.getStartDate();
                                NICC = SearchAllAndShort4.getNic();
                                AutoFillStudentId.setText(SearchAllAndShort4.getSid());
                                AutoFillCourseName.setText(SearchAllAndShort3.getCoursename());
                                autoFillFee.setText(SearchAllAndShort2.getFee());
                                AutoFillBatch.setText(SearchAllAndShort2.getBatch());
                                Dis = SearchAllAndShort2.getDiscountForFullPayment();
                                Discount = 100 - Integer.parseInt(SearchAllAndShort2.getDiscountForFullPayment());
                                Tax = Integer.parseInt(SearchAllAndShort3.getTaxRate()) + 100;
                                int ppp=Tax-100;
                                Taxxx=""+ppp;
//                    } else {
                            } else {
                                System.out.println("sort 4 null");
                            }
                        } else {
                            System.out.println("sort 3 null");
                        }
                    }
                } else {
                    System.out.println("sort 1 null");
                }

            } catch (Exception ex) {
                Logger.getLogger(RegistrationWithPayment.class.getName()).log(Level.SEVERE, null, ex);
            }         // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(RegistrationWithPayment.class.getName()).log(Level.SEVERE, null, ex);
        }         // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    private void CmbPaymentSteteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbPaymentSteteItemStateChanged

        calArrears();         // TODO add your handling code here:

    }//GEN-LAST:event_CmbPaymentSteteItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if (CmbPaymentStete.getSelectedItem() == "Part Payment") {
            nxtPaymnt = NextpaymentText.getText();
            System.out.println("" + nxtPaymnt);
        } else {
            nxtPaymnt = "Payment Is End";

            System.out.println("" + nxtPaymnt);
        }
        PaymentDTO payment = new PaymentDTO(PaimentId.getText(), RegIdSearch.getText(), (String) CmbPaymentStete.getSelectedItem(), TxtArrears.getText(), nxtPaymnt);

        try {
            boolean add = paymentController.add(payment);
            if (add) {
                System.out.println(" Add Ok");
                JOptionPane.showMessageDialog(rootPane, "Added Succes");
                collectingBills();
//                jasperReport();
                jasperReport2();
            } else {
                System.out.println(" Not Add");
                JOptionPane.showMessageDialog(rootPane, "Not Add");
            }
        } catch (Exception ex) {
            Logger.getLogger(RegistrationWithPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RegIdSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegIdSearchMouseClicked
        ClearTXt();        // TODO add your handling code here:
    }//GEN-LAST:event_RegIdSearchMouseClicked

    private void taxWithPayment1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taxWithPayment1KeyReleased
        balancecal();        // TODO add your handling code here:
    }//GEN-LAST:event_taxWithPayment1KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrationWithPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationWithPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationWithPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationWithPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationWithPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AutoFillBatch;
    private javax.swing.JTextField AutoFillCourseName;
    private javax.swing.JTextField AutoFillName;
    private javax.swing.JTextField AutoFillStudentId;
    private javax.swing.JComboBox<String> CmbPaymentStete;
    private javax.swing.JLabel HOME_TIME;
    private javax.swing.JLabel HOME_TIME1;
    private datechooser.beans.DateChooserCombo NextpaymentText;
    private javax.swing.JTextField PaimentId;
    private javax.swing.JTextField RegIdSearch;
    private javax.swing.JTextField TxtArrears;
    private javax.swing.JTextField autoFillFee;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField taxWithPayment;
    private javax.swing.JTextField taxWithPayment1;
    private javax.swing.JTextField taxWithPayment2;
    // End of variables declaration//GEN-END:variables
private void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Date date = new Date();
                    String currentdate = new SimpleDateFormat("hh:mm:aa").format(date);
                    HOME_TIME.setText(currentdate);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }
                }
            }
        }).start();
    }

    private void setDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        HOME_TIME1.setText(s.format(d));

    }

    private void calArrears() {
        System.out.println("" + CmbPaymentStete.getSelectedItem());
        if (CmbPaymentStete.getSelectedItem() == "Part Payment") {
            calArrearss = (Integer.parseInt(autoFillFee.getText()) / 2);
            TxtArrears.setText("" + calArrearss);

            DisAndTaxAdd = (calArrearss * Tax / 100);
            taxWithPayment.setText("" + DisAndTaxAdd);
            DisAndTaxAdd = 0;

        } else {
            calArrearss = 0;
            x = (Integer.parseInt(autoFillFee.getText()));
            TxtArrears.setText("" + calArrearss);

            DisAndTaxAdd = x * Discount / 100 * Tax / 100;
            taxWithPayment.setText("" + DisAndTaxAdd);
        }
    }

    private void Idgent() {
        tableName = "payment";
        columName = "pid";
        prefix = "P";
        PaimentId.setText(IDGenarator.getNextIdGenaretor(tableName, columName, prefix));

    }

    private void jasperReport() {

        try {
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(StartUp.class.getResourceAsStream("/lk//edu//ijse//Reports/PaymentWithStudentGetUI.jasper"));

            HashMap<String, Object> parHashMap = new HashMap<>();
            parHashMap.put("SID", RegIdSearch.getText());
            parHashMap.put("NwithInit", AutoFillName.getText());
            parHashMap.put("FullName", AutoFillStudentId.getText());
            parHashMap.put("Nic", AutoFillCourseName.getText());
            parHashMap.put("Address", autoFillFee.getText());
            parHashMap.put("Telephone", AutoFillBatch.getText());

            parHashMap.put("paymentstate", CmbPaymentStete.getSelectedItem());
            parHashMap.put("Arrears", TxtArrears.getText());
            parHashMap.put("pid", PaimentId.getText());
            parHashMap.put("NextPaymentDate", NextpaymentText.getText());
            parHashMap.put("FuulPay", taxWithPayment.getText());

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parHashMap, new JREmptyDataSource());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint);
            java.awt.Container container = jasperViewer.getContentPane();

            JDialog jDialog = new JDialog();
            jDialog.setContentPane(container);
            jDialog.setSize(jasperViewer.getSize());
            jDialog.setLocationRelativeTo(null);
            jDialog.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ClearTXt() {
        RegIdSearch.setText("");
        AutoFillName.setText("");
        AutoFillStudentId.setText("");
        AutoFillCourseName.setText("");
        autoFillFee.setText("");
        AutoFillBatch.setText("");
        Idgent();
        TxtArrears.setText("");
        taxWithPayment.setText("");
    }

    private void balancecal() {
        int r = Integer.parseInt(taxWithPayment1.getText());
        int e = Integer.parseInt(taxWithPayment.getText());
        int t = r - e;
        taxWithPayment2.setText("" + t);
    }

    private void jasperReport2() {

        try {
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(StartUp.class.getResourceAsStream("/lk//edu//ijse//Reports/LastPayment.jasper"));
            String h = (String) CmbPaymentStete.getSelectedItem();
            HashMap<String, Object> parHashMap = new HashMap<>();
            parHashMap.put("ReceptDate", HOME_TIME1.getText());
            parHashMap.put("NIC", NICC);
            parHashMap.put("SName", AutoFillName.getText());
            parHashMap.put("Batch", AutoFillBatch.getText());
            parHashMap.put("NxtPayment", StartDAteeee);
            parHashMap.put("CourseName", AutoFillCourseName.getText());
            parHashMap.put("PaymentState", h);
            if (CmbPaymentStete.getSelectedItem() == "Part Payment") {
                int j = Integer.parseInt(autoFillFee.getText());
                int k = j / 2;
                String d = "" + k;
                parHashMap.put("Fee", d);

                parHashMap.put("NxtPaymentDatee", nxtPaymnt);

            } else {
                parHashMap.put("Fee", autoFillFee.getText());
                parHashMap.put("NxtPaymentDatee", "payment End");
            }
            parHashMap.put("TaxTxt", Taxxx);
            parHashMap.put("Dis", Dis);

            parHashMap.put("FullFee", taxWithPayment.getText());
            parHashMap.put("Payment", taxWithPayment1.getText());
            parHashMap.put("balance", taxWithPayment2.getText());
            parHashMap.put("Arrears", TxtArrears.getText());

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parHashMap, new JREmptyDataSource());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint);
            java.awt.Container container = jasperViewer.getContentPane();

            JDialog jDialog = new JDialog();
            jDialog.setContentPane(container);
            jDialog.setSize(jasperViewer.getSize());
            jDialog.setLocationRelativeTo(null);
            jDialog.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void collectingBills(){
    DailycollectionDTO dailycollectionDTO = new DailycollectionDTO(0,"Payment",AutoFillBatch.getText(), HOME_TIME1.getText(), taxWithPayment.getText());

        try {
            boolean add = dailyCollectionController.add(dailycollectionDTO);
            if (add) {
                System.out.println(" Add Ok");
//                JOptionPane.showMessageDialog(rootPane, "afsdsdfasdfasf");
            } else {
                System.out.println(" Not Add");
//                JOptionPane.showMessageDialog(rootPane, "aefdadsf");
            }
        } catch (Exception ex) {
            Logger.getLogger(RegistrationWithPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
