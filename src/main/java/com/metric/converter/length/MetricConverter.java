package com.metric.converter.length;

import java.util.function.Function;

import com.metric.converter.Units;

public interface MetricConverter {
	
	String toImperial(double value, Units fromUnits, Units toUnits);
	
	public Function<Units, String> toInches(double value, Units fromUnits);
	
	public Function<Units, String> toFeet(double value, Units fromUnits);
	
	public Function<Units, String> toMiles(double value, Units fromUnits);
	
	public Function<Units, String> toYards(double value, Units fromUnits);
	
	public default String format(double value, Units toUnits) {
		if (value % 2 == 0) {
			return String.format("%.0f %s", value, toUnits.getValue());
		}
		return String.format("%.4f %s", value, toUnits.getValue());
	}

}
