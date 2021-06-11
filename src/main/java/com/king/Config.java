package com.king;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.king.bean.Engine;
import com.king.bean.Transmission;

@Configuration
@ComponentScan("com.king.bean")
public class Config {
	@Bean
	public Engine engine() {
		return new Engine("v8", 5);
	}

	@Bean
	public Transmission transmission() {
		return new Transmission("sliding");
	}
}
