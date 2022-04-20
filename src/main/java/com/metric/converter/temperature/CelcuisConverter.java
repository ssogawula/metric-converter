package com.metric.converter.temperature;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.metric.converter.Units;
import com.metric.converter.annotations.Temperature;


@Component
@Temperature(units = Units.CELSIUS)
public class CelcuisConverter extends TemperatureConverter {

	public CelcuisConverter() {
		super(Units.CELSIUS);
	}
	
	@Override
	public Function<Units, String> toCelsius(double value) {
		return units -> {
			double celsius = (value - 32 ) * 5/9;
			return format(celsius, units);
		};
	}

	@Override
	public Function<Units, String> toKelvin(double value) {
		return units -> {
			double kelvin = value + 273.15;
			return format(kelvin, units);
		};
	}

	@Override
	public Function<Units, String> toFahrenheit(double value) {
		return units -> {
			double fahrenheit = (value * 9/5) + 32;
			return format(fahrenheit, units);
		};	
	}
}
