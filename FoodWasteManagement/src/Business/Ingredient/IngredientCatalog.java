/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ingredient;

import Business.RawMaterial.RawMaterial;
import java.util.ArrayList;

/**
 *
 * @author naray
 */
public class IngredientCatalog {
     ArrayList<Ingredient> ingredientList;

    public ArrayList<Ingredient> getIngredientList() {
        return ingredientList;
    }
       public Ingredient addINngredient( ) //add ingredient
    { 
        Ingredient r = new Ingredient();
        ingredientList.add(r);
        return r;
    }
    
     public void deleteIngredient(Ingredient r ){    //delete ingredient
            ingredientList.remove(r);
    }
     
         public IngredientCatalog()
    {
            ingredientList =new ArrayList<Ingredient>();
    }
}
