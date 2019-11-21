package com.vehiclerental.restservice.RestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableConfigurationProperties
@EnableSwagger2
@EnableEurekaClient
public class RestAppApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(RestAppApplication.class, args);
	}

}
