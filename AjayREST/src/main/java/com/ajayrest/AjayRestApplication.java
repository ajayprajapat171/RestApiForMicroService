package com.ajayrest;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

@SpringBootApplication
@EnableAsync
public class AjayRestApplication {
	
	
	@Bean
	public Filter shallowEtagFillter() {
		
		return new ShallowEtagHeaderFilter();
		
	}

	public static void main(String[] args) {
		SpringApplication.run(AjayRestApplication.class, args);
	}

}
