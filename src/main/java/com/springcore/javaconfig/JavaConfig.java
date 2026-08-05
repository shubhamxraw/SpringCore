package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {

//	@Bean
//	public Samosa getSamosa() {
//		return new Samosa();
//	}
//
//	@Bean
//	@Primary
//	public Samosa getSamosa2() {
//		return new Samosa();
//	}
//
//	// can give multiple names to this bean
//	@Bean(name = { "student", "studentBean", "temp" })
//	public Student getStudent(Samosa samosa) { // @Qualifier("getSamosa2")
//		return new Student(samosa);
//	}
}
