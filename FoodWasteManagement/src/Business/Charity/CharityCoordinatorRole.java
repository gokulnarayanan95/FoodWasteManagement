/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Charity;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;

import userinterface.Charity.CharityHome;

/**
 *
 * @author naray
 */

public class CharityCoordinatorRole extends Role {
    

         @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business, Network network) {
       
        return new CharityHome(userProcessContainer, enterprise, organization, account, business, network);
        
    }
    
    
}