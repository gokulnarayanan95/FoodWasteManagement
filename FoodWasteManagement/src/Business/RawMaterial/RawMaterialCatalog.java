/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RawMaterial;

import java.util.ArrayList;

/**
 *
 * @author sachinsenthilkumar
 */
public class RawMaterialCatalog {
    
      ArrayList<RawMaterial> rawMaterialList;
    
    public RawMaterialCatalog()
    {
            rawMaterialList =new ArrayList<RawMaterial>();
    }

    public ArrayList<RawMaterial> getRawMaterialList() {
        return rawMaterialList;
    }

    public void setRawMaterialList(ArrayList<RawMaterial> rawMaterialList) {
        this.rawMaterialList = rawMaterialList;
    }

  

    
    
    public RawMaterial addRawMaterial( )            //add raw material
    { 
        RawMaterial r = new RawMaterial();
        rawMaterialList.add(r);
        return r;
    }
    
     public void deleteRawMaterial(RawMaterial r ){            //delete raw material
            rawMaterialList.remove(r);
    }

    public RawMaterial searchRawMaterial(int rawMaterialID){            //search raw material
        for (RawMaterial rr : rawMaterialList) {
            if(rr.getMaterialId()==rawMaterialID){
                
            
                return rr;
            }
        }
        return null;
    }
    
    
}
