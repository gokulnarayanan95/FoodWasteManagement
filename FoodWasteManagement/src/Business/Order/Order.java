/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Order;

import Business.Customer.Customer;
import Business.Enterprise.RestaurantEnterprise;
import Business.FoodItem.FoodItem;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rishika
 */
public class Order {
    private RestaurantEnterprise restaurantEnterprise;     //works on the restaurant enterprise
    private ArrayList<OrderItem> orderItemList;   //gets details from orderitemlist
    private Date date;            
    private int orderNumber;          
    private static int count = 0;
    private Customer customer;
    public Order() {
        count++;
        orderNumber = count ;
        orderItemList = new ArrayList<OrderItem>();
       
    }


    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    public OrderItem addOrderItem(FoodItem p,int q , int price){          //add order item
        
         OrderItem o = new OrderItem();
         o.setFoodItem(p);
         o.setQuantity(q);
         o.setSalesPrice(price);
    
         orderItemList.add(o);
         return o;
         
    }
         
    public void removeOrderItem(OrderItem o){                         //remove order item
        orderItemList.remove(o);
   }
    
    public String toString(){
        return Integer.toString(this.orderNumber);
    }
        public RestaurantEnterprise getRestaurantEnterprise() {
        return restaurantEnterprise;
    }

    public void setRestaurantEnterprise(RestaurantEnterprise restaurantEnterprise) {
        this.restaurantEnterprise = restaurantEnterprise;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public int getTotalSales(){                          //get the total sales
        int total=0;
        for(OrderItem orderItem: this.getOrderItemList()){
            total+=orderItem.getSalesPrice();
        }
       return total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    
    
    
            }
