package com.blackrock.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blackrock.pojo.Expense;
import com.blackrock.pojo.Transaction;

@Service
public class ParsingService {

    public List<Transaction> parseExpensesToTransactions(List<Expense> expenses) {
        List<Transaction> transactions = new ArrayList<>();
        for (Expense expense : expenses) {
            Transaction transaction = new Transaction();
            transaction.setDate(expense.getDate());
            int multiplier = (int) (expense.getAmount() / 100);
            if (multiplier == 0) {
                multiplier = 1;
            }
            transaction.setAmount(expense.getAmount());
            transaction.setCeiling(multiplier * 100);
            transaction.setRemanent(multiplier * 100 - expense.getAmount());
            transactions.add(transaction);
        } 
        return transactions;
    }
    
}
