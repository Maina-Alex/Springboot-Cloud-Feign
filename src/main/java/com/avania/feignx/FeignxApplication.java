package com.avania.feignx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignxApplication {
	public static void main(String[] args) {
		SpringApplication.run(FeignxApplication.class, args);
	}

}
