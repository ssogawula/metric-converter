package com.metric.converter.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.metric.converter.Units;
import com.metric.converter.annotations.Temperature;
import com.metric.converter.temperature.TemperatureConverter;

@Component
public class TemperatureFactory {

	private final Map<Units, TemperatureConverter> valueMap = new HashMap<Units, TemperatureConverter>();
	
	public TemperatureFactory(List<TemperatureConverter> converters) {
		converters.forEach(converter -> {
			valueMap.put(converter.getClass().getAnnotationsByType(Temperature.class)[0].units(), converter);
		});
	}
	
	public TemperatureConverter getTemperatureConverter(Units key) {
		return valueMap.get(key);
	}
}
