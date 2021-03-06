package com.metric.converter.web.length;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.metric.converter.Converter;
import com.metric.converter.Units;

@RestController
@RequestMapping("/api/lengths")
public class LengthController {
	
	private final Converter converter;
	
	public LengthController(Converter factory) {
		this.converter = factory;
	}

	@GetMapping("/centimeters/metrics")
	public String getCentimeterMetrics(@RequestParam Units toUnits, @RequestParam double value) {
		return converter.toMetric(value, Units.CENTIMITERS, toUnits);
	}
	
	@GetMapping("/centimeters/imperials")
	public String getCentimeterImperials(@RequestParam Units toUnits, @RequestParam double value) {
		return converter.toImperial(value, Units.CENTIMITERS, toUnits);
	}
	
	
	@GetMapping("/kilometers/metrics")
	public String getKilometerMetrics(@RequestParam Units toUnits, @RequestParam double value) {
		return converter.toMetric(value, Units.KILOMETERS, toUnits);
	}
	
	@GetMapping("/kilometers/imperials")
	public String getKilometerImperials(@RequestParam Units toUnits, @RequestParam double value) {
		return converter.toImperial(value, Units.KILOMETERS, toUnits);
	}
	
	@GetMapping("/meters/metrics")
	public String getMeterMetrics(@RequestParam Units toUnits, @RequestParam double value) {
		return converter.toMetric(value, Units.METERS, toUnits);
	}
	
	@GetMapping("/meters/imperials")
	public String getMeterImperials(@RequestParam Units toUnits, @RequestParam double value) {
		return converter.toImperial(value, Units.METERS, toUnits);
	}
	
	@GetMapping("/millimeters/metrics")
	public String getMillimeterMetrics(@RequestParam Units toUnits, @RequestParam double value) {
		return converter.toMetric(value, Units.MILLIMETERS, toUnits);
	}
	
	@GetMapping("/millimeters/imparials")
	public String getMillimeterImperial(@RequestParam Units toUnits, @RequestParam double value) {
		return converter.toImperial(value, Units.MILLIMETERS, toUnits);
	}
	
	
	@GetMapping("/inches/metrics")
	public String getIncheMetrics(@RequestParam Units toUnits, @RequestParam double value) {
		return converter.toMetric(value, Units.INCHES, toUnits);
	}
	
	@GetMapping("/inches/imperials")
	public String getIncheImperials(@RequestParam Units toUnits, @RequestParam double value) {
		return converter.toMetric(value, Units.INCHES, toUnits);
	}
	
	@GetMapping("/miles/metrics")
	public String getMileMetrics(@RequestParam Units toUnits, @RequestParam double value) {
		return converter.toMetric(value, Units.MILES, toUnits);
	}
	
	@GetMapping("/miles/imperials")
	public String getMileImperials(@RequestParam Units toUnits, @RequestParam double value) {
		return converter.toMetric(value, Units.MILES, toUnits);
	}
	
	@GetMapping("/yards/metrics")
	public String getYardMetrics(@RequestParam Units toUnits, @RequestParam double value) {
		return converter.toMetric(value, Units.YARDS, toUnits);
	}
	
	@GetMapping("/yards/imperials")
	public String getYardImperials(@RequestParam Units toUnits, @RequestParam double value) {
		return converter.toImperial(value, Units.YARDS, toUnits);
	}
	
	@GetMapping("/feet/metrics")
	public String getFeetMetrics(@RequestParam Units toUnits, @RequestParam double value) {
		return converter.toMetric(value, Units.FEET, toUnits);
	}
	
	@GetMapping("/feet/imperials")
	public String getFeet(@RequestParam Units toUnits, @RequestParam double value) {
		return converter.toImperial(value, Units.FEET, toUnits);
	}
	
}
