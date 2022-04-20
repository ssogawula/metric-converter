package com.metric.converter.web.temperature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.metric.converter.Units;
import com.metric.converter.factory.TemperatureFactory;
import com.metric.converter.temperature.TemperatureConverter;

@RestController
@RequestMapping("/api/temperatures")
public class TemperatureController {

	@Autowired
	private  TemperatureFactory factory;
	
	@GetMapping("/fahrenheit")
	public ResponseEntity<String> getFahrenheit(@RequestParam Units toUnits, @RequestParam double value) {
		return new ResponseEntity<String>(factory.getTemperatureConverter(Units.FAHRENHEIT).convertTemperature(toUnits, value), HttpStatus.OK);
	}
	
	@GetMapping("/kelvin")
	public ResponseEntity<String> getKelvin(@RequestParam Units toUnits, @RequestParam double value) {
		return new ResponseEntity<String>(factory.getTemperatureConverter(Units.KELVIN).convertTemperature(toUnits, value), HttpStatus.OK);
	}

	@GetMapping("/celsius")
	public ResponseEntity<String> getCelsius(@RequestParam Units toUnits, @RequestParam double value) {
		return new ResponseEntity<String>(factory.getTemperatureConverter(Units.CELSIUS).convertTemperature(toUnits, value), HttpStatus.OK);
	}
}
