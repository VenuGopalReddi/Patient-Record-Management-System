
package JdbcStep1;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author venu
 */
public class task4 extends javax.swing.JFrame {
 Connection mycon=null;
PreparedStatement pst=null;
ResultSet rs=null;
    /**
     * Creates new form task3
     */
    public task4() {
        initComponents();
         mycon=MySql.ConnectDB();
 Open_table();
        Add.setVisible(false);
        update.setVisible(false);
        delete.setVisible(false);
         // Open_table();
    }
    
     public void Open_table(){
       try {
           String sql="Select trt_id as 'Treatment ID',pat_id as 'Patient ID',treatment_name as 'Treatment Name',Treatment_details as 'Treatment Details',Treatment_track as 'Treatment Track',time_stamped as 'Time Stamped' from treatment ";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           show_table.setModel(DbUtils.resultSetToTableModel(rs));
           }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        show_table = new javax.swing.JTable();
        Add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        header = new javax.swing.JTextField();
        ttrack = new javax.swing.JTextField();
        tname = new javax.swing.JTextField();
        patient_id = new javax.swing.JTextField();
        tid = new javax.swing.JTextField();
        sym = new javax.swing.JLabel();
        patint_id = new javax.swing.JLabel();
        sym_name = new javax.swing.JLabel();
        sym_track = new javax.swing.JLabel();
        Todo = new javax.swing.JComboBox();
        label_id = new javax.swing.JLabel();
        sym_name1 = new javax.swing.JLabel();
        tdetails = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        show_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        show_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(show_table);

        Add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        header.setEditable(false);
        header.setBackground(new java.awt.Color(0, 204, 255));
        header.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        header.setText("PATIENTS LIKE ME");
        header.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headerActionPerformed(evt);
            }
        });

        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });

        patient_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_idActionPerformed(evt);
            }
        });

        tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidActionPerformed(evt);
            }
        });

        sym.setText("Treatment ID");

        patint_id.setText("Patient ID");

        sym_name.setText("Treatment Name");

        sym_track.setText("Treatment Track");

        Todo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Add", "Update", "Delete", "" }));
        Todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodoActionPerformed(evt);
            }
        });

        label_id.setText("To Do");

        sym_name1.setText("Treatment Details");

        tdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdetailsActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(label_id, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Todo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sym_track)
                            .addComponent(sym_name1))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttrack, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jButton1)))
                .addContainerGap(548, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(83, 83, 83)
                    .addComponent(update)
                    .addGap(74, 74, 74)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(209, 209, 209))
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sym)
                        .addComponent(sym_name)
                        .addComponent(patint_id))
                    .addGap(61, 61, 61)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(patient_id, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Todo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(202, 202, 202)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sym_name1)
                    .addComponent(tdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sym_track)
                    .addComponent(ttrack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sym)
                                .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(patint_id)
                                .addComponent(patient_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sym_name)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(94, 94, 94)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void show_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_tableMouseClicked
        // TODO add your handling code here:

        try{
            int row= show_table.getSelectedRow();
            String Table_click=(show_table.getModel().getValueAt(row,0).toString());
            String sql="Select * from treatment where trt_id='"+Table_click+"' ";
            pst=mycon.prepareStatement(sql);
            rs=pst.executeQuery();

            if(rs.next())
            {
                String add1= rs.getString("trt_id");
                tid.setText(add1);
                String add2= rs.getString("pat_id");
                patient_id.setText(add2);
                String add3= rs.getString("treatment_name");
                tname.setText(add3);
                 String add4= rs.getString("treatment_details");
                tdetails.setText(add4);
                String add5= rs.getString("treatment_track");
                ttrack.setText(add5);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_show_tableMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
       
             String sql="insert into treatment(trt_id,pat_id,treatment_track,time_stamped,treatment_name,treatment_details) values(?,?,?,now(),?,?)";
        try{
           pst=mycon.prepareStatement(sql);
            pst.setString(1,tid.getText());
            pst.setString(2,patient_id.getText());
            pst.setString(3,ttrack.getText());
             pst.setString(4,tname.getText());
             pst.setString(5,tdetails.getText());
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "New Record has been inserted");
           Open_table();
        }
        catch(SQLException | HeadlessException e){

            JOptionPane.showMessageDialog(null, e);
        }
          
        
    }//GEN-LAST:event_AddActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try{
            String value1= tid.getText();
            String value2= patient_id.getText();
            //  String value3="'now()'";
            String value4= ttrack.getText();
              String value5= tname.getText();
               String value6= tdetails.getText();
            String sql=" update treatment set treatment_details='"+value6+"', treatment_name='"+value5+"',time_stamped=now(), treatment_track='"+value4+"' ,pat_id='"+value2+"' where trt_id='"+value1+"' ";
            pst=mycon.prepareStatement(sql);
            int rs= pst.executeUpdate();
            if(rs>0){
             JOptionPane.showMessageDialog(null, "Record has been Updated");
             Open_table();
             
        }
            else{
               JOptionPane.showMessageDialog(null, "Please insert the values again");  
            }
        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
      //  String sql="delete from symptoms where sym_id=?";
        String value=tid.getText();
        try{

 String sql="delete from treatment where trt_id='"+value+"' ";
pst=mycon.prepareStatement(sql);
 pst.execute();
JOptionPane.showMessageDialog(null,"Do you really want to delete ?");
 JOptionPane.showMessageDialog(null,"Deleted");
 Open_table();

        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
         
       
        //Open_table();
        Open_table();
    }//GEN-LAST:event_deleteActionPerformed

    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnameActionPerformed

    private void TodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodoActionPerformed
        // TODO add your handling code here:
         if (Todo.getSelectedItem()=="Add"){
           
            Add.setVisible(true);
             update.setVisible(false);
        delete.setVisible(false);
         tid.setEditable(true);
            patient_id.setEditable(true);
            
        }
            if(Todo.getSelectedItem()=="Update"){
            update.setVisible(true);
            tid.setEditable(false);
            patient_id.setEditable(false);
            Add.setVisible(false);
            delete.setVisible(false);
        }
            if(Todo.getSelectedItem()=="Delete"){
            label_id.setVisible(true);
            tid.setVisible(true);
            delete.setVisible(true);
            Add.setVisible(false);
            update.setVisible(false);
             tid.setEditable(true);
            patient_id.setEditable(true);
        }
        
    }//GEN-LAST:event_TodoActionPerformed

    private void patient_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patient_idActionPerformed

    private void tdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdetailsActionPerformed

    private void headerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_headerActionPerformed

    private void tidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        NewPatientLogin t7 = new NewPatientLogin();
        t7.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(task4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(task4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(task4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(task4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new task4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JComboBox Todo;
    private javax.swing.JButton delete;
    private javax.swing.JTextField header;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_id;
    private javax.swing.JTextField patient_id;
    private javax.swing.JLabel patint_id;
    private javax.swing.JTable show_table;
    private javax.swing.JLabel sym;
    private javax.swing.JLabel sym_name;
    private javax.swing.JLabel sym_name1;
    private javax.swing.JLabel sym_track;
    private javax.swing.JTextField tdetails;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField ttrack;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
