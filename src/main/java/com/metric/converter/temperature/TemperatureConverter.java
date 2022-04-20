package com.metric.converter.temperature;

import java.util.function.Function;

import com.metric.converter.Converter;
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
			break;
		}

		return result;
	}

	public abstract Function<Units, String> toCelsius(double value);

	public abstract Function<Units, String> toKelvin(double value);

	public abstract Function<Units, String> toFahrenheit(double value);
}
