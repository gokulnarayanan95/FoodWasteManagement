/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.FoodItem.FoodItem;

/**
 *
 * @author naray
 */
public class CharitytoRestaurantRequest extends WorkRequest {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    @Override
    public String toString(){
        return this.message;
    }
}
