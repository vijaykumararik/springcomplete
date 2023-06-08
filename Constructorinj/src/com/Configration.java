package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configration {
    @Bean
	public Student hello() {
	return new Student(52, "nini");
}
}
