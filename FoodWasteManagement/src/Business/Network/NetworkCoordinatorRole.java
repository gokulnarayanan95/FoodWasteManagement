/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.NetworkCoordinator.NetworkCoordinatorWorkAreaJPanel;
import userinterface.Restaurant.RestaurantManagerHome;

/**
 *
 * @author naray
 */
public class NetworkCoordinatorRole extends Role{
    
         @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business, Network network) {

        return new NetworkCoordinatorWorkAreaJPanel(userProcessContainer, enterprise, network, business, account);
    }
}
