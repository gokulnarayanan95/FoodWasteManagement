/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Restaurant;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RestaurantEnterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.RawMaterial.RawMaterial;
import Business.RawMaterial.RawMaterialCatalog;
import Business.Supplier.DairySupplierOrganization;
import Business.Supplier.GrainSupplierOrganization;
import Business.Supplier.MeatSupplierOrganization;
import Business.Supplier.VegetableSupplierOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SupplierRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sachinsenthilkumar
 */
public class RequestForSupplyJPanel extends javax.swing.JPanel {

   private JPanel userProcessContainer;
    private UserAccount useraccount;
    private Enterprise enterprise;
    private Ecosystem ecosystem;
    private RawMaterialCatalog rawmaterialCatalog;
    private Network network;
    /**
     * Creates new form RequestForSupplyJPanel
     */
   

    public RequestForSupplyJPanel(JPanel userProcessContainer, UserAccount useraccount, Enterprise enterprise, Ecosystem ecosystem, RawMaterialCatalog rawmaterialCatalog, Network network) {
       initComponents(); 
       this.userProcessContainer=userProcessContainer;
       this.ecosystem=ecosystem;
        this.enterprise=enterprise;
        this.useraccount=useraccount;
        this.rawmaterialCatalog=network.getRawMaterialcatalog();
        this.network=network;
        populateCombo();
    }
    
     public void populateCombo(){     //populate the raw material combo box
        rawMaterialCombo.removeAllItems();
        for(RawMaterial raw:network.getRawMaterialcatalog().getRawMaterialList()){
            rawMaterialCombo.addItem(raw);
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
        rawMaterialCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        requestTestJButton1 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Raw Material");

        rawMaterialCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rawMaterialCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rawMaterialComboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantity");

        requestTestJButton1.setBackground(new java.awt.Color(0, 0, 0));
        requestTestJButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        requestTestJButton1.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton1.setText("Request Test");
        requestTestJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButton1ActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Requst For Supply");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(requestTestJButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(qty)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(rawMaterialCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(281, 281, 281)
                        .addComponent(jLabel3)))
                .addGap(0, 328, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)))
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rawMaterialCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(requestTestJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rawMaterialComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rawMaterialComboActionPerformed

    }//GEN-LAST:event_rawMaterialComboActionPerformed

    private void requestTestJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButton1ActionPerformed
        int quantity=Integer.parseInt(qty.getText());
        RawMaterial rawmaterial=(RawMaterial)rawMaterialCombo.getSelectedItem();
        
         if(qty.getText().equals("") || !(qty.getText().matches("[0-9]+")))
         {
             JOptionPane.showMessageDialog(null,"Invalid");
         }
         

         else if(rawmaterial.getType().equals("Dairy"))
                {
                    SupplierRequest request = new SupplierRequest();
                
        request.setRawmaterial(rawmaterial);
        request.setRestaurantName((RestaurantEnterprise) enterprise);
        request.setSender(useraccount);
        request.setStatus("Sent");

        request.setQuantity(quantity);
        Organization org = null;
        
            for(Enterprise e:  network.getEnterpriseDirectory().getEnterpriseList()){

                if(e instanceof SupplierEnterprise){

                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){

                        if (organization instanceof DairySupplierOrganization){                                    // Restaurant requests the charity orgnaization for food wastage
                            org = organization;
                            break;
                        }
                    }}}
                    if (org!=null){
                        org.getWorkQueue().getWorkRequestList().add(request);
                        useraccount.getWorkQueue().getWorkRequestList().add(request);
                        JOptionPane.showMessageDialog(this,"Dairy Supply Request Created");
                    }}
        else if(rawmaterial.getType().equals("Meat"))
             {
                    SupplierRequest request = new SupplierRequest();
                
        request.setRawmaterial(rawmaterial);
        request.setRestaurantName((RestaurantEnterprise) enterprise);
        request.setSender(useraccount);
        request.setStatus("Sent");
  
        request.setQuantity(quantity);
        Organization org = null;
   
            for(Enterprise e:  network.getEnterpriseDirectory().getEnterpriseList()){

                if(e instanceof SupplierEnterprise){

                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){

                        if (organization instanceof MeatSupplierOrganization){                                    // Restaurant requests the charity orgnaization for food wastage
                            org = organization;
                            break;
                        }
                    }}}
                    if (org!=null){
                        org.getWorkQueue().getWorkRequestList().add(request);
                        useraccount.getWorkQueue().getWorkRequestList().add(request);
                        JOptionPane.showMessageDialog(this,"Meat Supply Request Created");
                    }}
        
        else if(rawmaterial.getType().equals("Grain"))
        {
            SupplierRequest request = new SupplierRequest();
                
        request.setRawmaterial(rawmaterial);
        request.setRestaurantName((RestaurantEnterprise) enterprise);
        request.setSender(useraccount);
        request.setStatus("Sent");

        request.setQuantity(quantity);
        Organization org = null;
        
            for(Enterprise e:  network.getEnterpriseDirectory().getEnterpriseList()){

                if(e instanceof SupplierEnterprise){

                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){

                        if (organization instanceof GrainSupplierOrganization){                                    // Restaurant requests the charity orgnaization for food wastage
                            org = organization;
                            break;
                        }
                    }}}
                    if (org!=null){
                        org.getWorkQueue().getWorkRequestList().add(request);
                        useraccount.getWorkQueue().getWorkRequestList().add(request);
                        JOptionPane.showMessageDialog(this,"Grain Supply Request Created");
                    }
        }
        
        else if(rawmaterial.getType().equals("Vegetable"))
        { SupplierRequest request = new SupplierRequest();
                
        request.setRawmaterial(rawmaterial);
        request.setRestaurantName((RestaurantEnterprise) enterprise);
        request.setSender(useraccount);
        request.setStatus("Sent");
 
        request.setQuantity(quantity);
        Organization org = null;
       
            for(Enterprise e:  network.getEnterpriseDirectory().getEnterpriseList()){

                if(e instanceof SupplierEnterprise){

                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){

                        if (organization instanceof VegetableSupplierOrganization){                                    // Restaurant requests the charity orgnaization for food wastage
                            org = organization;
                            break;
                        }
                    }}}
                    if (org!=null){
                        org.getWorkQueue().getWorkRequestList().add(request);
                        useraccount.getWorkQueue().getWorkRequestList().add(request);
                        JOptionPane.showMessageDialog(this,"Vegetable Supply Request Created");
                    }
        }
            
        
        
            
    }//GEN-LAST:event_requestTestJButton1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SupplyCoordinatorWorkAreaJPanel dwjp = (SupplyCoordinatorWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField qty;
    private javax.swing.JComboBox rawMaterialCombo;
    private javax.swing.JButton requestTestJButton1;
    // End of variables declaration//GEN-END:variables
}