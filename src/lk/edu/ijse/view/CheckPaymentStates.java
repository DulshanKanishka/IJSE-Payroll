/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.view;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;
import lk.edu.ijse.controller.ControllerFactory;
import lk.edu.ijse.controller.custom.BatchController;
import lk.edu.ijse.controller.custom.BatchTransferController;
import lk.edu.ijse.controller.custom.CourseController;
import lk.edu.ijse.controller.custom.PaymentController;
import lk.edu.ijse.controller.custom.RegistrationController;
import lk.edu.ijse.controller.custom.StudentController;
import lk.edu.ijse.dto.BatchDTO;
import lk.edu.ijse.dto.BatchTransferDTO;
import lk.edu.ijse.dto.CourseDTO;
import lk.edu.ijse.dto.PaymentDTO;
import lk.edu.ijse.dto.RegistrationDTO;
import lk.edu.ijse.dto.StudentDTO;
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
public class CheckPaymentStates extends javax.swing.JFrame {

    private static String rId;
    private RegistrationController registrationController;
    private CourseController courseController;
    private BatchController batchController;
    private StudentController studentController;
    private PaymentController paymentController;
    private BatchTransferController batchTransferController;

    /**
     * Creates new form CheckPaymentStates
     */
    public CheckPaymentStates() {
        initComponents();

        setLocationRelativeTo(null);
        registrationController = (RegistrationController) ControllerFactory.getIntense().getServices(ControllerFactory.getServicesType.REGISTRATION);
        studentController = (StudentController) ControllerFactory.getIntense().getServices(ControllerFactory.getServicesType.STUDENT);
        batchController = (BatchController) ControllerFactory.getIntense().getServices(ControllerFactory.getServicesType.BATCH);
        courseController = (CourseController) ControllerFactory.getIntense().getServices(ControllerFactory.getServicesType.COURSE);
        paymentController = (PaymentController) ControllerFactory.getIntense().getServices(ControllerFactory.getServicesType.PAYMENT);
        batchTransferController = (BatchTransferController) ControllerFactory.getIntense().getServices(ControllerFactory.getServicesType.BATCHTRANSFER);

//        loadCombo();
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
        HOME_TIME1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HOME_TIME = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BatchTxt = new javax.swing.JTextField();
        StudentTxt = new javax.swing.JTextField();
        RegIdSearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        checkbox1 = new java.awt.Checkbox();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jg = new javax.swing.JScrollPane();
        RegistrationTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.gray);

        jPanel3.setBackground(java.awt.Color.darkGray);

        HOME_TIME1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        HOME_TIME1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PAYMENT STATE");

        HOME_TIME.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        HOME_TIME.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HOME_TIME1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Student Id");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 22, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Batch");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 77, -1, -1));

        BatchTxt.setMinimumSize(new java.awt.Dimension(6, 30));
        BatchTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BatchTxtMouseClicked(evt);
            }
        });
        jPanel4.add(BatchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 73, 285, -1));

        StudentTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentTxtMouseClicked(evt);
            }
        });
        StudentTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentTxtActionPerformed(evt);
            }
        });
        jPanel4.add(StudentTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 18, 285, -1));

        RegIdSearch.setMinimumSize(new java.awt.Dimension(6, 30));
        RegIdSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegIdSearchMouseClicked(evt);
            }
        });
        jPanel4.add(RegIdSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 21, 286, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Reg ID");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 28, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton2.setText("Search With Student ID");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 18, 244, -1));

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton3.setText("Search With Reg ID");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1114, 18, 260, -1));

        jButton5.setBackground(new java.awt.Color(153, 204, 255));
        jButton5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton5.setText("Search With Student Batch");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 67, -1, -1));

        jButton7.setBackground(new java.awt.Color(153, 204, 255));
        jButton7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton7.setText("Payment");
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 142, -1, 45));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 142, 99, 45));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Nearby  Payments");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 163, -1, -1));

        checkbox1.setLabel("checkbox1");
        checkbox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkbox1ItemStateChanged(evt);
            }
        });
        jPanel4.add(checkbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 163, 17, 24));

        jButton8.setBackground(new java.awt.Color(153, 204, 255));
        jButton8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton8.setText("Check Profits");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 142, -1, 45));

        jButton9.setBackground(new java.awt.Color(153, 204, 255));
        jButton9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton9.setText("Pending Payment Report");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 142, -1, 45));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/edu/ijse/Images/seamless-white-pattern-background-vector-id508007780.jpg"))); // NOI18N
        jLabel15.setText("jLabel14");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 200));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/edu/ijse/Images/seamless-white-pattern-background-vector-id508007780.jpg"))); // NOI18N
        jLabel26.setText("jLabel14");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 610, 200));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/edu/ijse/Images/seamless-white-pattern-background-vector-id508007780.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 180, 200));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistrationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registration Id", "Batch ID", "Student Id", "Payment Id", "Payment State", "Arrears", "NextPayment Date", "BTID"
            }
        ));
        jg.setViewportView(RegistrationTable);

        jPanel2.add(jg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 510));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainPage mainPage = new MainPage();
        mainPage.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        viewAllReg();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            //viewAllStudent();
            DefaultTableModel dtm = (DefaultTableModel) RegistrationTable.getModel();
            dtm.setRowCount(0);
            ArrayList<RegistrationDTO> searchh = registrationController.SearchAllAndSort1(StudentTxt.getText());
            if (searchh != null) {
                PaymentDTO dTO = null;
                for (RegistrationDTO registrationDTO : searchh) {
                    ArrayList<PaymentDTO> SearchAllAndShort1 = paymentController.SearchAllAndShort1(registrationDTO.getRid());
                    BatchTransferDTO SearchAllAndShort = batchTransferController.SearchAllAndShort(registrationDTO.getRid());
                    String tid = "";
                    if (SearchAllAndShort == null) {
                        tid = "no";
                    } else {
                        tid = SearchAllAndShort.getbTID();
                    }
                    for (PaymentDTO i1 : SearchAllAndShort1) {
                        Object[] ary = {i1.getRegId(), registrationDTO.getBatchid(), registrationDTO.getStudentid(), i1.getPid(), i1.getPaymentstate(), i1.getArrears(), i1.getNextPaymentDate(), tid};
                        dtm.addRow(ary);
                    }
                }
            }
            ClearTXt();
        } catch (Exception ex) {
            Logger.getLogger(CheckPaymentStates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            //viewAllStudent();
            DefaultTableModel dtm = (DefaultTableModel) RegistrationTable.getModel();
            dtm.setRowCount(0);
            ArrayList<RegistrationDTO> searchh = registrationController.SearchAllAndSort2(BatchTxt.getText());
            if (searchh != null) {
                PaymentDTO dTO = null;
                for (RegistrationDTO registrationDTO : searchh) {
                    BatchTransferDTO SearchAllAndShort = batchTransferController.SearchAllAndShort(registrationDTO.getRid());
                    String tid = "";
                    if (SearchAllAndShort == null) {
                        tid = "no";
                    } else {
                        tid = SearchAllAndShort.getbTID();
                    }
                    ArrayList<PaymentDTO> SearchAllAndShort1 = paymentController.SearchAllAndShort1(registrationDTO.getRid());
                    for (PaymentDTO i1 : SearchAllAndShort1) {
                        Object[] ary = {i1.getRegId(), registrationDTO.getBatchid(), registrationDTO.getStudentid(), i1.getPid(), i1.getPaymentstate(), i1.getArrears(), i1.getNextPaymentDate(), tid};
                        dtm.addRow(ary);
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(CheckPaymentStates.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void checkbox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkbox1ItemStateChanged
        Sorting();        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox1ItemStateChanged

    private void StudentTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentTxtMouseClicked

        ClearTXt();        // TODO add your handling code here:
    }//GEN-LAST:event_StudentTxtMouseClicked

    private void RegIdSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegIdSearchMouseClicked

        ClearTXt();        // TODO add your handling code here:
    }//GEN-LAST:event_RegIdSearchMouseClicked

    private void BatchTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BatchTxtMouseClicked

        ClearTXt();        // TODO add your handling code here:
    }//GEN-LAST:event_BatchTxtMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Incomes incomes = new Incomes();
        incomes.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        P();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(CheckPaymentStates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckPaymentStates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckPaymentStates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckPaymentStates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckPaymentStates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BatchTxt;
    private javax.swing.JLabel HOME_TIME;
    private javax.swing.JLabel HOME_TIME1;
    private javax.swing.JTextField RegIdSearch;
    private javax.swing.JTable RegistrationTable;
    private javax.swing.JTextField StudentTxt;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jg;
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

    private void viewAllReg() {
        try {
//            PaymentDTO SearchAllAnsShort5 = paymentController.SearchAllAndShort(RegIdSearch.getText());
            DefaultTableModel defaultTableModel = (DefaultTableModel) RegistrationTable.getModel();
            defaultTableModel.setRowCount(0);

            ArrayList<PaymentDTO> searchAll = paymentController.SearchAllAndShort1(RegIdSearch.getText());
            RegistrationDTO s = registrationController.Search(RegIdSearch.getText());
            for (PaymentDTO i1 : searchAll) {
                BatchTransferDTO SearchAllAndShort = batchTransferController.SearchAllAndShort(s.getRid());
                String tid = "";
                if (SearchAllAndShort == null) {
                    tid = "no";
                } else {
                    tid = SearchAllAndShort.getbTID();
                }
                Object[] rodate = {s.getRid(), s.getBatchid(), s.getStudentid(), i1.getPid(), i1.getPaymentstate(), i1.getPaymentstate(), i1.getArrears(), i1.getNextPaymentDate(), tid};
                defaultTableModel.addRow(rodate);

            }
        } catch (Exception ex) {
            Logger.getLogger(ManageCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Sorting() {
        try {
            ArrayList<PaymentDTO> SearchAll = paymentController.SearchAll();
            ArrayList<String> list = new ArrayList<String>();

            for (int a = 0; a < SearchAll.size(); a++) {   // getAll Date
                String entry_time = SearchAll.get(a).getNextPaymentDate();
                list.add(entry_time);
            }

            Collections.sort(list); // sorting the list

            String lastvehicle = "";   // las vehicle

            for (String string : list) {  // set last vehicele
                lastvehicle = string;
                break;
            }

            DefaultTableModel defaultTableModel = (DefaultTableModel) RegistrationTable.getModel();
            defaultTableModel.setRowCount(0);

            for (int i = 0; i < SearchAll.size(); i++) {
                if (SearchAll.get(i).getNextPaymentDate().equals("Payment Is End")) {

                } else {
                    RegistrationDTO Search = registrationController.Search(SearchAll.get(i).getRegId());
                    if (Search == null) {
                        return;
                    }
                    Object[] rodate = {SearchAll.get(i).getRegId(), Search.getBatchid(), Search.getStudentid(), SearchAll.get(i).getPid(), SearchAll.get(i).getPaymentstate(), SearchAll.get(i).getArrears(), SearchAll.get(i).getNextPaymentDate()};
                    defaultTableModel.addRow(rodate);
                }

            }
        } catch (Exception ex) {
            Logger.getLogger(CheckPaymentStates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void P() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/IJSEPayments", "root", "ijse");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StartUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(StartUp.class.getResourceAsStream("/lk//edu//ijse//Reports/Income daily.jasper"));         // TODO add your handling code here:
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap<>(), conn);
            JasperViewer jasperViewer = new JasperViewer(jasperPrint);
            java.awt.Container container = jasperViewer.getContentPane();

            JDialog jDialog = new JDialog();

            jDialog.setContentPane(container);
            jDialog.setSize(jasperViewer.getSize());
            jDialog.setLocationRelativeTo(null);
            jDialog.setVisible(true);
        } catch (JRException ex) {

        }
    }

    private void ClearTXt() {

        StudentTxt.setText("");
        BatchTxt.setText("");
        RegIdSearch.setText("");
    }
}
