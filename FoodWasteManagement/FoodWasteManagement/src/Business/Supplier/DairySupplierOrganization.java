/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.Organization.Organization;
import Business.Restaurant.SupplyCoordinatorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author naray
 */
public class DairySupplierOrganization  extends Organization{

    public DairySupplierOrganization() {
        super(Organization.Type.DairySupplier.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
              ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DairySupplierRole());
        return roles;
    }
    
}
