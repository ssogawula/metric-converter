package com.metric.converter.temperature;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.metric.converter.Units;
import com.metric.converter.annotations.Temperature;

@Component
@Temperature(units = Units.FAHRENHEIT)
public class FahrenheitConverter extends TemperatureConverter {

	public FahrenheitConverter() {
		super(Units.FAHRENHEIT);
	}
	
	

	@Override
	public Function<Units, String> toCelsius(double value) {
		return units -> {
			double celsius = (value - 32) * 5/9;
			return format(celsius, units);
		};
	}

	@Override
	public Function<Units, String> toKelvin(double value) {
		return units -> {
			double kelvin = (value -32) * 5/9 + 273.15;
			return format(kelvin, units);
		};
	}

	@Override
	public Function<Units, String> toFahrenheit(double value) {
		return units -> {
			double fahrenheit = (value - 32) * 9/5 + 273.15;
			return format(fahrenheit, units);
		};	
	}
}
