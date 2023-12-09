
package dashboard.component;

import dashboard.model.studentTableModel;
import java.awt.Color;
import java.sql.*;
import main.Main;
import org.jdesktop.animation.timing.*;
import util.popup.*;


public class UpdateStudent extends javax.swing.JFrame {

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public boolean isClicked() {
        return clicked;
    }
    
    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    } 
    private int id;
    private Animator animator;
    private boolean show = true;
    private boolean clicked = false;
    
    
    public UpdateStudent() {
        initComponents();
        setOpacity(0f);
        GlassPanePopup.install(UpdateStudent.this);
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField2 = new main.components.TextField();
        jPanel1 = new javax.swing.JPanel();
        Submit = new main.components.Button();
        exit = new main.components.Button();
        newName = new main.components.TextField();
        newCourse = new main.components.TextField();
        newSection = new main.components.TextField();
        newGender = new main.components.TextField();
        newGPA = new main.components.TextField();

        textField2.setText("Student Name");
        textField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textField2.setLabel("Student Name");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(228, 225, 212));

        Submit.setForeground(new java.awt.Color(95, 111, 117));
        Submit.setText("Submit");
        Submit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
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

        newName.setForeground(new java.awt.Color(95, 111, 117));
        newName.setText("Student Name");
        newName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newName.setForeGroundColor(new java.awt.Color(8, 8, 6));
        newName.setHintColor(new java.awt.Color(95, 111, 117));
        newName.setLabel("Student Name");

        newCourse.setForeground(new java.awt.Color(95, 111, 117));
        newCourse.setText("Student Course");
        newCourse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newCourse.setForeGroundColor(new java.awt.Color(8, 8, 6));
        newCourse.setHintColor(new java.awt.Color(95, 111, 117));
        newCourse.setLabel("Student Course");
        newCourse.setName("Student Course"); // NOI18N

        newSection.setForeground(new java.awt.Color(95, 111, 117));
        newSection.setText("Student Section");
        newSection.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newSection.setForeGroundColor(new java.awt.Color(8, 8, 6));
        newSection.setHintColor(new java.awt.Color(95, 111, 117));
        newSection.setLabel("Student Section");

        newGender.setForeground(new java.awt.Color(95, 111, 117));
        newGender.setText("Student Gender");
        newGender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newGender.setForeGroundColor(new java.awt.Color(8, 8, 6));
        newGender.setHintColor(new java.awt.Color(95, 111, 117));
        newGender.setLabel("Student Gender");

        newGPA.setForeground(new java.awt.Color(95, 111, 117));
        newGPA.setText("Student GPA");
        newGPA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newGPA.setForeGroundColor(new java.awt.Color(8, 8, 6));
        newGPA.setHintColor(new java.awt.Color(95, 111, 117));
        newGPA.setLabel("Student GPA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newGPA, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addComponent(newGender, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addComponent(newSection, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addComponent(newCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addComponent(newName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(newName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newSection, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newGender, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
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

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection db = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentrecorddbms","root", "");
            Statement state = db.createStatement();
            
            if (showConfirmPopup()){
                state.executeUpdate("UPDATE students SET  name= '" + newName.getText() + "',course= '" + newCourse.getText()+"', section= '" + newSection.getText() + "',gender= '" + newGender.getText() +
                        "',gpa = '"+ newGPA.getText() + "' Where studentID = '" + id + "' "); 
                GlassPanePopup.showPopup(new SuccessMessage());
            } 
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
            GlassPanePopup.showPopup(new FailMessage());
        }
    }//GEN-LAST:event_SubmitActionPerformed

    
    public void open(){
        if(isClicked()){
            animator.start();
            setVisible(true);
        }
    }
    public void close(){
        if (animator.isRunning()) {
            animator.stop();
        }
        show = false;
        animator.start();
    }
    
    private boolean showConfirmPopup(){
        confirmPopup cp = new confirmPopup(Main.getFrames()[0], true);
        cp.openConfirmDialog("Are you sure you want to update this record?");
        return cp.isConfirmed();
    }
    
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
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UpdateStudent().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.components.Button Submit;
    private main.components.Button exit;
    private javax.swing.JPanel jPanel1;
    private main.components.TextField newCourse;
    private main.components.TextField newGPA;
    private main.components.TextField newGender;
    private main.components.TextField newName;
    private main.components.TextField newSection;
    private main.components.TextField textField2;
    // End of variables declaration//GEN-END:variables
}
