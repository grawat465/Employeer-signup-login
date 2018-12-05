/**File name=SeekerLogin
 * Author=Govind Singh
 * Date=27/12/2018
 */
package com.ntl.topjobs.seekersignuplogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

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
