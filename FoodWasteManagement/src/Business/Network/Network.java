/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Order.MasterOrderCatalog;
import Business.RawMaterial.RawMaterialCatalog;
import Business.Transaction.SupplierTransactions;
import Business.WorkQueue.RestauranttoCharityRequest;
import java.util.ArrayList;

/**
 *
 * @author sachinsenthilkumar
 */
public class Network {
    
     private String name;
    private EnterpriseDirectory enterpriseDirectory; //contains all enterprises
    private NetworkCoordinatorOrganization networkCoordinatorOrganization; //network organization
    private RawMaterialCatalog rawMaterialcatalog; //contains all raw materials
        private SupplierTransactions supplierTransactions;   //transactions made by supplier
    private ArrayList<RestauranttoCharityRequest> completedCharityList; //completed charity requests
    private MasterOrderCatalog moc; //has details of all orderes 
    private Report report; //creates PDFS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
     public MasterOrderCatalog getMoc() {
        return moc;
    }
    
    public Network()
    {
        enterpriseDirectory = new EnterpriseDirectory();
        networkCoordinatorOrganization= new NetworkCoordinatorOrganization();
        rawMaterialcatalog=new RawMaterialCatalog();
         supplierTransactions=new SupplierTransactions();
  completedCharityList= new ArrayList<RestauranttoCharityRequest>();
   moc= new MasterOrderCatalog();
   report=new Report();
    }

    public NetworkCoordinatorOrganization getNetworkCoordinatorOrganization() {
        return networkCoordinatorOrganization;
    }

    public RawMaterialCatalog getRawMaterialcatalog() {
        return rawMaterialcatalog;
    }


       public SupplierTransactions getSupplierTransactions() {
        return supplierTransactions;
    }

    public ArrayList<RestauranttoCharityRequest> getCompletedCharityList() {
        return completedCharityList;
    }

    public void setCompletedCharityList(ArrayList<RestauranttoCharityRequest> completedCharityList) {
        this.completedCharityList = completedCharityList;
    }

    public Report getReport() {
        return report;
    }
    
    
    
    @Override
    public String toString()
    {
        return name;  
    }
    
}
