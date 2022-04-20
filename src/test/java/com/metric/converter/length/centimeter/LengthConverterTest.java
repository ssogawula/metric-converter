package com.metric.converter.length.centimeter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.metric.converter.Units;
import com.metric.converter.centimeter.AbstractTest;

@SpringBootTest
public class LengthConverterTest extends AbstractTest{

	
	@Test
	public void test_centimeterToMeters() {
		
	String result = converter.toMetric(20, Units.CENTIMITERS, Units.METERS);
		
		assertEquals(result, "0,2000 m");
	}
	
	@Test
	public void test_centimeterToKilometers() {
		
		String result = converter.toMetric(20, Units.CENTIMITERS, Units.KILOMETERS);
		
		assertEquals(result,"0,0002 km");
	}
	
	@Test
	public void test_centimeterToMillimeters() {
		
		String result = converter.toMetric(20, Units.CENTIMITERS, Units.MILLIMETERS);
		
		assertEquals(result, "0,2000 mm");
	}
	
	@Test
	public void test_centimeterToFeet() {
		
		String result = converter.toImperial(20, Units.CENTIMITERS, Units.FEET);
		
		assertEquals(result, String.format("%.4f ft", 0.656167979));
	}
	
	@Test
	public void test_centimeterToMiles() {

		String result = converter.toImperial(20, Units.CENTIMITERS, Units.MILES);
		
		assertEquals(result,"0,0001 ml");
	}
	
	@Test
	public void test_centimeterToYards() {
		
		String result = converter.toImperial(20, Units.CENTIMITERS, Units.YARDS);
		
		assertEquals(result, String.format("%.4f yd",0.218723));
	}
}
