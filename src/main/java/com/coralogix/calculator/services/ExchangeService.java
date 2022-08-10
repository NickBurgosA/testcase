package com.coralogix.calculator.services;

import com.coralogix.calculator.model.ExchangeRate;

import java.util.List;

public interface ExchangeService {
    List<ExchangeRate> getAllExchangesRate();

    ExchangeRate getExchangeFromExternal(String originCurrency, String finalCurrency);
}
