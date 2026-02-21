package com.blackrock.pojo;

import java.time.LocalDateTime;

public class Transaction {
    
    private LocalDateTime date;
    private double amount;
    private double ceiling;
    private double remanent;
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getCeiling() {
        return ceiling;
    }

    public void setCeiling(double ceiling) {
        this.ceiling = ceiling;
    }

    public double getRemanent() {
        return remanent;
    }

    public void setRemanent(double remanent) {
        this.remanent = remanent;
    }
}
