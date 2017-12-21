/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Charity.CharityCoordinatorOrganization;
import Business.Network.NetworkCoordinatorOrganization;
import Business.Restaurant.ManagerOrganization;
import Business.Restaurant.SalesPersonOrganization;
import Business.Restaurant.SupplyCoordinatorOrganization;
import Business.Supplier.DairySupplierOrganization;
import Business.Supplier.GrainSupplierOrganization;
import Business.Supplier.MeatSupplierOrganization;
import Business.Supplier.VegetableSupplierOrganization;
import java.util.ArrayList;

/**
 *
 * @author sachinsenthilkumar
 */
public class OrganizationDirectory {
    
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){             //create organization
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.NetworkCoordinator.getValue())){
            organization = new NetworkCoordinatorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SalesPerson.getValue())){
            organization = new SalesPersonOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Manager.getValue())){
            organization = new ManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SupplyCoordinator.getValue())){
            organization = new SupplyCoordinatorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.VegetableSupplier.getValue())){
            organization = new VegetableSupplierOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.MeatSupplier.getValue())){
            organization = new MeatSupplierOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.GrainSupplier.getValue())){
            organization = new GrainSupplierOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.DairySupplier.getValue())){
            organization = new DairySupplierOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.CharityCoordinator.getValue())){
            organization = new CharityCoordinatorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
}
