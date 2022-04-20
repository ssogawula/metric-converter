package com.metric.converter;

public abstract class Converter {
	
	protected Units fromUnits;
	
	protected Units toUnits;

	public abstract String toImperial(double value, Units fromUnits, Units toUnits);

	public abstract String toMetric(double value, Units fromUnits,  Units toUnits);
}
