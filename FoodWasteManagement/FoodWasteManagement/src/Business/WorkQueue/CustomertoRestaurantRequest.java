/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.RestaurantEnterprise;
import Business.Order.Order;

/**
 *
 * @author naray
 */
public class CustomertoRestaurantRequest extends WorkRequest {
    private RestaurantEnterprise restaurantEnterprise;
    private Order order;

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
    
    
}
