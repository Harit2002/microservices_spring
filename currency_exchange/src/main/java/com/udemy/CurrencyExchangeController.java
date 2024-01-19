package com.udemy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private Environment environment;
	
	private Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);
	
	@Autowired
	private CurrencyExchangeRepository repository;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	private CurrencyExchange getCurrencyExchange(@PathVariable String from, @PathVariable String to) {
		String port = environment.getProperty("local.server.port");
		logger.info("retrieveExchangeValue called from {} to {}", from , to);
		CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);
		
		currencyExchange.setEnvironment(port);
		
		return currencyExchange;
	}
	
	@GetMapping
	private String sayHello() {
		return "hello";
	}

}
