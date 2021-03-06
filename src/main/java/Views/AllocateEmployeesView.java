
package Views;

import DBLayer.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;





public class AllocateEmployeesView extends javax.swing.JFrame {

    public static int AllocatedQty;
    public static String EmployeeID;    
    
    private DatabaseConnection singleConn;
    
    public AllocateEmployeesView() {
        initComponents();
         
        singleConn = DatabaseConnection.getSingleInstance();   
        
        ViewPartsTable();
        
        
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtWatchRepairJob = new javax.swing.JTextField();
        btnaddParts = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblParts = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAllocatedParts = new javax.swing.JTable();
        btnAllocate = new javax.swing.JButton();
        btnRemoveParts = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Allocate employee to the job");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Watch Repair ID");

        btnaddParts.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnaddParts.setText("Add Parts");
        btnaddParts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddPartsActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Parts In Stock");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Allocated Parts to the Job");

        tblParts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Part ID", "Part Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblParts);

        tblAllocatedParts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Part ID", "Part Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAllocatedParts);

        btnAllocate.setText("Allocate");
        btnAllocate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllocateActionPerformed(evt);
            }
        });

        btnRemoveParts.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRemoveParts.setText("Remove Parts");
        btnRemoveParts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePartsActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(76, 76, 76)))
                                .addGap(60, 60, 60))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btnaddParts)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemoveParts)
                                .addGap(94, 94, 94))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(227, 227, 227))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtWatchRepairJob, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txtEmployeeID)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(btnAllocate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtWatchRepairJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemoveParts)
                            .addComponent(btnaddParts))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15)
                .addComponent(btnAllocate)
                .addGap(4, 4, 4)
                .addComponent(btnBack)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 830, 630));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org.me.mypics.resources/2048x1288-px-Bert-Seinstra-clocks-dark-monochrome-1426337-wallhere.com.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 910, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewPartsTable(){
        String query = "select * from parts";
                
        try {
            PreparedStatement singleConn = DBLayer.DatabaseConnection.con.prepareStatement(query);
            ResultSet rs = singleConn.executeQuery();
            DefaultTableModel model = (DefaultTableModel)tblParts.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String[] {rs.getString(1), rs.getString(2), rs.getString(3)});
            }
            rs.close();
            singleConn.close();
            
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }
    private void btnaddPartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddPartsActionPerformed
        
        int row = tblParts.getSelectedRow();
        
        String PartID = tblParts.getModel().getValueAt(row, 0).toString();
        String PartName = tblParts.getModel().getValueAt(row, 1).toString();
        

        DefaultTableModel model = (DefaultTableModel) tblAllocatedParts.getModel();
                
        int check = 0;
        
        for (int j = 0; j < tblAllocatedParts.getRowCount(); j++) {
            if ((tblParts.getValueAt(row, 0).toString()).equals(tblAllocatedParts.getValueAt(j, 0).toString())) {
                check++;                
            }
        }          
        
        if (check == 0){
            model.addRow(new String[] {PartID, PartName, null});
        }
        
    }//GEN-LAST:event_btnaddPartsActionPerformed

    private void btnRemovePartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePartsActionPerformed
        int row = tblAllocatedParts.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel) tblAllocatedParts.getModel();
        model.removeRow(row);
    }//GEN-LAST:event_btnRemovePartsActionPerformed

    private void btnAllocateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllocateActionPerformed
        String EmployeeID = txtEmployeeID.getText();
        String WatchRepairID = txtWatchRepairJob.getText();
        
        String query1 = "update watchrepairjob set EmployeeID = " + "'" + EmployeeID + "'" + " where WatchRepairID = " + "'" + WatchRepairID + "'";
        System.out.println(query1);
        boolean result1 = singleConn.ExecuteQuary(query1);

        
        int rowCount = tblAllocatedParts.getRowCount();
        
        for (int i = rowCount; i >0; i--) {
            String AllocatedPartID = tblAllocatedParts.getModel().getValueAt((rowCount-i), 0).toString();
            String AllocatedQty = tblAllocatedParts.getModel().getValueAt((rowCount-i), 2).toString();
            
           // System.out.println(AllocatedPartID + "  "+ AllocatedQty);
           // System.out.println("aasd");
            String query = "update parts set Quantity = Quantity - " + AllocatedQty + " where partID = " + "'" + AllocatedPartID + "'";
            boolean result = singleConn.ExecuteQuary(query);
            
            
        }
        if (evt.getSource() == btnAllocate) {
            ViewPartsTable();
        }
        //add employeeID to watch repair job table
    }//GEN-LAST:event_btnAllocateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        String check = LoginUI.user;
        
        if (check.equals("emp")){
            EmpManageView Ui = new EmpManageView();
            this.setVisible(false);
            Ui.setVisible(true);
        } else if (check.equals("admn")){
            MainManageView Ui = new MainManageView();
        this.setVisible(false);
        Ui.setVisible(true);
        }
        
        
    }//GEN-LAST:event_btnBackActionPerformed
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
            java.util.logging.Logger.getLogger(AllocateEmployeesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllocateEmployeesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllocateEmployeesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllocateEmployeesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllocateEmployeesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllocate;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemoveParts;
    private javax.swing.JButton btnaddParts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAllocatedParts;
    private javax.swing.JTable tblParts;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtWatchRepairJob;
    // End of variables declaration//GEN-END:variables
}
