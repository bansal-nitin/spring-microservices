package com.nitin.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nitin.learning.configuration.PropertiesConfiguration;
import com.nitin.learning.dto.LimitConfiguration;

@RestController
public class LimitsController {

	@Autowired
	PropertiesConfiguration propertiesConfig;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(propertiesConfig.getMinimum(), propertiesConfig.getMaximum());
	}
}
