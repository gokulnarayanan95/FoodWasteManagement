/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Restaurant;

import Business.Charity.CharityCoordinatorOrganization;
import Business.Ecosystem;
import Business.Enterprise.CharityEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RestaurantEnterprise;
import Business.FoodItem.FoodItem;
import Business.FoodItem.FoodItemCatalog;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RestauranttoCharityRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author naray
 */
public class RequestforCharityJPanel extends javax.swing.JPanel {
       private JPanel userProcessContainer;
   private Enterprise enterprise;
   private UserAccount useraccount;
   private Ecosystem system;
   private RestaurantEnterprise restaurantEnterprise;
    /**
     * Creates new form RequestforCharityJPanel
     */
    public RequestforCharityJPanel(JPanel userProcessContainer, UserAccount useraccount, RestaurantEnterprise restaurantEnterprise, Ecosystem system ) {
        initComponents();
              this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.useraccount=useraccount;
        this.restaurantEnterprise=restaurantEnterprise;
        this.system=system;
        
        populateCombo();
    }
    public void populateCombo(){
        foodItemCombo.removeAllItems();
        for(FoodItem fooditem:restaurantEnterprise.getFoodItemCatalog().getFoodItemList()){
            foodItemCombo.addItem(fooditem);
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

        requestTestJButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        foodItemCombo = new javax.swing.JComboBox();
        datePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 204));

        requestTestJButton1.setBackground(new java.awt.Color(0, 0, 0));
        requestTestJButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        requestTestJButton1.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton1.setText("Request Test");
        requestTestJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Food Item ");

        backJButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\naray\\Desktop\\RedButton_LeftArrow.svg-58014c285f9b5805c222f65f.png")); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantity");

        foodItemCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        foodItemCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodItemComboActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Request For Charity");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\naray\\Desktop\\CHARITYFINAL.jpeg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(341, 341, 341)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foodItemCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requestTestJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(409, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodItemCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(requestTestJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(536, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButton1ActionPerformed
        int quantity=Integer.parseInt(qty.getText());
        FoodItem fooditem=(FoodItem)foodItemCombo.getSelectedItem();
        
        
         if(qty.getText().equals("") || !(qty.getText().matches("[0-9A-Z]+")))
         {
             JOptionPane.showMessageDialog(null,"Invalid");
         }
         
         else {
        
        RestauranttoCharityRequest request = new RestauranttoCharityRequest();
        request.setRequestDate(datePicker.getDate());
        request.setFooditem(fooditem);
        request.setSender(useraccount);
        request.setStatus("Sent");
        request.setQuantity(quantity);
        Organization org = null;
        for(Network n:system.getNetworkList() ){
            for(Enterprise e:  n.getEnterpriseDirectory().getEnterpriseList()){
                
                if(e instanceof CharityEnterprise){
                    
                for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
                    
            if (organization instanceof CharityCoordinatorOrganization){                                    // Restaurant requests the charity orgnaization for food wastage
                org = organization;
                break;
            }
        }}}}
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            useraccount.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(this,"Charity Request Created");
        }}

    }//GEN-LAST:event_requestTestJButton1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SendWastetoCharityJPanel dwjp = (SendWastetoCharityJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void foodItemComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodItemComboActionPerformed

    }//GEN-LAST:event_foodItemComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JComboBox foodItemCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField qty;
    private javax.swing.JButton requestTestJButton1;
    // End of variables declaration//GEN-END:variables
}
