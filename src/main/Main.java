
package main;
import util.popup.IncPwrd;
import util.popup.BlankError;
import main.components.signUp;
import dashboard.main.DashboardMain;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.sql.*;
import java.util.Collections;
import javax.swing.JFrame;
import util.popup.GlassPanePopup;

public class Main extends javax.swing.JFrame {
    
    public Main() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        imagePanel.initMove(Main.this);
        GlassPanePopup.install(Main.this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain1 = new main.components.panelMain();
        imagePanel = new main.components.ImagePanel();
        login = new main.components.Button();
        jLabel1 = new javax.swing.JLabel();
        signUp = new javax.swing.JLabel();
        pass = new main.components.PasswordField();
        minButton = new main.components.Button();
        button1 = new main.components.Button();
        email = new main.components.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelMain1.setBackground(new java.awt.Color(218, 202, 175));

        login.setForeground(new Color(178,158,132));
        login.setText("LOGIN");
        login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login.setIconTextGap(10);
        login.setRippleColor(new java.awt.Color(37, 53, 80));
        login.setRound(70);
        login.setShadowColor(new java.awt.Color(37, 53, 80));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new Color(37,52,57));
        jLabel1.setText("Don't have an account?");

        signUp.setFont(new Font("Segoe UI", Font.PLAIN, 18).deriveFont(Collections.singletonMap(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON)));
        signUp.setForeground(new Color(37,52,57));
        signUp.setText("Sign up");
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpMouseExited(evt);
            }
        });

        pass.setText("Password");
        pass.setEchoChar('\u0000');
        pass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        minButton.setText("-");
        minButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        minButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minButtonActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(255, 204, 204));
        button1.setText("X");
        button1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        email.setForeground(new java.awt.Color(222, 207, 186));
        email.setText("Email Address");
        email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        email.setForeGroundColor(new java.awt.Color(178, 158, 132));
        email.setHintColor(new java.awt.Color(222, 207, 186));
        email.setLabel("Email Address");

        javax.swing.GroupLayout panelMain1Layout = new javax.swing.GroupLayout(panelMain1);
        panelMain1.setLayout(panelMain1Layout);
        panelMain1Layout.setHorizontalGroup(
            panelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMain1Layout.createSequentialGroup()
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                .addGroup(panelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMain1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(minButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMain1Layout.createSequentialGroup()
                        .addGroup(panelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMain1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signUp)
                                .addGap(44, 44, 44))
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 313, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelMain1Layout.setVerticalGroup(
            panelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMain1Layout.createSequentialGroup()
                .addGroup(panelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(signUp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelMain1Layout.createSequentialGroup()
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseClicked
       signUp signup = new signUp();
       signup.setVisible(true);
       dispose();
    }//GEN-LAST:event_signUpMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try{
            String uname = email.getText();
            String pword = pass.getText();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection db = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentrecorddbms","root", "");
            Statement state = db.createStatement();
            
            ResultSet capturedData = state.executeQuery("SELECT * FROM login WHERE user = '" + uname + "' and pass = '" + pword + "'");
            
            String capturedEmail = "", capturedPass = "";
            
            if(capturedData.next()){
                capturedEmail = capturedData.getString("user");
                capturedPass = capturedData.getString("pass");
            }
            
            if(uname.equals("Email Address") && pword.equals("Password")){
                GlassPanePopup.showPopup(new BlankError());
            }
            else if(uname.equals("") && pword.equals("")){
                GlassPanePopup.showPopup(new BlankError());
            }
            else if (uname.equals(capturedEmail) && pword.equals(capturedPass)){
                DashboardMain dm = new DashboardMain();
                dm.setVisible(true);
                dispose();
            }
            else{
                GlassPanePopup.showPopup(new IncPwrd());
                email.setText("");
                pass.setText("");
            }
        }catch(ClassNotFoundException | SQLException e){}
    }//GEN-LAST:event_loginActionPerformed

    private void minButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minButtonActionPerformed
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minButtonActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_button1ActionPerformed

    private void signUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_signUpMouseEntered

    private void signUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_signUpMouseExited

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.components.Button button1;
    private main.components.TextField email;
    private main.components.ImagePanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private main.components.Button login;
    private main.components.Button minButton;
    private main.components.panelMain panelMain1;
    private main.components.PasswordField pass;
    private javax.swing.JLabel signUp;
    // End of variables declaration//GEN-END:variables
}
