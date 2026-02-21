package com.blackrock.pojo;

import java.util.List;

public class Person {
    private int age;
    private double wage;
    private double inflation;
    private List<QPeriod> qPeriods;
    private List<PPeriod> pPeriods;
    private List<KPeriod> kPeriods;
    private List<Transaction> transactions;

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getInflation() {
        return inflation;
    }

    public void setInflation(double inflation) {
        this.inflation = inflation;
    }

    public List<QPeriod> getQPeriods() {
        return qPeriods;
    }

    public void setQPeriods(List<QPeriod> qPeriods) {
        this.qPeriods = qPeriods;
    }

    public List<PPeriod> getPPeriods() {
        return pPeriods;
    }

    public void setPPeriods(List<PPeriod> pPeriods) {
        this.pPeriods = pPeriods;
    }

    public List<KPeriod> getKPeriods() {
        return kPeriods;
    }

    public void setKPeriods(List<KPeriod> kPeriods) {
        this.kPeriods = kPeriods;
    }
}
