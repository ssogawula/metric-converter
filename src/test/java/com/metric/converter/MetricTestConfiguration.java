package com.metric.converter;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class MetricTestConfiguration {

	@Bean
	public TestRestTemplate testRestTemplate() {
		return new TestRestTemplate();
	}
}
