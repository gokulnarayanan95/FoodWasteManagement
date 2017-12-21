/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Supplier;

import userinterface.Restaurant.*;
import Business.RawMaterial.RawMaterial;
import Business.RawMaterial.RawMaterialCatalog;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sachinsenthilkumar
 */
public class AddRawMaterialJPanel extends javax.swing.JPanel {

   private  JPanel userProcessContainer;
   private  RawMaterialCatalog rawmaterialCatalog;
    private String role;
    /**
     * Creates new form AddRawMaterialJPanel
     */
    

   public AddRawMaterialJPanel(JPanel userProcessContainer, RawMaterialCatalog rawmaterialCatalog, String role) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.rawmaterialCatalog=rawmaterialCatalog;
        this.role=role;
         System.out.println(role);
       if(role.equals("Dairy")){
           comboBoxRawMaterial.setSelectedIndex(0);
           comboBoxRawMaterial.setEnabled(false);
          
       }
       else if(role.equals("Grain")){
            comboBoxRawMaterial.setSelectedIndex(1);
           comboBoxRawMaterial.setEnabled(false);
       }
       else if(role.equals("Vegetable")){
            comboBoxRawMaterial.setSelectedIndex(2);
           comboBoxRawMaterial.setEnabled(false);
            System.out.println("2");
       }
              else if(role.equals("Meat")){
            comboBoxRawMaterial.setSelectedIndex(3);
           comboBoxRawMaterial.setEnabled(false);
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

        jLabel6 = new javax.swing.JLabel();
        btnAddRawMaterial = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaterialName = new javax.swing.JTextField();
        txtMaterialPrice = new javax.swing.JTextField();
        txtMaterialExpiry = new javax.swing.JTextField();
        comboBoxRawMaterial = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 0, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Add Raw Material");

        btnAddRawMaterial.setBackground(new java.awt.Color(0, 0, 0));
        btnAddRawMaterial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddRawMaterial.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRawMaterial.setText("Add Raw Material");
        btnAddRawMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRawMaterialActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Material Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Material Type:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Material Price:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Material Expiry:");

        comboBoxRawMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dairy", "Grain", "Vegetable", "Meat" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(327, 327, 327)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(btnAddRawMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaterialExpiry)
                            .addComponent(txtMaterialPrice)
                            .addComponent(comboBoxRawMaterial, 0, 193, Short.MAX_VALUE)
                            .addComponent(txtMaterialName))))
                .addGap(267, 306, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel6))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaterialName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBoxRawMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaterialPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaterialExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnAddRawMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRawMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRawMaterialActionPerformed
        // TODO add your handling code here:
        String MaterialName = txtMaterialName.getText();
        String MaterialPrice  = txtMaterialPrice.getText();
        String MaterialType = (String) comboBoxRawMaterial.getSelectedItem();
        String MaterialExpiry = txtMaterialExpiry.getText();

        if((MaterialName.equals("") || !(MaterialName.matches("[a-zA-Z]+")))||
            (MaterialPrice.equals("") || !(MaterialPrice.matches("[0-9]+(?:\\.[0-9]+)?")))||
                (MaterialExpiry.equals("") || !(MaterialExpiry.matches("[a-zA-Z]+"))) ||
            (MaterialType.equals(""))){
            JOptionPane.showMessageDialog(null,"Invalid Data");

        }

        else{
            RawMaterial rawmaterial = rawmaterialCatalog.addRawMaterial();
            rawmaterial.setMaterialName(MaterialName);
            rawmaterial.setExpiryDate(MaterialExpiry);
            rawmaterial.setPrice(Integer.parseInt(MaterialPrice));
            rawmaterial.setType(MaterialType);
            

            JOptionPane.showMessageDialog(null, "Food Item Added Successfully");

            txtMaterialName.setText("");
            txtMaterialExpiry.setText("");
            txtMaterialPrice.setText("");

        }
    }//GEN-LAST:event_btnAddRawMaterialActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       userProcessContainer.remove(this);
        java.awt.Component[] componentArray = userProcessContainer.getComponents();
        java.awt.Component component = componentArray[componentArray.length - 1];
        ManageRawMaterialsJPanel mrmjp = (ManageRawMaterialsJPanel) component;
        mrmjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRawMaterial;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> comboBoxRawMaterial;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtMaterialExpiry;
    private javax.swing.JTextField txtMaterialName;
    private javax.swing.JTextField txtMaterialPrice;
    // End of variables declaration//GEN-END:variables
}
