package com.metric.converter.length;

import java.util.function.Function;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.metric.converter.Units;
import com.metric.converter.annotations.CustomConverter;
import com.metric.converter.exceptions.NotImplementedException;
import com.metric.converter.factory.LengthConverterFactory;

@Component
public class MetricConverterImpl implements MetricConverter{
	
	private LengthConverterFactory factory;

	public MetricConverterImpl(LengthConverterFactory factory) {
		this.factory = factory;
	}

	@Override
	public String toImperial(double value, Units fromUnits, Units toUnits) {
		Assert.notNull(value, "value to convert cannot be blank");
		
		switch (toUnits) {
		case FEET:
			return	toFeet(value, fromUnits).apply(toUnits);
		case INCHES:
		   return toInches(value, fromUnits).apply(toUnits);
		case YARDS:
			return toYards(value, fromUnits).apply(toUnits);
		case MILES:
			return toMiles(value, fromUnits).apply(toUnits);
		default:
			throw new NotImplementedException();
		}
	}

	@Override
	public Function<Units, String> toInches(double value, Units fromUnits) {
		return toUnits -> {
			double inches = value * 0.3937;
			return format(inches, toUnits);
		};
	}
	
	@Override
	public Function<Units, String> toFeet(double value, Units fromUnits) {
		return factory.getLengthConverter(fromUnits).toFeet(value);
	}
	
	@Override
	public Function<Units, String> toMiles(double value, Units fromUnits) {
		return factory.getLengthConverter(fromUnits).toMiles(value);
	}
	
	@Override
	public Function<Units, String> toYards(double value, Units fromUnits) {
		return factory.getLengthConverter(fromUnits).toYards(value);
	}
}
