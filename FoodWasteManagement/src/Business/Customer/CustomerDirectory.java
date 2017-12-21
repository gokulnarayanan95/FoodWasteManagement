/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author sachinsenthilkumar
 */
public class CustomerDirectory {
    
    private  ArrayList<Customer> customerList;
    
    public CustomerDirectory()
    {
            customerList =new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

   

    
    
    public Customer addCustomer() //add a customer
    {
       Customer c = new Customer();
        customerList.add(c);
        return c;
    }
    
}
