/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Restaurant;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RestaurantEnterprise;
import Business.RawMaterial.RawMaterialCatalog;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SupplierRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sachinsenthilkumar
 */
public class SupplyCoordinatorWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise; 
    UserAccount useraccount;
    Ecosystem ecosystem;
    RawMaterialCatalog rawmaterialCatalog;
    /**
     * Creates new form SupplyCoordinatorWorkAreaJPanel
     */
   

    public SupplyCoordinatorWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, Ecosystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.enterprise=enterprise;
        this.useraccount=useraccount;
     
      
    }
    
     public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : useraccount.getWorkQueue().getWorkRequestList()){
            SupplierRequest request2=(SupplierRequest)request;
            Object[] row = new Object[5];
            row[0] = request2.getRawmaterial();
            row[1] = request2.getQuantity();
            row[2] = request2.getReceiver();
            String result = ((SupplierRequest) request).getTestResult();
            row[4] = result == null ? "Waiting" : result;
            row[3]=request2.getStatus();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 204));
        setForeground(new java.awt.Color(0, 153, 51));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FoodItem", "Quantity", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        requestTestJButton.setBackground(new java.awt.Color(0, 0, 0));
        requestTestJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Request Supply");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setBackground(new java.awt.Color(0, 0, 0));
        refreshTestJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refreshTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("View Supplies");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnBack1.setBackground(new java.awt.Color(0, 0, 0));
        btnBack1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(255, 255, 255));
        btnBack1.setText("<< Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Supplies Management");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(343, 343, 343)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(416, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestForSupplyJPanel(userProcessContainer, useraccount, enterprise, ecosystem, rawmaterialCatalog));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        populateRequestTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ViewSupplies ManageFoodItemJPanel = new ViewSupplies( userProcessContainer, (RestaurantEnterprise) enterprise);
        userProcessContainer.add("ViewSupplies", ManageFoodItemJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
