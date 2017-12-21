/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Waste;

import java.util.Date;

/**
 *
 * @author sachinsenthilkumar
 */
public class Waste {
    
     String dishName;
    int quantity;
    Date wastedDate;
    int totalPriceWasted;

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getWastedDate() {
        return wastedDate;
    }

    public void setWastedDate(Date wastedDate) {
        this.wastedDate = wastedDate;
    }

    public int getTotalPriceWasted() {
        return totalPriceWasted;
    }

    public void setTotalPriceWasted(int totalPriceWasted) {
        this.totalPriceWasted = totalPriceWasted;
    }
    
    public String toString() {
        return dishName;
    }
    
}
