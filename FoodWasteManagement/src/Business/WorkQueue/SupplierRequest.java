/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.RestaurantEnterprise;
import Business.RawMaterial.RawMaterial;

/**
 *
 * @author sachinsenthilkumar
 */
public class SupplierRequest extends WorkRequest {
    
     private RawMaterial rawmaterial;
    private int quantity;
    private String testResult;
    private RestaurantEnterprise restaurant;
    private int selling_price;
    public RestaurantEnterprise getRestaurantName() {
        return restaurant;
    }

    public void setRestaurantName(RestaurantEnterprise restaurantName) {
        this.restaurant = restaurantName;
    }
    
    public RawMaterial getRawmaterial() {
        return rawmaterial;
    }

    public void setRawmaterial(RawMaterial rawmaterial) {
        this.rawmaterial = rawmaterial;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
     @Override
    public String toString(){
        return this.getSender().getUsername();
    }

    public int getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(int selling_price) {
        this.selling_price = selling_price;
    }
    
    
    
}
