package com.metric.converter.length;

import java.util.function.Function;

import com.metric.converter.Units;

public interface ImperialConverter {
	
	String toMetric(double value, Units fromUnits, Units toUnits);
	
	public abstract Function<Units, String> toCentimeters(double value, Units fromUnits);

	public abstract Function<Units, String> toMillimeters(double value, Units fromUnits);

	public abstract Function<Units, String> toMeters(double value, Units fromUnits);

	public abstract Function<Units, String> toKilometers(double value, Units fromUnits);

}
