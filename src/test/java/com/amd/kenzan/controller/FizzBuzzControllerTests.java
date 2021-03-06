package com.amd.kenzan.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.http.MediaType.TEXT_XML_VALUE;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FizzBuzzControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void doFizzBuzz() throws Exception {
		final Integer expectedNumber = 15;
		this.mockMvc.perform(get("/fizzbuzz/15")).andExpect(status().isOk()).andExpect((x) -> {
			Integer number = (Integer) new org.json.JSONObject(x.getResponse().getContentAsString())
					.getJSONArray("fizzBuzz").get(0);
			Assert.assertEquals(expectedNumber, number);
		});
	}

	@Test
	public void textXmlReturns406NotAcceptable() throws Exception {
		mockMvc.perform(get("/fizzbuzz/15").accept(TEXT_XML_VALUE)).andExpect(status().isNotAcceptable());
	}

	@Test
	public void nonNumberReturns400BadRequest() throws Exception {
		mockMvc.perform(get("/fizzbuzz/foo")).andExpect((x) -> {
			String errorCode = new org.json.JSONObject(x.getResponse().getContentAsString()).getString("errorCode");
			Assert.assertEquals("400", errorCode);
		});
	}
}
