/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Recipe;

import Business.FoodItem.FoodItem;
import java.util.ArrayList;

/**
 *
 * @author sachinsenthilkumar
 */
public class Recipe {
  private  FoodItem foodItem;
   private  ArrayList<RecipeItem> recipeList;

  
 
         public Recipe()
    {
            recipeList =new ArrayList<RecipeItem>();
    }

    public ArrayList<RecipeItem> getRecipeList() {
        return recipeList;
        
        
    }

    public void setRecipeList(ArrayList<RecipeItem> recipeList) {
        this.recipeList = recipeList;
    }
       public RecipeItem addRecipe( )             //add recipe
    { 
        RecipeItem r = new RecipeItem();
        recipeList.add(r);
        return r;
    }
    
     public void deleteRecipe(RecipeItem r ){           //delete recipe
            recipeList.remove(r);
    }

    public FoodItem getFoodItem() {            
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }
     
     
      
    
    
    
}
