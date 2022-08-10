package com.coralogix.calculator.clients;

import com.coralogix.calculator.clients.response.CurrencyResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(url = "http://localhost:8080")
public interface ApiCurrencyClient {

    @GetMapping("/fixer/latest")
    CurrencyResponse fixer(@RequestParam String base, @RequestParam String symbols);
}
