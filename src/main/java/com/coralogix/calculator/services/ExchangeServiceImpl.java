package com.coralogix.calculator.services;

import com.coralogix.calculator.clients.ApiCurrencyClient;
import com.coralogix.calculator.clients.response.CurrencyResponse;
import com.coralogix.calculator.model.ExchangeRate;
import com.coralogix.calculator.repository.ExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeServiceImpl implements ExchangeService {

    @Autowired
    private ExchangeRepository exchangeRepository;

    @Autowired
    private ApiCurrencyClient apiCurrencyClient;

    @Override
    public List<ExchangeRate> getAllExchangesRate() {
        return exchangeRepository.findAll();
    }

    @Override
    public ExchangeRate getExchangeFromExternal(String originCurrency, String finalCurrency) {
        CurrencyResponse response = apiCurrencyClient.fixer(originCurrency, finalCurrency);
        ExchangeRate exchangeRate = new ExchangeRate(
                response.getBase(),
                finalCurrency,
                response.getDate(),
                response.getRates().get(finalCurrency).toString()
        );
        exchangeRepository.save(exchangeRate);
        return exchangeRate;
    }
}
