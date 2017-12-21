/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.FoodItem.FoodItem;
import Business.FoodItem.FoodItemCatalog;
import Business.Ingredient.IngredientCatalog;
import Business.RawMaterial.RawMaterialCatalog;
import Business.Recipe.Recipe;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sachinsenthilkumar
 */
public class RestaurantEnterprise extends Enterprise {
  private  FoodItemCatalog foodItemCatalog; //to get details of food item
  private IngredientCatalog ingredientCatalog; //to get details of ingredients



  
  
    public IngredientCatalog getIngredientCatalog() {
        return ingredientCatalog;
    }

    public void setIngredientCatalog(IngredientCatalog ingredientCatalog) {
        this.ingredientCatalog = ingredientCatalog;
    }



  
    public FoodItemCatalog getFoodItemCatalog() {
        return foodItemCatalog;
    }

    public void setFoodItemCatalog(FoodItemCatalog foodItemCatalog) {
        this.foodItemCatalog = foodItemCatalog;
    }

      public RestaurantEnterprise(String name) {
         super(name,EnterpriseType.Restaurant);
         foodItemCatalog= new FoodItemCatalog();
         ingredientCatalog=new IngredientCatalog();
         
    }
     
      @Override
    public ArrayList<Role> getSupportedRole() {
         return null;
    }
    
      @Override
    public String toString(){
        return this.getName();
    }
    
}
