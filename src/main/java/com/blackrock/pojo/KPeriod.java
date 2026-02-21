package com.blackrock.pojo;

import java.time.LocalDateTime;
import java.util.List;

public class KPeriod {
    private LocalDateTime start;
    private LocalDateTime end;
    private List<Transaction> transactions;

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

}
