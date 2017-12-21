/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;


import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author naray
 */
public class SupplyCoordinatorOrganization  extends Organization{

    public SupplyCoordinatorOrganization() {
        super(Organization.Type.SupplyCoordinator.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
                 ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplyCoordinatorRole());
        return roles;
    }
    
}
