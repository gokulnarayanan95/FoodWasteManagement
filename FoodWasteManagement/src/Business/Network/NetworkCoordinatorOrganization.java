/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Organization.Organization;
import Business.Restaurant.ManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author naray
 */
public class NetworkCoordinatorOrganization extends Organization{
    public NetworkCoordinatorOrganization() {
        super(Organization.Type.NetworkCoordinator.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
                 ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NetworkCoordinatorRole());
        return roles;
    }
}
