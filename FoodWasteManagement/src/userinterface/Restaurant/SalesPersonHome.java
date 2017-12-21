/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Restaurant;

import Business.Ecosystem;
import Business.Enterprise.RestaurantEnterprise;
import Business.FoodItem.FoodItem;
import Business.Ingredient.Ingredient;
import Business.Network.Network;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Recipe.RecipeItem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomertoRestaurantRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author naray
 */
public class SalesPersonHome extends javax.swing.JPanel {
    private JPanel userProcessContainer;
private RestaurantEnterprise enterprise;
private CustomertoRestaurantRequest request2;
private Ecosystem system;
private Network network;
    /**
     * Creates new form SalesPersonHome
     */
    public SalesPersonHome(JPanel userProcessContainer, RestaurantEnterprise enterprise, Ecosystem system, Network network) {
        initComponents();
         this.userProcessContainer=userProcessContainer;
       this.enterprise=enterprise;
       this.system=system;
       this.network=network;
       populateOrderTable();
    }
        public void populateOrderTable(){    //populate the order table
        DefaultTableModel model= (DefaultTableModel) orderTable.getModel();
        model.setRowCount(0);
        for(WorkRequest request: enterprise.getWorkQueue().getWorkRequestList()){
            request2= (CustomertoRestaurantRequest)request;
            Object[] row= new Object[2];
            row[0]=request2;
            row[1]=request2.getStatus();
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

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        datePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 51));
        setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        foodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food item", "Quantity", "Sales Price"
            }
        ));
        jScrollPane1.setViewportView(foodTable);
        if (foodTable.getColumnModel().getColumnCount() > 0) {
            foodTable.getColumnModel().getColumn(2).setHeaderValue("Sales Price");
        }

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order", "Status"
            }
        ));
        jScrollPane2.setViewportView(orderTable);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Get Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Process");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SalesPerson Home");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(344, 344, 344)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(225, 225, 225)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(datePicker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton2)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int selectedRow =orderTable.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }
         CustomertoRestaurantRequest request= (CustomertoRestaurantRequest) orderTable.getValueAt(selectedRow, 0);
        Order order=(Order) request.getOrder();
        DefaultTableModel model= (DefaultTableModel)foodTable.getModel();
        model.setRowCount(0);
        for(OrderItem oi: order.getOrderItemList()){
            Object []row= new Object[3];
            row[0]=oi.getFoodItem();
            row[1]=oi.getQuantity();
            row[2]=oi.getSalesPrice();
            model.addRow(row);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(datePicker.getDate()==null){
    JOptionPane.showMessageDialog(this,"Enter Date");
    return;
}                                                
       DefaultTableModel model= (DefaultTableModel)foodTable.getModel();
        model.setRowCount(0);
        int selectedRow =orderTable.getSelectedRow();
        CustomertoRestaurantRequest request= (CustomertoRestaurantRequest) orderTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Completed")){
            JOptionPane.showMessageDialog(this, "Request Already Completed");
            return;
        }
        for(OrderItem orderItem: request.getOrder().getOrderItemList()){      //Iterating through each item in the order to find out the raw materials required for the item
            FoodItem foodItem= orderItem.getFoodItem();
              for(RecipeItem recipeItem: foodItem.getRecipe().getRecipeList()){
                  for(Ingredient i: enterprise.getIngredientCatalog().getIngredientList()){
                      if(i.getRawMaterial()==recipeItem.getRawMaterial()){ // The raw material matchaes with the supply of materialss in the inventory
                        
                          if(i.getQuantity()<recipeItem.getQuantity()*orderItem.getQuantity()){
                              
                                      request.setStatus(foodItem.getFoodName()+" Out of Stock");
                                         populateOrderTable();
                                         return;
                          }
                        
                      }
                  }
              }
        }
        // At this point , we are sure that the there is enough raw materials to process the order
     
         for(OrderItem orderItem: request.getOrder().getOrderItemList()){      //Iterating through each item in the order to indicate that the raw material has been used and hence updating the ingredient inventory
            FoodItem foodItem= orderItem.getFoodItem();
              for(RecipeItem recipeItem: foodItem.getRecipe().getRecipeList()){
                  for(Ingredient i: enterprise.getIngredientCatalog().getIngredientList()){
                      if(i.getRawMaterial()==recipeItem.getRawMaterial()){ // The raw material matchaes with the supply of materialss in the inventory
                            i.setQuantity(i.getQuantity()-recipeItem.getQuantity()*orderItem.getQuantity());
                      }
                  }
              }
        }
         request.getOrder().setRestaurantEnterprise(enterprise);
        request.setStatus("Served");
        request.getOrder().setDate(datePicker.getDate());
        system.getMoc().addOrder(request.getOrder());
        network.getMoc().addOrder(request.getOrder());
        populateOrderTable();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JTable foodTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable;
    // End of variables declaration//GEN-END:variables
}
