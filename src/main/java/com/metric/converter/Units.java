package com.metric.converter;

public enum Units {
	
	CENTIMITERS("cm"),
	MILLIMETERS("mm"),
	KILOMETERS("km"),
	METERS("m"),
	INCHES("in"),
	FEET("ft"),
	YARDS("yd"),
	MILES("ml"),
	CELSIUS("C"),
	FAHRENHEIT("F"),
	KELVIN("K");
	
	private String value;
	Units(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
}
