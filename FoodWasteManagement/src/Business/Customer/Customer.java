/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author sachinsenthilkumar
 */
public class Customer {
    
    private String customerName;
    private int age;
    private String healthCondition;
    private int donatedAmount;
    private int customerId=0;
    private static int count=0;
    private int vitalsign;
    private String interest;
    private String email;
    private String username;
    private String password;
    private WorkQueue workQueue;
    public Customer() {
        customerId = ++count;
        workQueue = new WorkQueue();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

  

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    public int getDonatedAmount() {
        return donatedAmount;
    }

    public void setDonatedAmount(int donatedAmount) {
        this.donatedAmount = donatedAmount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getVitalsign() {
        return vitalsign;
    }

    public void setVitalsign(int vitalsign) {
        this.vitalsign = vitalsign;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
    
    public String toString() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    
    
    
    
}
