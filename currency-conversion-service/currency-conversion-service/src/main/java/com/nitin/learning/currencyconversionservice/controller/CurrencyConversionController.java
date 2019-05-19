package com.nitin.learning.currencyconversionservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nitin.learning.currencyconversionservice.dto.CurrencyConversion;
import com.nitin.learning.currencyconversionservice.proxy.CurrencyExchangeFeignProxy;

@RestController
@EnableFeignClients("com.nitin.learning.currencyconversionservice")
public class CurrencyConversionController {

	@Autowired
	CurrencyExchangeFeignProxy currencyExchangeProxy;

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		Map<String, String> uriVariables = new HashMap<String, String>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class, uriVariables);
		CurrencyConversion currencyConversion = responseEntity.getBody();
		return new CurrencyConversion(1l, from, to, currencyConversion.getConversionMutiple(), quantity,
				quantity.multiply(currencyConversion.getConversionMutiple()), currencyConversion.getPort());
	}

	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion convertCurrencyFeign(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		CurrencyConversion currencyConversion = currencyExchangeProxy.getExchangeValue(from, to);
		return new CurrencyConversion(1l, from, to, currencyConversion.getConversionMutiple(), quantity,
				quantity.multiply(currencyConversion.getConversionMutiple()), currencyConversion.getPort());
	}
}
