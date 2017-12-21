/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Waste;

import java.util.ArrayList;

/**
 *
 * @author sachinsenthilkumar
 */
public class WasteDirectory {
    
     ArrayList<Waste> wasteList;
    
    public WasteDirectory()
    {
            wasteList =new ArrayList<Waste>();
    }

    public ArrayList<Waste> getWasteList() {
        return wasteList;
    }

    public void setWasteList(ArrayList<Waste> wasteList) {
        this.wasteList = wasteList;
    }

   
    
    
    public Waste addWaste()
    {
       Waste w = new Waste();
        wasteList.add(w);
        return w;
    }
    
    
}
