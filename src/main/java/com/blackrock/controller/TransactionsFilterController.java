package com.blackrock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionsFilterController {

    @GetMapping("/blackrock/challenge/v1/transactions:filter")
    public String filter() {
        return "Transactions filtered!";
    }
}
