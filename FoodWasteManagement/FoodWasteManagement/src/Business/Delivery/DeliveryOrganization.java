/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Delivery;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author naray
 */
public class DeliveryOrganization  extends Organization{

    public DeliveryOrganization() {
        super(Organization.Type.DeliveryPerson.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DeliveryPersonRole());
        return roles;
    }
    
}
