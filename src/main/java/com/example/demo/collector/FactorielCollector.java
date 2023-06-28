package com.example.demo.collector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorielCollector {

    private int total = 0;
    @GetMapping("/api/factorial/total")
    public String getTotalFactorials() {
        return String.valueOf(total);
    }

}
