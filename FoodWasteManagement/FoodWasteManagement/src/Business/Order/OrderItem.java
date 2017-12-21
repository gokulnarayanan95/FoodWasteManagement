/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Order;

import Business.FoodItem.FoodItem;

/**
 *
 * @author Rishika
 */
public class OrderItem {
    
    private int quantity;
    private double salesPrice;
    private FoodItem foodItem;
 
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    


    
    @Override
    public String toString(){
       return this.foodItem.getFoodName();
       
    }
}
