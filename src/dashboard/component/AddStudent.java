package dashboard.component;

import java.awt.Color;
import java.sql.*;
import org.jdesktop.animation.timing.*;
import util.popup.*;


public class AddStudent extends javax.swing.JFrame {
    
    public boolean isClicked() {
        return Clicked;
    }

    public void setIsClicked(boolean isClicked) {
        this.Clicked = isClicked;
    }
    
    private final Animator animator;
    private boolean show = true;
    private boolean Clicked = false;
    
    public AddStudent() {
        initComponents();
        GlassPanePopup.install(AddStudent.this);
        setOpacity(0f);
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (show) {
                    setOpacity(fraction);
                } else {
                    setOpacity(1f - fraction);
                }
            }

            @Override
            public void end() {
                if (show == false) {
                    setVisible(false);
                }
            }

        };
        animator = new Animator(200, target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
    }
    
    public void open(){
        if(isClicked()){
            animator.start();
            setVisible (true);
        }
    }
    
    private void close() {
        if (animator.isRunning()) {
            animator.stop();
        }
        show = false;
        animator.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        studentid = new main.components.TextField();
        name = new main.components.TextField();
        course = new main.components.TextField();
        section = new main.components.TextField();
        gender = new main.components.TextField();
        gpa = new main.components.TextField();
        submit = new main.components.Button();
        exit = new main.components.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(228, 225, 212));

        studentid.setForeground(new java.awt.Color(95, 111, 117));
        studentid.setText("Student ID");
        studentid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        studentid.setForeGroundColor(new java.awt.Color(37, 52, 57));
        studentid.setHintColor(new java.awt.Color(95, 111, 117));
        studentid.setLabel("Student ID");

        name.setForeground(new java.awt.Color(95, 111, 117));
        name.setText("Student Name");
        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name.setForeGroundColor(new java.awt.Color(37, 52, 57));
        name.setHintColor(new java.awt.Color(95, 111, 117));
        name.setLabel("Student Name");

        course.setForeground(new java.awt.Color(95, 111, 117));
        course.setText("Student Course");
        course.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        course.setForeGroundColor(new java.awt.Color(37, 52, 57));
        course.setHintColor(new java.awt.Color(95, 111, 117));
        course.setLabel("Student Course");

        section.setForeground(new java.awt.Color(95, 111, 117));
        section.setText("Student Section");
        section.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        section.setForeGroundColor(new java.awt.Color(37, 52, 57));
        section.setHintColor(new java.awt.Color(95, 111, 117));
        section.setLabel("Student Section");

        gender.setForeground(new java.awt.Color(95, 111, 117));
        gender.setText("Student Gender");
        gender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        gender.setForeGroundColor(new java.awt.Color(37, 52, 57));
        gender.setHintColor(new java.awt.Color(95, 111, 117));
        gender.setLabel("Student Gender");

        gpa.setForeground(new java.awt.Color(95, 111, 117));
        gpa.setText("Student GPA");
        gpa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        gpa.setForeGroundColor(new java.awt.Color(37, 52, 57));
        gpa.setHintColor(new java.awt.Color(95, 111, 117));
        gpa.setLabel("Student GPA");

        submit.setForeground(new java.awt.Color(95, 111, 117));
        submit.setText("Submit");
        submit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        submit.setShadowColor(new Color(101, 118, 123));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 204, 204));
        exit.setForeground(new Color(37, 52, 57));
        exit.setText("X");
        exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exit.setShadowColor(new Color(101, 118, 123));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gpa, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gpa, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        close();
    }//GEN-LAST:event_exitActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection db = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentrecorddbms","root", "");
            Statement state = db.createStatement();
            
            state.executeUpdate("Insert into students(studentID, name, course, section, gender, gpa) " + 
                                "VALUES ('" + studentid.getText() + "','" + name.getText() + "','" + course.getText() + "','" + section.getText() +"','" + gender.getText()+ "','" + gpa.getText() + "')");
            
            GlassPanePopup.showPopup(new SuccessMessage());
            
        }catch(ClassNotFoundException | SQLException e){
           GlassPanePopup.showPopup(new FailMessage());
        }
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.components.TextField course;
    private main.components.Button exit;
    private main.components.TextField gender;
    private main.components.TextField gpa;
    private javax.swing.JPanel jPanel1;
    private main.components.TextField name;
    private main.components.TextField section;
    private main.components.TextField studentid;
    private main.components.Button submit;
    // End of variables declaration//GEN-END:variables
}
