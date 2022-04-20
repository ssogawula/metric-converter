package com.metric.converter.utils;

import com.metric.converter.Units;

public class Utils {
	
	public static String format(String value, Units units, String format) {
		return String.format(format, value, units.getValue());
	}
}
