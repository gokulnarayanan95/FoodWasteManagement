/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.Date;

/**
 *
 * @author naray
 */
public class Report {
    Date date;
    String monthly_sales;
    String day_sales;
    String monthly_waste;
    String day_waste;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMonthly_sales() {
        return monthly_sales;
    }

    public void setMonthly_sales(String monthly_sales) {
        this.monthly_sales = monthly_sales;
    }

    public String getDay_sales() {
        return day_sales;
    }

    public void setDay_sales(String day_sales) {
        this.day_sales = day_sales;
    }

    public String getMonthly_waste() {
        return monthly_waste;
    }

    public void setMonthly_waste(String monthly_waste) {
        this.monthly_waste = monthly_waste;
    }

    public String getDay_waste() {
        return day_waste;
    }

    public void setDay_waste(String day_waste) {
        this.day_waste = day_waste;
    }
    
    
}
