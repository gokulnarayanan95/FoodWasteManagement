/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.Enterprise.RestaurantEnterprise;
import Business.Order.Order;

/**
 *
 * @author naray
 */
public class CustomertoRestaurantRequest extends WorkRequest {
    private RestaurantEnterprise restaurantEnterprise; //works under restaurant enterprise
    private Order order;   //customer makes an order
    private Customer customer;
    public RestaurantEnterprise getRestaurantEnterprise() {
        return restaurantEnterprise;
    }

    public void setRestaurantEnterprise(RestaurantEnterprise restaurantEnterprise) {
        this.restaurantEnterprise = restaurantEnterprise;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
    
}
