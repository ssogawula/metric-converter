package com.metric.converter.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.metric.converter.Units;
import com.metric.converter.annotations.CustomConverter;
import com.metric.converter.annotations.Length;
import com.metric.converter.length.LengthConverter;

@Component
public class LengthConverterFactory {
	
	private final Map<Units, LengthConverter> valueMap = new HashMap<>();
	
	public LengthConverterFactory(List<LengthConverter> converters) {
		converters.forEach(converter -> {
			valueMap.put(converter.getClass().getAnnotationsByType(Length.class)[0].units(), converter);
		});
	}
	
	public LengthConverter getLengthConverter(Units key) {
		return valueMap.get(key);
	}
}
