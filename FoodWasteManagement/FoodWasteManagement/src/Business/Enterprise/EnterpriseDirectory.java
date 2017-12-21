/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author sachinsenthilkumar
 */
public class EnterpriseDirectory {
    
     private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> EnterpriseList) {
        this.enterpriseList = EnterpriseList;
    }
    
    public EnterpriseDirectory()
    {
        enterpriseList = new ArrayList();
        
    }
    
    public Enterprise createAndAddEnterPrise(String name, Enterprise.EnterpriseType type)
    {
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Restaurant)
        {
            enterprise = new RestaurantEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
         if(type == Enterprise.EnterpriseType.Charity)
        {
            enterprise = new CharityEnterprise(name);
            enterpriseList.add(enterprise);
        }
         if(type == Enterprise.EnterpriseType.Supplier)
        {
            enterprise = new SupplierEnterprise(name);
            enterpriseList.add(enterprise);
        }
         if(type == Enterprise.EnterpriseType.Delivery)
        {
            enterprise = new DeliveryEnterprise(name);
            enterpriseList.add(enterprise);
        }
         
        return enterprise;
    }
    
}
