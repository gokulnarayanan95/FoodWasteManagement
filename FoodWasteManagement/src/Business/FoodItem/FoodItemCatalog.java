/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodItem;

import java.util.ArrayList;

/**
 *
 * @author sachinsenthilkumar
 */
public class FoodItemCatalog {
    
     ArrayList<FoodItem> foodItemList;
    
    public FoodItemCatalog()
    {
            foodItemList =new ArrayList<FoodItem>();
    }

    public ArrayList<FoodItem> getFoodItemList() {
        return foodItemList;
    }

    public void setFoodItemList(ArrayList<FoodItem> foodItemList) {
        this.foodItemList = foodItemList;
    }

    
    
    public FoodItem addFoodItem() //add food item
    {
        FoodItem f = new FoodItem();
        foodItemList.add(f);
        return f;
    }
    
     public void deleteFoodItem(FoodItem f){        //delete good item
            foodItemList.remove(f);
    }

    public FoodItem searchFoodItem(int FoodID){           //seaerch food item
        for (FoodItem f : foodItemList) {
            if(f.getFoodId()==FoodID){
            
                return f;
            }
        }
        return null;
    }
    
}
