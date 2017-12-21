/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Restaurant;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RestaurantEnterprise;
import Business.FoodItem.FoodItemCatalog;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RestauranttoCharityRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sachinsenthilkumar
 */
public class SendWastetoCharityJPanel extends javax.swing.JPanel {

   private JPanel userProcessContainer;
   private Enterprise enterprise;
   private UserAccount userAccount;
   private Ecosystem system;
      private RestaurantEnterprise restaurantEnterprise;
      private Network network;
    public SendWastetoCharityJPanel(JPanel userProcessContainer, RestaurantEnterprise enterprise, UserAccount useraccount, Ecosystem system, Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.restaurantEnterprise=enterprise;
        this.userAccount=useraccount;
        this.system=system;
        this.network=network;

    }
        public void populateRequestTable(){        //populate request table
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            RestauranttoCharityRequest request2=(RestauranttoCharityRequest)request;
            Object[] row = new Object[5];
            row[0] = request2.getRawMaterial();
            row[1] = request2.getQuantity();
            row[2] = request2.getReceiver();
            String result = ((RestauranttoCharityRequest) request).getTestResult();
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
        refreshTestJButton = new javax.swing.JButton();
        requestTestJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 51));
        setForeground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RawMaterial", "Quantity", "Receiver", "Status", "Result"
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
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        refreshTestJButton.setBackground(new java.awt.Color(0, 0, 0));
        refreshTestJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refreshTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        requestTestJButton.setBackground(new java.awt.Color(0, 0, 0));
        requestTestJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sending Waste to Charity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requestTestJButton)
                            .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1)))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
     populateRequestTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        System.out.println(restaurantEnterprise.getFoodItemCatalog().getFoodItemList());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestforCharityJPanel", new RequestforCharityJPanel(userProcessContainer,userAccount,restaurantEnterprise,   system, network));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         userProcessContainer.remove(this);
        
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
