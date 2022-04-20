package com.metric.converter.temperature;

import java.util.function.Function;

import org.springframework.util.Assert;

import com.metric.converter.Units;

public abstract class TemperatureConverter {

	protected Units toUnits;

	public TemperatureConverter(Units toUnits) {
		this.toUnits = toUnits;
	}

	protected String format(double value, Units units) {
		return String.format("%.2f %s", value, units.getValue());
	}

	public String convertTemperature(Units toUnits, double value) {
		Assert.notNull(value, "value to convert cannot be blank");
		
		String result = null;

		switch (toUnits) {
		case CELSIUS:
			result = toCelsius(value).apply(toUnits);
			break;
		case FAHRENHEIT:
			result = toFahrenheit(value).apply(toUnits);
			break;
		case KELVIN:
			result = toKelvin(value).apply(toUnits);
		default:
			throw new IllegalArgumentException("Invalid target units");
		}

		return result;
	}

	public abstract Function<Units, String> toCelsius(double value);

	public abstract Function<Units, String> toKelvin(double value);

	public abstract Function<Units, String> toFahrenheit(double value);
}
