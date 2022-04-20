package com.metric.converter.web.temperature;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;

import com.metric.converter.AbstractTest;
import com.metric.converter.Units;

public class TemperatureControllerTest extends AbstractTest{

	private static final String BASE_URI = "/api/temperatures";

	@Test
	public void test_from_celsius_kelvin() throws Exception {
		MvcResult result = this.mockMvc.perform(get(BASE_URI+"/celsius")
				.param("toUnits", Units.KELVIN.toString())
				.param("value", "100"))
		.andExpect(status().isOk())
		.andReturn();
		
		assertEquals(result.getResponse().getContentAsString(), "373,15 K");
	}
	
	@Test
	public void test_from_celsius_fahrenheit() throws Exception {
		MvcResult result = this.mockMvc.perform(get(BASE_URI+"/celsius")
				.param("toUnits", Units.FAHRENHEIT.toString())
				.param("value", "100"))
		.andExpect(status().isOk())
		.andReturn();
		
		assertEquals(result.getResponse().getContentAsString(), "212,00 F");
	}
	
	@Test
	public void test_from_fahrenheit_kelvin() throws Exception {
		MvcResult result = this.mockMvc.perform(get(BASE_URI+"/fahrenheit")
				.param("toUnits", Units.KELVIN.toString())
				.param("value", "100"))
		.andExpect(status().isOk())
		.andReturn();
		
		assertEquals(result.getResponse().getContentAsString(), "310,93 K");
	}
	
	@Test
	public void test_from_fahrenheit_celsius() throws Exception {
		MvcResult result = this.mockMvc.perform(get(BASE_URI+"/fahrenheit")
				.param("toUnits", Units.CELSIUS.toString())
				.param("value", "100"))
		.andExpect(status().isOk())
		.andReturn();
		
		assertEquals(result.getResponse().getContentAsString(), "37,78 C");
	}
	
	@Test
	public void test_from_kelvin_celsius() throws Exception {
		MvcResult result = this.mockMvc.perform(get(BASE_URI+"/kelvin")
				.param("toUnits", Units.CELSIUS.toString())
				.param("value", "100"))
		.andExpect(status().isOk())
		.andReturn();
		
		assertEquals(result.getResponse().getContentAsString(), "-173,15 C");
	}
	
	@Test
	public void test_from_kelvin_fahrenheit() throws Exception {
		MvcResult result = this.mockMvc.perform(get(BASE_URI+"/kelvin")
				.param("toUnits",
						Units.FAHRENHEIT.toString())
				.param("value", "100"))
		.andExpect(status().isOk())
		.andReturn();
		
		assertEquals(result.getResponse().getContentAsString(), "-279,67 F");
	}
	
	
	
}
