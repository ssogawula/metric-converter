package com.metric.converter.web.length.centimeter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;

import com.metric.converter.Units;
import com.metric.converter.centimeter.AbstractTest;
import com.metric.converter.length.ImperialConverter;
import com.metric.converter.length.MetricConverter;

public class LengthControllerTest extends AbstractTest {

	private static final String CENTIMETER_METRIC_URI = "/api/lengths/centimeters/metrics";

	private static final String CENTIMETER_IMPERIAL_URI = "/api/lengths/centimeters/imperials";

	private static final String METER_METRIC_URI = "/api/lengths/meters/metrics";

	private static final String METER_IMPERIAL_URI = "/api/lengths/meters/imperials";

	private static final String MILLIMETER_METRIC_URI = "/api/lengths/millimeters/metrics";

	private static final String MILLIMETER_IMPERIAL_URI = "/api/lengths/millimeters/imperials";
	
	private static final String KILOMETER_METRIC_URI = "/api/lengths/kilometers/metrics";

	private static final String KILOMETER_IMPERIAL_URI = "/api/lengths/kilometers/imperials";
	
	private static final String ICHES_METRIC_URI = "/api/lengths/inches/metrics";

	private static final String INCHES_IMPERIAL_URI = "/api/lengths/inches/imperials";
	
	private static final String MILES_METRIC_URI = "/api/lengths/miles/metrics";

	private static final String MILES_IMPERIAL_URI = "/api/lengths/miles/imperials";
	
	private static final String YARDS_METRIC_URI = "/api/lengths/yards/metrics";

	private static final String YARDS_IMPERIAL_URI = "/api/lengths/yards/imperials";
	
	private static final String FEET_METRIC_URI = "/api/lengths/feet/metrics";

	private static final String FEET_IMPERIAL_URI = "/api/lengths/feet/imperials";
	
	//Centimeter Tests

	@Test
	public void test_centimterToCentiMeters() throws Exception {

		MvcResult result = this.mockMvc.perform(get(CENTIMETER_METRIC_URI).param("value", "20")
				.param("toUnits", Units.CENTIMITERS.toString()).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn();

		assertEquals(result.getResponse().getContentAsString(), "20 cm");
	}

	@Test
	public void test_centimterToKilomters() throws Exception {

		MvcResult result = this.mockMvc.perform(get(CENTIMETER_METRIC_URI).param("value", "20")
				.param("toUnits", Units.KILOMETERS.toString()).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn();

		assertEquals(result.getResponse().getContentAsString(), "0,0002 km");

	}

	@Test
	public void test_centimterToMeters() throws Exception {

		MvcResult result = this.mockMvc.perform(get(CENTIMETER_METRIC_URI).param("value", "20")
				.param("toUnits", Units.METERS.toString()).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn();

		assertEquals(result.getResponse().getContentAsString(), "0,2000 m");
	}

	@Test
	public void test_centimterToInches() throws Exception {
		MvcResult result = this.mockMvc.perform(get(CENTIMETER_IMPERIAL_URI).param("value", "20")
				.param("toUnits", Units.INCHES.toString()).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn();

		assertEquals(result.getResponse().getContentAsString(), "7,8740 in");
	}

	@Test
	public void test_centimterToFeet() throws Exception {
		MvcResult result = this.mockMvc.perform(get(CENTIMETER_IMPERIAL_URI).param("value", "20")
				.param("toUnits", Units.FEET.toString()).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andReturn();

		assertEquals(result.getResponse().getContentAsString(), String.format("%.4f ft", 0.656167979));
	}
	
	@Test
	public void test_centimterToYards() throws Exception {
		MvcResult result = this.mockMvc.perform(get(CENTIMETER_IMPERIAL_URI).param("value", "20")
				.param("toUnits", Units.YARDS.toString()).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andReturn();

		assertEquals(result.getResponse().getContentAsString(), String.format("%.4f yd", 0.2187));
	}
	
	//Meter Metric Tests
	@Test
	public void test_metersToMillimters() throws Exception {
		MvcResult result = this.mockMvc.perform(get(METER_METRIC_URI).param("value", "20")
				.param("toUnits", Units.MILLIMETERS.toString()).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andReturn();

		assertEquals(result.getResponse().getContentAsString(), "20000 mm");
	}
	
	@Test
	public void test_metersToKiloMeters() throws Exception {
		MvcResult result = this.mockMvc.perform(get(METER_METRIC_URI).param("value", "20")
				.param("toUnits", Units.KILOMETERS.toString()).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andReturn();

		assertEquals(result.getResponse().getContentAsString(), "0,0020 km");
	}
	
	@Test
	public void test_metersToCentimeters() throws Exception {
		MvcResult result = this.mockMvc.perform(get(METER_METRIC_URI).param("value", "20")
				.param("toUnits", Units.CENTIMITERS.toString()).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andReturn();

		assertEquals(result.getResponse().getContentAsString(), "2000 cm");
	}
	
	//Meter Imparial Tests
	@Test
	public void test_metersToInches() throws Exception {
		MvcResult result = this.mockMvc.perform(get(METER_IMPERIAL_URI).param("value", "20")
				.param("toUnits", Units.INCHES.toString()).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andReturn();

		assertEquals(result.getResponse().getContentAsString(), "7,8740 in");
	}
	
	@Test
	public void test_metersToFeet() throws Exception {
		MvcResult result = this.mockMvc.perform(get(METER_IMPERIAL_URI).param("value", "20")
				.param("toUnits", Units.FEET.toString()).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andReturn();

		assertEquals(result.getResponse().getContentAsString(), "65,6200 ft");
	}
	
	@Test
	public void test_metersToImperialYards() throws Exception {
		MvcResult result = this.mockMvc.perform(get(METER_IMPERIAL_URI).param("value", "20")
				.param("toUnits", Units.YARDS.toString()).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andReturn();

		assertEquals(result.getResponse().getContentAsString(), "21,8800 yd");
	}
	
	
}
