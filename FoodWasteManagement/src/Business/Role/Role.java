/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author sachinsenthilkumar
 */
public abstract class Role {
    
     String name;
    public enum RoleType{
        RestaurantAdmin("Restaurant Admin"),
        NetworkManagerAdmin("Network Management Admin"),
        SupplierAdmin("Supplier Admin"),
        CharityAdmin("Charity Admin"),
       SystemAdmin("System Admin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
  
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem ecoSystem, Network network);

    @Override
    public String toString() {
       return this.getClass().getName();
    }
    
}
