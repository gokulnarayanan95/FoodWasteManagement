/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.CustomerDirectory;
import Business.Network.Network;
import Business.Order.MasterOrderCatalog;
import Business.Organization.Organization;
import Business.RawMaterial.RawMaterialCatalog;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Transaction.SupplierTransactions;
import java.util.ArrayList;

/**
 *
 * @author sachinsenthilkumar
 */
public class Ecosystem extends Organization {
    private static Ecosystem business;
    private ArrayList<Network> networkList;
    private MasterOrderCatalog moc;
    private RawMaterialCatalog rawMaterialCatalog;
    private SupplierTransactions supplierTransactions;
    private CustomerDirectory customerDirectory;
    public RawMaterialCatalog getRawMaterialCatalog() {
        return rawMaterialCatalog;
    }

    public void setRawMaterialCatalog(RawMaterialCatalog rawMaterialCatalog) {
        this.rawMaterialCatalog = rawMaterialCatalog;
    }

    public MasterOrderCatalog getMoc() {
        return moc;
    }

    public void setMoc(MasterOrderCatalog moc) {
        this.moc = moc;
    }
    
    public static Ecosystem getInstance() {
        if (business == null) {
            business = new Ecosystem();
        }
        return business;
    }
    
    
    private Ecosystem() {
        super(null);
        networkList = new ArrayList<>();
        moc= new MasterOrderCatalog();
  rawMaterialCatalog= new RawMaterialCatalog();
  customerDirectory=new CustomerDirectory();
    }



    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public SupplierTransactions getSupplierTransactions() {
        return supplierTransactions;
    }

    




    @Override
    public ArrayList<Role> getSupportedRole() {
          ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
      public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
      
       public void deleteNetwork(Network e){
            networkList.remove(e);
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
       
       
}
