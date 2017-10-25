package com.amd.kenzan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amd.kenzan.exception.FizzBuzzValidationException;
import com.amd.kenzan.model.response.FizzBuzzResponse;
import com.amd.kenzan.service.FizzBuzzerService;

@RestController
public class FizzBuzzController {
	private static final Logger LOGGER = LoggerFactory.getLogger(FizzBuzzController.class.getName());
	private static final Integer MIN = Integer.valueOf(0);
	private static final Integer MAX = Integer.valueOf(100);

	@Autowired
	FizzBuzzerService fizzBuzzer;

	@GetMapping(value = "/fizzbuzz/{number}")
	public FizzBuzzResponse doFizzBuzz(@PathVariable Integer number) throws FizzBuzzValidationException {
		LOGGER.info("Invoking FizzBuzzController.doFizzBuzz");
		if ((number < MIN) || (number > MAX)) {
			throw new FizzBuzzValidationException("Number should be from 1 to 100");
		}
		return fizzBuzzer.checkFizzBuzz(number);
	}
}