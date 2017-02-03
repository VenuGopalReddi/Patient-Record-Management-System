
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
public class task3 extends javax.swing.JFrame {
 Connection mycon=null;
PreparedStatement pst=null;
ResultSet rs=null;
    /**
     * Creates new form task3
     */
    public task3() {
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
           String sql="Select sym_id as 'Sym ID',pat_id as 'Patient ID',sym_name as 'Symptom Name',symptom_track as 'Sym Track',time_stamped as 'Time Stamped' from symptoms ";
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
        symptom_track = new javax.swing.JTextField();
        symptom_name = new javax.swing.JTextField();
        patient_id = new javax.swing.JTextField();
        sym_id = new javax.swing.JTextField();
        sym = new javax.swing.JLabel();
        patint_id = new javax.swing.JLabel();
        sym_name = new javax.swing.JLabel();
        sym_track = new javax.swing.JLabel();
        Todo = new javax.swing.JComboBox();
        label_id = new javax.swing.JLabel();
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

        symptom_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptom_nameActionPerformed(evt);
            }
        });

        patient_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_idActionPerformed(evt);
            }
        });

        sym.setText("Symtom ID");

        patint_id.setText("Patient ID");

        sym_name.setText("Symptom Name");

        sym_track.setText("Symptom Track");

        Todo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Add", "Update", "Delete", "" }));
        Todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodoActionPerformed(evt);
            }
        });

        label_id.setText("To Do");

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
                        .addGap(58, 58, 58)
                        .addComponent(sym_track)
                        .addGap(65, 65, 65)
                        .addComponent(symptom_track, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(label_id, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Todo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
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
                        .addComponent(symptom_name, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sym_id, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(204, 204, 204)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sym_track)
                    .addComponent(symptom_track, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(162, 162, 162))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sym)
                                .addComponent(sym_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(patint_id)
                                .addComponent(patient_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(symptom_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            String sql="Select * from symptoms where sym_id='"+Table_click+"' ";
            pst=mycon.prepareStatement(sql);
            rs=pst.executeQuery();

            if(rs.next())
            {
                String add1= rs.getString("sym_id");
                sym_id.setText(add1);
                String add2= rs.getString("pat_id");
                patient_id.setText(add2);
                String add3= rs.getString("sym_name");
                symptom_name.setText(add3);
                String add4= rs.getString("symptom_track");
                symptom_track.setText(add4);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_show_tableMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
       
             String sql="insert into symptoms(sym_id,pat_id,symptom_track,time_stamped,sym_name) values(?,?,?,now(),?)";
        try{
           pst=mycon.prepareStatement(sql);
            pst.setString(1,sym_id.getText());
            pst.setString(2,patient_id.getText());
            pst.setString(3,symptom_track.getText());
             pst.setString(4,symptom_name.getText());
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
            String value1= sym_id.getText();
            String value2= patient_id.getText();
            //  String value3="'now()'";
            String value4= symptom_track.getText();
              String value5= symptom_name.getText();
            String sql=" update symptoms set sym_name='"+value5+"',time_stamped=now(), symptom_track='"+value4+"' ,pat_id='"+value2+"' where sym_id='"+value1+"' ";
            pst=mycon.prepareStatement(sql);
            int rs= pst.executeUpdate();
            if(rs>0){
             JOptionPane.showMessageDialog(null, "Record has been Updated");
             
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
        String value=sym_id.getText();
        try{

 String sql="delete from symptoms where sym_id='"+value+"' ";
pst=mycon.prepareStatement(sql);
 pst.execute();
JOptionPane.showMessageDialog(null,"Do you really want to delete ?");
 JOptionPane.showMessageDialog(null,"Deleted");

        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
         
       
        //Open_table();
        Open_table();
    }//GEN-LAST:event_deleteActionPerformed

    private void symptom_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptom_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symptom_nameActionPerformed

    private void TodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodoActionPerformed
        // TODO add your handling code here:
         if (Todo.getSelectedItem()=="Add"){
           
            Add.setVisible(true);
             update.setVisible(false);
        delete.setVisible(false);
         sym_id.setEditable(true);
            patient_id.setEditable(true);
            
        }
            if(Todo.getSelectedItem()=="Update"){
            update.setVisible(true);
            sym_id.setEditable(false);
            patient_id.setEditable(false);
            Add.setVisible(false);
            delete.setVisible(false);
        }
            if(Todo.getSelectedItem()=="Delete"){
            patient_id.setVisible(true);
            sym_id.setVisible(true);
            delete.setVisible(true);
            Add.setVisible(false);
            update.setVisible(false);
        }
        
    }//GEN-LAST:event_TodoActionPerformed

    private void patient_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patient_idActionPerformed

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
            java.util.logging.Logger.getLogger(task3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(task3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(task3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(task3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new task3().setVisible(true);
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
    private javax.swing.JTextField sym_id;
    private javax.swing.JLabel sym_name;
    private javax.swing.JLabel sym_track;
    private javax.swing.JTextField symptom_name;
    private javax.swing.JTextField symptom_track;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
