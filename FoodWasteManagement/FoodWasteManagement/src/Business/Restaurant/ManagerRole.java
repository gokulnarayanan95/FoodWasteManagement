/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Restaurant.RestaurantManagerHome;
import userinterface.Restaurant.SendWastetoCharityJPanel;

/**
 *
 * @author naray
 */


public class ManagerRole extends Role {
    

         @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new RestaurantManagerHome(userProcessContainer, enterprise,account,business);
    }
}
