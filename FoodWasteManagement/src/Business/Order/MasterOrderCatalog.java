/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Order;

import Business.Enterprise.RestaurantEnterprise;
import java.util.ArrayList;


public class MasterOrderCatalog {
   
   
    private ArrayList<Order> orderCatalog;
    
    public MasterOrderCatalog(){
        orderCatalog = new ArrayList<Order>();
    }



    public ArrayList<Order> getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(ArrayList<Order> orderCatalog) {
        this.orderCatalog = orderCatalog;
    }
    
    public void addOrder(Order o){                 //addorder
     
        orderCatalog.add(o);
       
        
    }
    public void appendOrder(Order o){                  //appendorder
        orderCatalog.add(o);
        
    }
    
    public void removeOrder(Order o){                 //removeorder
        orderCatalog.remove(o);
    }


    
    
}