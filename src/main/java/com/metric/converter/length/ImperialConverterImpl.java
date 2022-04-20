package com.metric.converter.length;

import java.util.function.Function;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.metric.converter.Units;
import com.metric.converter.exceptions.NotImplementedException;
import com.metric.converter.factory.LengthConverterFactory;

@Component
public class ImperialConverterImpl implements ImperialConverter {
	
	private final LengthConverterFactory factory;
	
	public ImperialConverterImpl(LengthConverterFactory factory) {
		this.factory = factory;
	}

	@Override
	public String toMetric(double value, Units fromUnits, Units toUnits) {
		Assert.notNull(value, "value to convert cannot be blank");
		switch (toUnits) {
		case KILOMETERS:
			return toKilometers(value, fromUnits).apply(toUnits);
		case MILLIMETERS:
			return toMeters(value, fromUnits).apply(toUnits);
		case METERS:
			return toMeters(value, fromUnits).apply(toUnits);
		case CENTIMITERS:
			return toCentimeters(value, fromUnits).apply(toUnits);
		default:
			throw new NotImplementedException();
		}
	}

	@Override
	public Function<Units, String> toCentimeters(double value, Units fromUnits) {
		return factory.getLengthConverter(fromUnits).toCentimeters(value);
	}

	@Override
	public Function<Units, String> toMillimeters(double value, Units fromUnits) {
		return factory.getLengthConverter(fromUnits).toMillimeters(value);
	}

	@Override
	public Function<Units, String> toMeters(double value, Units fromUnits) {
		return factory.getLengthConverter(fromUnits).toMeters(value);
	}

	@Override
	public Function<Units, String> toKilometers(double value, Units fromUnits) {
		return factory.getLengthConverter(fromUnits).toKilometers(value);
	}
}
