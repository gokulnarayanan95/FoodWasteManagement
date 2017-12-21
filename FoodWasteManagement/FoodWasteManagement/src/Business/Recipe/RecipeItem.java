/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Recipe;

import Business.RawMaterial.RawMaterial;

/**
 *
 * @author sachinsenthilkumar
 */
public class RecipeItem {
    
    int quantity;
    RawMaterial rawMaterial;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public RawMaterial getRawMaterial() {
        return rawMaterial;
    }

    public void setRawMaterial(RawMaterial rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    

  
    @Override
    public String toString() {
        return rawMaterial.getMaterialName();
    }
    
    
    
}
