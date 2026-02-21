package com.blackrock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnsCalculator {

    @GetMapping("/blackrock/challenge/v1/returns:nps")
    public String calculateReturnsForNPS() {
        return "Returns calculated!";
    }

    @GetMapping("/blackrock/challenge/v1/returns:index")
    public String calculateReturnsForIndex() {
        return "Returns calculated!";
    }
}
