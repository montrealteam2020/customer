package com.pnc.customer.models;

import java.util.List;

public class TransactionsList {


    private List<Transactions> transactionList;

    public TransactionsList(List<Transactions> transactionList){
        this.transactionList=transactionList;
    }
    public List<Transactions> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transactions> transactionList) {
        this.transactionList = transactionList;
    }
}
