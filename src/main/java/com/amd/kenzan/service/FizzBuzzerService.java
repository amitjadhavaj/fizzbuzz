package com.amd.kenzan.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amd.kenzan.model.response.FizzBuzzResponse;

@Service
public class FizzBuzzerService {
	private static final Integer THREE = Integer.valueOf(3);
	private static final Integer FIVE = Integer.valueOf(5);
	@Autowired
	FizzBuzzResponse fizzBuzzResponse;

	@NotNull
	public FizzBuzzResponse checkFizzBuzz(@NotNull Integer number) {
		List<Integer> fizz = new ArrayList<>();
		List<Integer> buzz = new ArrayList<>();
		List<Integer> fizzBuzz = new ArrayList<>();

		for (int i = 1; i <= number; i++) {
			if (((i % THREE) == 0) && ((i % FIVE) == 0)) {
				fizzBuzz.add(i);
			} else if ((i % THREE) == 0) {
				fizz.add(i);
			} else if ((i % FIVE) == 0) {
				buzz.add(i);
			}
		}
		fizzBuzzResponse.setFizzBuzz(fizzBuzz);
		fizzBuzzResponse.setFizz(fizz);
		fizzBuzzResponse.setBuzz(buzz);
		return fizzBuzzResponse;
	}
}