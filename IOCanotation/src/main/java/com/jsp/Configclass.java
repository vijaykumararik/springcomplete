package com.jsp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configclass {
    @Bean
	public Employee getObject() {
	 return new  Employee();
 }
}
