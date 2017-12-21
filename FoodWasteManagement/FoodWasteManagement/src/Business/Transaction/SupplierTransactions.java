/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Transaction;

import java.util.ArrayList;

/**
 *
 * @author naray
 */
public class SupplierTransactions {
    private ArrayList<SupplierTransaction> supplierTransactionList;
    public SupplierTransactions(){
        supplierTransactionList= new ArrayList<SupplierTransaction>();
    }

    public ArrayList<SupplierTransaction> getSupplierTransactionList() {
        return supplierTransactionList;
    }

    public void setSupplierTransactionList(ArrayList<SupplierTransaction> supplierTransactionList) {
        this.supplierTransactionList = supplierTransactionList;
    }
    
    public SupplierTransaction addSupplierTransaction(){
        SupplierTransaction supplierTransaction=new SupplierTransaction();
        supplierTransactionList.add(supplierTransaction);
        return supplierTransaction;
    }
}
