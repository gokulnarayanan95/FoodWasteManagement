/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ingredient;

import Business.RawMaterial.RawMaterial;

/**
 *
 * @author naray
 */
public class Ingredient {
    RawMaterial rawMaterial; //to add ingredient for each raw material
    int quantity;

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
        return this.rawMaterial.getMaterialName();
    }
}
