package com.blackrock.service;

import org.springframework.stereotype.Service;

@Service
public class NPSReturnsCalculatorService {
    
    private static final double NPS_RETURN_RATE = 0.0711; // Example return rate of 8%

    public double calculateReturns(double totalContributions) {
        return totalContributions * NPS_RETURN_RATE;
    }
}
