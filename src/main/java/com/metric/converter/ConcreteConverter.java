package com.metric.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.metric.converter.length.ImperialConverter;
import com.metric.converter.length.MetricConverter;

@Component
public class ConcreteConverter extends Converter{
	
	@Autowired
	private MetricConverter metricConverter;
	
	@Autowired
	private ImperialConverter imperialConverter;

	@Override
	public String toImperial(double value, Units fromUnits,  Units toUnits) {
		return metricConverter.toImperial(value, fromUnits, toUnits);
	}

	@Override
	public String toMetric(double value, Units fromUnits,  Units toUnits) {
		return imperialConverter.toMetric(value, fromUnits, toUnits);
	}

}
