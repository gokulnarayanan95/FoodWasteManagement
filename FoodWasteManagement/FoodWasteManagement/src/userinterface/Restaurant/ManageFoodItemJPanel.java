/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Restaurant;

import Business.Enterprise.Enterprise;
import Business.Enterprise.RestaurantEnterprise;
import Business.FoodItem.FoodItem;
import Business.FoodItem.FoodItemCatalog;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sachinsenthilkumar
 */
public class ManageFoodItemJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    private FoodItem fooditem;
    private RestaurantEnterprise restaurantEnterprise;
    /**
     * Creates new form AddFoodItemJPanel
     * @param userProcessContainer
     * @param enterprise
     */
   

    public ManageFoodItemJPanel(JPanel userProcessContainer, RestaurantEnterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.restaurantEnterprise=enterprise;
        populateTable();
       
    }
    
    public void populateTable() {
         DefaultTableModel dtm = (DefaultTableModel)tblFoodItemList.getModel();
        dtm.setRowCount(0);
        
        try{
        for(FoodItem fooditem : restaurantEnterprise.getFoodItemCatalog().getFoodItemList()){
            Object[] row = new Object[5];
            row[0] = fooditem;
            row[1] = fooditem.getFoodId();
            row[2] = fooditem.getFoodPrice();
            row[3] = fooditem.getCuisine();
            row[4]= fooditem.getType();
            
            dtm.addRow(row);
        }
        }catch(Exception e){
            
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
        tblFoodItemList = new javax.swing.JTable();
        btnSearchFoodItem = new javax.swing.JButton();
        btnAddFoodItem1 = new javax.swing.JButton();
        btnViewFoodItem1 = new javax.swing.JButton();
        btnDeleteFoodItem1 = new javax.swing.JButton();
        txtFoodID = new javax.swing.JTextField();
        btnBack1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 204));
        setForeground(new java.awt.Color(0, 153, 51));

        tblFoodItemList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Food Name", "Food ID", "Food Price", "Food Type", "Food Cuisine"
            }
        ));
        jScrollPane1.setViewportView(tblFoodItemList);

        btnSearchFoodItem.setBackground(new java.awt.Color(0, 0, 0));
        btnSearchFoodItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchFoodItem.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchFoodItem.setText("Search Food Item");
        btnSearchFoodItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFoodItemActionPerformed(evt);
            }
        });

        btnAddFoodItem1.setBackground(new java.awt.Color(0, 0, 0));
        btnAddFoodItem1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddFoodItem1.setForeground(new java.awt.Color(255, 255, 255));
        btnAddFoodItem1.setText("Add Food Item");
        btnAddFoodItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFoodItem1ActionPerformed(evt);
            }
        });

        btnViewFoodItem1.setBackground(new java.awt.Color(0, 0, 0));
        btnViewFoodItem1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnViewFoodItem1.setForeground(new java.awt.Color(255, 255, 255));
        btnViewFoodItem1.setText("View/Update Food Item");
        btnViewFoodItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFoodItem1ActionPerformed(evt);
            }
        });

        btnDeleteFoodItem1.setBackground(new java.awt.Color(0, 0, 0));
        btnDeleteFoodItem1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDeleteFoodItem1.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteFoodItem1.setText("Delete Food Item");
        btnDeleteFoodItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFoodItem1ActionPerformed(evt);
            }
        });

        txtFoodID.setBackground(new java.awt.Color(0, 0, 0));
        txtFoodID.setForeground(new java.awt.Color(255, 255, 255));
        txtFoodID.setText("Enter Food ID HERE:");
        txtFoodID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoodIDActionPerformed(evt);
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
        jLabel1.setText("Manage Food Item");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 293, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDeleteFoodItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewFoodItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddFoodItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFoodID, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchFoodItem, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(255, 255, 255))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFoodID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchFoodItem))
                .addGap(32, 32, 32)
                .addComponent(btnAddFoodItem1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnViewFoodItem1)
                .addGap(31, 31, 31)
                .addComponent(btnDeleteFoodItem1)
                .addGap(175, 175, 175))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchFoodItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFoodItemActionPerformed
        // TODO add your handling code here:
        if(txtFoodID.getText().equals("") || !(txtFoodID.getText().matches("[0-9A-Z]+"))){
            JOptionPane.showMessageDialog(null,"Invalid Data");
        }
        else{
            int id= Integer.parseInt(txtFoodID.getText());
            FoodItem fooditem2 = restaurantEnterprise.getFoodItemCatalog().searchFoodItem(id);

            if(fooditem2 == null){
                JOptionPane.showMessageDialog(null, "FoodItem Does Not Exist", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            else{

                SearchUpdateFoodItemJPanel panel = new SearchUpdateFoodItemJPanel(userProcessContainer, restaurantEnterprise, fooditem);
                userProcessContainer.add("SearchUpdateFoodItemPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);

                txtFoodID.setText("Enter Food ID Here");
            }

        }
    }//GEN-LAST:event_btnSearchFoodItemActionPerformed

    private void btnAddFoodItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFoodItem1ActionPerformed
        // TODO add your handling code here:
        AddFoodItemJPanel panel = new AddFoodItemJPanel(userProcessContainer, restaurantEnterprise);
        userProcessContainer.add("AddFoodItemJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnAddFoodItem1ActionPerformed

    private void btnViewFoodItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFoodItem1ActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblFoodItemList.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row from the TABLE to View Details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            FoodItem f = (FoodItem)tblFoodItemList.getValueAt(selectedRow, 0);
            SearchUpdateFoodItemJPanel panel = new SearchUpdateFoodItemJPanel(userProcessContainer, restaurantEnterprise, fooditem);
            userProcessContainer.add("SearchUpdateUserAccountJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_btnViewFoodItem1ActionPerformed

    private void btnDeleteFoodItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFoodItem1ActionPerformed
        // TODO add your handling code here:
        int row = tblFoodItemList.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row from the TABLE First", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to DELETE the Account?", "Warning", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            FoodItem f = (FoodItem)tblFoodItemList.getValueAt(row, 0);
            restaurantEnterprise.getFoodItemCatalog().deleteFoodItem(f);
            populateTable();
        }
    }//GEN-LAST:event_btnDeleteFoodItem1ActionPerformed

    private void txtFoodIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoodIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoodIDActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFoodItem1;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnDeleteFoodItem1;
    private javax.swing.JButton btnSearchFoodItem;
    private javax.swing.JButton btnViewFoodItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFoodItemList;
    private javax.swing.JTextField txtFoodID;
    // End of variables declaration//GEN-END:variables
}