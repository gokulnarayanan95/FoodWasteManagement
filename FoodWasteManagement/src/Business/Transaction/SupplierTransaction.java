/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Transaction;

import Business.Enterprise.RestaurantEnterprise;
import Business.RawMaterial.RawMaterial;
import java.util.Date;

/**
 *
 * @author naray
 */
public class SupplierTransaction {
   private  RestaurantEnterprise restaurantEnterprise; //works under restaurant enterprise
    private Date date;
    private RawMaterial rawMaterial; 
    private int quantity;
    private int selling_price;
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

    public RawMaterial getRawMaterial() {
        return rawMaterial;
    }

    public void setRawMaterial(RawMaterial rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(int selling_price) {
        this.selling_price = selling_price;
    }
    
    
}
