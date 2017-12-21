/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.FoodItem.FoodItem;



public class RestauranttoCharityRequest extends WorkRequest{

    private FoodItem fooditem;
    private int quantity;
    private String testResult;
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public FoodItem getFooditem() {
        return fooditem;
    }

    public void setFooditem(FoodItem fooditem) {
        this.fooditem = fooditem;
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

    
}
