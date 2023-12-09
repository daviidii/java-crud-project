package dashboard.pages;

import dashboard.component.*;
import dashboard.model.studentTableModel;
import dashboard.table.EventAction;
import java.awt.*;
import java.sql.*;
import main.Main;
import util.popup.confirmPopup;

public class BsIT_Page extends javax.swing.JPanel {
    
    public BsIT_Page() {
        initComponents();
        setOpaque(false);
        initTable();
        table1.setTableScroll(jScrollPane1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new dashboard.table.Table();
        add = new dashboard.swing.Button();
        refresh = new dashboard.swing.Button();

        setBackground(new java.awt.Color(210, 209, 206));

        jPanel1.setBackground(new java.awt.Color(234, 225, 210));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Student Data");

        jScrollPane1.setBackground(new java.awt.Color(234, 225, 210));

        table1.setBackground(new java.awt.Color(234, 225, 210));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Course", "Section", "Gender", "GPA", "Update/Delete"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setSelectionBackground(new java.awt.Color(234, 225, 210));
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setHeaderValue("Student ID");
            table1.getColumnModel().getColumn(1).setHeaderValue("Name");
            table1.getColumnModel().getColumn(2).setHeaderValue("Course");
            table1.getColumnModel().getColumn(3).setHeaderValue("Section");
            table1.getColumnModel().getColumn(4).setHeaderValue("Gender");
            table1.getColumnModel().getColumn(5).setHeaderValue("GPA");
            table1.getColumnModel().getColumn(6).setHeaderValue("Update/Delete");
        }

        add.setBackground(new java.awt.Color(234, 225, 210));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        refresh.setBackground(new java.awt.Color(234, 225, 210));
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh.png"))); // NOI18N
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        AddStudent form = new AddStudent();
        form.setIsClicked(true);
        form.open();
    }//GEN-LAST:event_addActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
         table1.clearData();
         initTable();
    }//GEN-LAST:event_refreshActionPerformed
    
    
    public void initTable(){
        EventAction e = new EventAction(){
            @Override
            public void delete(studentTableModel st) {
                if(showConfirmPopup()){
                    del(st.getStudentId());
                }
            }

            @Override
            public void update(studentTableModel st) {
                UpdateStudent up = new UpdateStudent();
                up.setClicked(true);
                up.setId(st.getStudentId());
                up.open();
            }
        };
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection db = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentrecorddbms","root", "");
                Statement state = db.createStatement();
            
                ResultSet capturedData = state.executeQuery("SELECT * FROM students");
                
                while(capturedData.next()){
                    int id = capturedData.getInt(1);
                    String name = capturedData.getString(2);
                    String course = capturedData.getString(3);
                    String section = capturedData.getString(4);
                    String gender = capturedData.getString(5);
                    float gpa = capturedData.getFloat(6);
                
                    table1.addData(new studentTableModel(id, name, course, section, gender, gpa).toRowTable(e));
                }
                    
            }catch(ClassNotFoundException | SQLException ex){}
    }
    
    public void del(int studentId){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection db = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentrecorddbms","root", "");
            Statement state = db.createStatement();
            
            state.executeUpdate("Delete From students Where studentID= " + studentId);
        }catch(HeadlessException | ClassNotFoundException | SQLException e){}
    }
    
    private boolean showConfirmPopup(){
        confirmPopup cp = new confirmPopup(Main.getFrames()[0], true);
        cp.openConfirmDialog("Are you sure you want to delete this record?");
        return cp.isConfirmed();
    }

    
    
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dashboard.swing.Button add;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private dashboard.swing.Button refresh;
    private dashboard.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
