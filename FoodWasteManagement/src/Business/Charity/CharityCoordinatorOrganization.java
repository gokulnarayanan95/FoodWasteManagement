/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Charity;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author naray
 */
public class CharityCoordinatorOrganization  extends Organization{

    public CharityCoordinatorOrganization() {
        super(Organization.Type.CharityCoordinator.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CharityCoordinatorRole());
        return roles;
    }
    
   
}
