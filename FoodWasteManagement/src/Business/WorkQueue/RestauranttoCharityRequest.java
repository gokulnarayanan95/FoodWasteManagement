/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Enterprise.RestaurantEnterprise;
import Business.RawMaterial.RawMaterial;



public class RestauranttoCharityRequest extends WorkRequest{

    private RawMaterial rawMaterial;
    private int quantity;  
    private String testResult;
    private RestaurantEnterprise restaurantEnterprise;
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
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


    
    @Override
    public String toString(){
        return this.getSender().getUsername();
    }

    public RestaurantEnterprise getRestaurantEnterprise() {
        return restaurantEnterprise;
    }

    public void setRestaurantEnterprise(RestaurantEnterprise restaurantEnterprise) {
        this.restaurantEnterprise = restaurantEnterprise;
    }

    
}
