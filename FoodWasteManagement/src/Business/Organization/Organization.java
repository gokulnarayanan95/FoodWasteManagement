/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author sachinsenthilkumar
 */
public abstract class Organization {
    
     private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;   //details of all employees
    private UserAccountDirectory userAccountDirectory; //details of all useraccounts
    private int organizationID;   //each organization have a unique ID
    private static int counter;
    
    public enum Type{
     
        SalesPerson("Restaurant Sales Person"), 
        Manager("Restaurant Manager"), 
        SupplyCoordinator("Restaurant Supply Co-Ordinator"), 
        
        VegetableSupplier("Vegetable Supplier"), 
        MeatSupplier("Meat Supplier"), 
        GrainSupplier("Grain Supplier"),
        DairySupplier("Dairy Supplier"),
        
        CharityCoordinator("Charity Coordinator"),
        NetworkCoordinator("Network Coordinator"),
        Admin("Admin");
           

        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
//        public Organization createOrganization(Type t) {
//            return t.createOrganization();
//        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
