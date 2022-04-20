package com.metric.converter.length;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.metric.converter.Units;
import com.metric.converter.annotations.CustomConverter;
import com.metric.converter.annotations.Length;

@Component
@Length(units = Units.KILOMETERS)
public class KilometerConverter extends LengthConverter {
	
	public KilometerConverter() {
		super(Units.KILOMETERS);
	}

	@Override
	public Function<Units, String> toMillimeters(double value) {
		return toUnits -> format(toUnits, value * 0000001);
	}

	@Override
	public Function<Units, String> toMeters(double value) {
		return Units -> format(Units, value * 1000);
	}

	@Override
	public Function<Units, String> toKilometers(double value) {
		return toUnits -> format(toUnits, value);
	}

	@Override
	public Function<Units, String> toInches(double value) {
		return toUnits -> format(toUnits, value * 39370);
	}

	@Override
	public Function<Units, String> toFeet(double value) {
		return toUnits -> format(toUnits, value * 3281);
	}

	@Override
	public Function<Units, String> toMiles(double value) {
		return toUnits -> format(toUnits, value / 1.609);
	}

	@Override
	public Function<Units, String> toYards(double value) {
		return toUnits -> format(toUnits, value * 1094);
	}

	@Override
	public Function<Units, String> toCentimeters(double value) {
		return toUnits -> format(toUnits, value * 100000);
	}
}
