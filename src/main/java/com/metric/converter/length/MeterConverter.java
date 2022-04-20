package com.metric.converter.length;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.metric.converter.Units;
import com.metric.converter.annotations.CustomConverter;
import com.metric.converter.annotations.Length;

@Component
@Length(units = Units.METERS)
public class MeterConverter extends LengthConverter {
	
	public MeterConverter() {
		super(Units.METERS);
	}

	@Override
	public Function<Units, String> toMillimeters(double value) {
		return toUnits -> {
			return format(toUnits, value * 1000);
		};
	}

	@Override
	public Function<Units, String> toMeters(double value) {
		return toUnits -> {
			return format(toUnits, value / 0.001);
		};
	}

	@Override
	public Function<Units, String> toKilometers(double value) {
		return toUnits -> {
			return format(toUnits, value / 10000);
		};
	}

	@Override
	public Function<Units, String> toInches(double value) {
		return toUnits -> {
			return format(toUnits, value * 39.37);
		};
	}

	@Override
	public Function<Units, String> toFeet(double value) {
		return toUnits -> {
			return format(toUnits, value * 3.281);
		};
	}

	@Override
	public Function<Units, String> toMiles(double value) {
		return toUnits -> {
			return format(toUnits, value);
		};
	}

	@Override
	public Function<Units, String> toYards(double value) {
		return toUnits -> {
			return format(toUnits, value * 1.094);
		};
	}

	@Override
	public Function<Units, String> toCentimeters(double value) {
		return toUnits -> {
			return format(toUnits, value * 100);
		};
	}
}
