package com.blackrock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackrock.pojo.Expense;
import com.blackrock.pojo.Transaction;
import com.blackrock.service.ParsingService;

@RestController
public class TransactionsParsingController {

    @Autowired
    private ParsingService parsingService;

    @PostMapping("/blackrock/challenge/v1/transactions:parse")
    public List<Transaction> parseTransactions(List<Expense> expenses) {
        List<Transaction> transactions = parsingService.parseExpensesToTransactions(expenses);
        return transactions;
    }
}
