package com.ntl.topjobs.seekersignuplogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.ntl.topjobs.seekersignuplogin")
@EnableEurekaClient
@EnableDiscoveryClient
public class SeekerSignupLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeekerSignupLoginApplication.class, args);
		System.out.println("Start Seeker LoginSignup");
	}
	
}
