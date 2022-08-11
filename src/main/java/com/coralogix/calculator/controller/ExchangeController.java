package com.coralogix.calculator.controller;

import com.coralogix.calculator.model.ExchangeRate;
import com.coralogix.calculator.services.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exchange-rate")
public class ExchangeController {

    @Autowired
    private ExchangeService exchangeService;

    @GetMapping
    public List<ExchangeRate> getAllExchangeRates() {
        return exchangeService.getAllExchangesRate();
    }

    @GetMapping("/exchange")
    public ExchangeRate getExchange(@RequestParam String originCurrency, @RequestParam String finalCurrency) {
        return exchangeService.getExchangeFromExternal(originCurrency, finalCurrency);
    }

    @GetMapping("/matrix")
    public String printMatrix(@RequestParam int userValue) {
        StringBuilder stringBuilder = new StringBuilder();
        int firstValue = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int result = userValue * i + firstValue;
                stringBuilder.append(result).append(" ");
                firstValue = result;
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
