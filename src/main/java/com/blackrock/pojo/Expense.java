package com.blackrock.pojo;

import java.time.LocalDateTime;

public class Expense {
    private LocalDateTime date;
    private double amount;
    
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
}
