package com.blackrock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackrock.service.NPSReturnsCalculatorService;

@RestController
public class ReturnsCalculator {

    @Autowired
    private NPSReturnsCalculatorService npsReturnsCalculatorService;

    @GetMapping("/blackrock/challenge/v1/returns:nps")
    public String calculateReturnsForNPS() {

        return npsReturnsCalculatorService.calculateReturns(100000) + ""; // Example contribution amount
    }

    @GetMapping("/blackrock/challenge/v1/returns:index")
    public String calculateReturnsForIndex() {
        return "Returns calculated!";
    }
}
