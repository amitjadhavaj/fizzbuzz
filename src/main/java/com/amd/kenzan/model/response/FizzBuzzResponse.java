package com.amd.kenzan.model.response;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FizzBuzzResponse {
	private List<Integer> fizz;
	private List<Integer> buzz;
	private List<Integer> fizzBuzz;

	public List<Integer> getFizz() {
		return fizz;
	}

	public void setFizz(List<Integer> fizz) {
		this.fizz = fizz;
	}

	public List<Integer> getBuzz() {
		return buzz;
	}

	public void setBuzz(List<Integer> buzz) {
		this.buzz = buzz;
	}

	public List<Integer> getFizzBuzz() {
		return fizzBuzz;
	}

	public void setFizzBuzz(List<Integer> fizzBuzz) {
		this.fizzBuzz = fizzBuzz;
	}
}
