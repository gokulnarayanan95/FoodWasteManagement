/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Restaurant;

import Business.Ecosystem;
import Business.Enterprise.RestaurantEnterprise;
import Business.FoodItem.FoodItem;
import Business.Recipe.RecipeItem;
import Business.Recipe.Recipe;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sachinsenthilkumar
 */
public class ManageRecipeJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
   private RestaurantEnterprise restaurantenterprise;
   private UserAccount userAccount;
   private Ecosystem system;

   private Recipe recipeitem;
   private RestaurantEnterprise enterprise;/**
     * Creates new form ManageRecipeJPanel
     */
    public ManageRecipeJPanel(JPanel userProcessContainer, RestaurantEnterprise enterprise, UserAccount useraccount, Ecosystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
          this.restaurantenterprise=enterprise;
        this.userAccount=useraccount;
        this.system=system;
 
        this.enterprise=enterprise;
        populateCombo();
        populateTable();
       
    }
    
    
    
    /*public void populateCombo(RestaurantEnterprise r) {
        cmbFoodItem.removeAllItems();
        for(FoodItem fooditem : r.getFoodItemCatalog().getFoodItemList()) {
            cmbFoodItem.addItem(fooditem);
        }
        
    }*/
    
    public void populateCombo() {
        cmbFoodItem.removeAllItems();
        
        for (FoodItem food : restaurantenterprise.getFoodItemCatalog().getFoodItemList()){
            cmbFoodItem.addItem(food);
        }
    }
    
    public void populateTable() {
         DefaultTableModel dtm = (DefaultTableModel)tblRecipe.getModel();
        dtm.setRowCount(0);
        
        try{
        for(RecipeItem r : recipeitem.getRecipeList()){
            Object[] row = new Object[2];
            row[0] = r;
            row[1] = r.getQuantity();
            
            
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbFoodItem = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecipe = new javax.swing.JTable();
        btnAddRecipe = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 204));
        setForeground(new java.awt.Color(0, 153, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Recipe");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Food Item:");

        tblRecipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rawmaterial", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRecipe);
        if (tblRecipe.getColumnModel().getColumnCount() > 0) {
            tblRecipe.getColumnModel().getColumn(0).setResizable(false);
            tblRecipe.getColumnModel().getColumn(1).setResizable(false);
        }

        btnAddRecipe.setBackground(new java.awt.Color(0, 0, 0));
        btnAddRecipe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddRecipe.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRecipe.setText("Add Recipe");
        btnAddRecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRecipeActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View Recipe");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Recipe");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(171, 171, 171)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddRecipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbFoodItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(470, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbFoodItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnAddRecipe)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(btnDelete)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRecipeActionPerformed
        FoodItem foodItem=(FoodItem) cmbFoodItem.getSelectedItem();
          AddRecipeJPanel panel = new AddRecipeJPanel(userProcessContainer, foodItem, enterprise, system);
        userProcessContainer.add("AddRecipeJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddRecipeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DefaultTableModel model=(DefaultTableModel) tblRecipe.getModel();
       model.setRowCount(0);
       FoodItem foodItem=(FoodItem) cmbFoodItem.getSelectedItem();
       for(RecipeItem recipeItem: foodItem.getRecipe().getRecipeList()){
           Object[]  row = new Object[2];
           row[0]=recipeItem.getRawMaterial();
           row[1]=recipeItem.getQuantity();
           model.addRow(row);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         int row = tblRecipe.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row from the TABLE First", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to DELETE the Account?", "Warning", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            RecipeItem r = (RecipeItem)tblRecipe.getValueAt(row, 0);
            recipeitem.deleteRecipe(r);
           
            populateTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRecipe;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox cmbFoodItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRecipe;
    // End of variables declaration//GEN-END:variables
}