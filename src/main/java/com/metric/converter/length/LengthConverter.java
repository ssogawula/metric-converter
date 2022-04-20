package com.metric.converter.length;

import java.util.function.Function;

import org.springframework.util.Assert;

import com.metric.converter.Converter;
import com.metric.converter.Units;
import com.metric.converter.exceptions.NotImplementedException;

public abstract class LengthConverter {

	protected Units toUnits;

	public LengthConverter(Units toUnits) {
		this.toUnits = toUnits;
	}

	protected String format(Units toUnits, double value) {
		if (value % 2 == 0) {
			return String.format("%.0f %s", value, toUnits.getValue());
		} else {
			return String.format("%.4f %s", value, toUnits.getValue());
		}
	}

	public abstract Function<Units, String> toCentimeters(double value);

	public abstract Function<Units, String> toMillimeters(double value);

	public abstract Function<Units, String> toMeters(double value);

	public abstract Function<Units, String> toKilometers(double value);

	public abstract Function<Units, String> toInches(double value);

	public abstract Function<Units, String> toFeet(double value);

	public abstract Function<Units, String> toMiles(double value);

	public abstract Function<Units, String> toYards(double value);
}
