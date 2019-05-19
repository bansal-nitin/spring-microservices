package com.nitin.learning.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("limits-service")
public class PropertiesConfiguration {

	private int minimum;
	private int maximum;
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
}
