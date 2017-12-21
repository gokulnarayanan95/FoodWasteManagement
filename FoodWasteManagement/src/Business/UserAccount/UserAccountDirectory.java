/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author sachinsenthilkumar
 */
public class UserAccountDirectory {
    
     private ArrayList<UserAccount> userAccountList; //details of user accounts
private HashMap<String,String> hm;  //hash map
    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
        hm=new HashMap<String,String>(); 
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){        //authenticate user
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        if(hm.containsKey(username)){
            JOptionPane.showMessageDialog(null, "Username already exists");
            return null;
        }                                                                    //create user account
        else{
        hm.put(username, password);
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
         return userAccount;
        }
      
        
        
       
    }
    
    public boolean checkIfUsernameIsUnique(String username){       //unique user name
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public void deleteUserAccount(UserAccount u) {               //delete user account
        userAccountList.remove(u);
    
    }
}
