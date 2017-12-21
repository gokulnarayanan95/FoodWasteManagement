/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RawMaterial;

import java.util.Date;

/**
 *
 * @author sachinsenthilkumar
 */
public class RawMaterial {
    
    private String materialName;
   private int materialId=0;
   private static int count=0;
   private int price;
   private int maxprice;

    String type;
    String expiryDate;
    
    public RawMaterial(){
        materialId = ++count;
    }

    public String getMaterialName() {
        return materialName;
    }


    
    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getMaxprice() {
        return maxprice;
    }
    

    public void setMaxprice(int maxprice) {
        this.maxprice = maxprice;
    }

    
     @Override
    public String toString(){
        return this.materialName;
    }
    
    
}
