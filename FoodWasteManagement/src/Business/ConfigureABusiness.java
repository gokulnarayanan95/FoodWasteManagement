/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author sachinsenthilkumar
 */
public class ConfigureABusiness {
    public static Ecosystem configure(){
    
        // Creating System Admin UserAccount Details 
        Ecosystem system = Ecosystem.getInstance();
        Employee employee = system.getEmployeeDirectory().createEmployee("Morphling");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("s", "s", employee, new SystemAdminRole());
         
        return system;
    }
}
