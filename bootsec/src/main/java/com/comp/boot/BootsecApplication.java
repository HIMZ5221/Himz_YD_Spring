package com.comp.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.comp.boot.**.mapper"})
public class BootsecApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootsecApplication.class, args);
	}

}
