package com.blackrock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionsValidationController {

    @GetMapping("/blackrock/challenge/v1/transactions:validator")
    public String validate() {
        return "Transactions validated!";
    }

}
