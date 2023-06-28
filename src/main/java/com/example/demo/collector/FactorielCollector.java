package com.example.demo.collector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorielCollector {

    private int total = 0;
    @GetMapping("/api/factorial/total")
    public String getTotalFactorials() {
        return String.valueOf(total);
    }

    @GetMapping("/api/factorial")
    public int calcFactorial(@RequestParam(required = true) int number) {
        int sum = 1;

        for(int i = 1; i <= number; i++) {
            sum *= i;
        }

        total += sum;
        return sum;
    }

}
