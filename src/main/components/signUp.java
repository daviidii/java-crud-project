/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.components;

import util.popup.*;
import java.awt.*;
import main.Main;
import java.sql.*;

/**
 *
 * @author david
 */
public class signUp extends javax.swing.JFrame {
    public signUp() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        signUpPanel1.initMove(signUp.this);
        GlassPanePopup.install(signUp.this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain1 = new main.components.panelMain();
        signUpPanel1 = new main.components.signUpPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signupButton = new main.components.Button();
        firstname = new main.components.TextField();
        lastname = new main.components.TextField();
        email = new main.components.TextField();
        password = new main.components.PasswordField();
        cancel = new main.components.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelMain1.setBackground(new Color(234, 225, 210));
        panelMain1.setPreferredSize(new java.awt.Dimension(1554, 888));

        signUpPanel1.setPreferredSize(new java.awt.Dimension(600, 888));

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("By clicking \"Submit\" above, you acknowledge that you have read and understood");

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("and agree to our Terms & conditions and Privacy Policy.");

        signupButton.setForeground(new java.awt.Color(178, 158, 132));
        signupButton.setText("Submit");
        signupButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signupButton.setRippleColor(new java.awt.Color(37, 53, 80));
        signupButton.setRound(70);
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        firstname.setForeground(new java.awt.Color(222, 207, 186));
        firstname.setText("First name");
        firstname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstname.setForeGroundColor(new java.awt.Color(178, 158, 132));
        firstname.setHintColor(new java.awt.Color(222, 207, 186));
        firstname.setLabel("First name");

        lastname.setForeground(new java.awt.Color(222, 207, 186));
        lastname.setText("Last name");
        lastname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lastname.setForeGroundColor(new java.awt.Color(178, 158, 132));
        lastname.setHintColor(new java.awt.Color(222, 207, 186));
        lastname.setLabel("Last name");

        email.setForeground(new java.awt.Color(222, 207, 186));
        email.setText("Email Address");
        email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        email.setForeGroundColor(new java.awt.Color(178, 158, 132));
        email.setHintColor(new java.awt.Color(222, 207, 186));
        email.setLabel("Email Address");

        password.setText("Password");
        password.setEchoChar('\u0000');
        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cancel.setBackground(new java.awt.Color(234, 225, 210));
        cancel.setForeground(new java.awt.Color(178, 158, 132));
        cancel.setText("Cancel");
        cancel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cancel.setShadowColor(new Color(234, 225, 210));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMain1Layout = new javax.swing.GroupLayout(panelMain1);
        panelMain1.setLayout(panelMain1Layout);
        panelMain1Layout.setHorizontalGroup(
            panelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMain1Layout.createSequentialGroup()
                .addComponent(signUpPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMain1Layout.createSequentialGroup()
                        .addGroup(panelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMain1Layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addGroup(panelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(panelMain1Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel2))))
                            .addGroup(panelMain1Layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addGroup(panelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lastname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))))
                        .addContainerGap(288, Short.MAX_VALUE))
                    .addGroup(panelMain1Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMain1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelMain1Layout.setVerticalGroup(
            panelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMain1Layout.createSequentialGroup()
                .addComponent(signUpPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelMain1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201)
                .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection db = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentrecorddbms","root", "");
            Statement state = db.createStatement();
            if((firstname.getText().equals("First name")) || (lastname.getText().equals("Last name")) || (email.getText().equals("Email Address")) || (password.getText().equals("Password"))){ 
                GlassPanePopup.showPopup(new BlankError());
            }
            else{
                state.executeUpdate("Insert into signup(firstname, lastname, email, pass) " + 
                                "VALUES ('" + firstname.getText() + "','" + lastname.getText() + "','" + email.getText() + "','"  + password.getText()+ "')");
                state.executeUpdate("Insert into login(user,pass) " + "VALUES ('" + email.getText() + "','" + password.getText() + "')");

                GlassPanePopup.showPopup(new SuccessMessage());
            }
        }catch (ClassNotFoundException | SQLException e){
            GlassPanePopup.showPopup(new FailMessage());
        }
    }//GEN-LAST:event_signupButtonActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        Main login = new Main();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    
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
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.components.Button cancel;
    private main.components.TextField email;
    private main.components.TextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private main.components.TextField lastname;
    private main.components.panelMain panelMain1;
    private main.components.PasswordField password;
    private main.components.signUpPanel signUpPanel1;
    private main.components.Button signupButton;
    // End of variables declaration//GEN-END:variables
}
