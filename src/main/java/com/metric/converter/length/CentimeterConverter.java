package com.metric.converter.length;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.metric.converter.Units;
import com.metric.converter.annotations.CustomConverter;
import com.metric.converter.annotations.Length;

@Component
@Length(units = Units.CENTIMITERS)
public class CentimeterConverter extends LengthConverter {
	
	public CentimeterConverter() {
		super(Units.CENTIMITERS);
	}
	
	@Override
	public Function<Units, String> toMillimeters(double value) {
		return toUnits -> {
			double millimeters = value * 10;
			return format(toUnits, millimeters);
		};
	}
	
	@Override
	public Function<Units, String> toCentimeters(double value) {
		return toUnits -> {
			return format(toUnits, value);
		};
	}
	
	@Override
	public Function<Units, String> toMeters(double value) {
		return toUnits -> {
			double meters = (value / 100);
			return format(toUnits, meters);
		};
	}
	@Override
	public Function<Units, String> toKilometers(double value) {
		return toUnits -> {
			double kilometers = (value / 100) / 1000;
			return format(toUnits, kilometers);
		};
	}
	
	@Override
	public Function<Units, String> toInches(double value) {
		return toUnits -> {
			double inches = value * 0.3937;
			return format(toUnits, inches);
		};
	}
	
	@Override
	public Function<Units, String> toFeet(double value) {
		return toUnits -> {
			double feet = value / 30.48;
			return format(toUnits, feet);
		};
	}
	
	@Override
	public Function<Units, String> toMiles(double value) {
		return toUnits -> {
			double miles =value / 160934;
			return format(toUnits, miles);
		};
	}
	
	@Override
	public Function<Units, String> toYards(double value) {
		return toUnits -> {
			double yards = value / 91.44;
			return format(toUnits, yards);
		};
	}
}
