package com.metric.converter.mass;

import java.util.function.Function;

import com.metric.converter.Units;

public abstract class MassConverter {
	
	public abstract Function<Units, String> toMilligrams(double value);
	
	public abstract Function<Units, String> toGrams(double value);
	
	public abstract Function<Units, String> toKilograms(double value);
	
	public abstract Function<Units, String> toTonne(double value);
	
	public abstract Function<Units, String> toOunce(double value);
	
	public abstract Function<Units, String> toPound(double value);
	
	public abstract Function<Units, String> toStone(double value);
}
