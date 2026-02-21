package com.blackrock.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blackrock.pojo.Expense;
import com.blackrock.pojo.Transaction;

@Service
public class ParsingService {

    public List<Transaction> parseExpensesToTransactions(List<Expense> expenses) {
        // Implement JSON parsing logic here, e.g., using Jackson or Gson
        // For simplicity, returning an empty list for now
        return new ArrayList<>();
    }
    
}
