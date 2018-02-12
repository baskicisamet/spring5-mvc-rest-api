package com.sam.spring5mvcrestapp.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket api() { // this config is already default
		return new Docket(DocumentationType.SWAGGER_2) //docket is swagger config
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.pathMapping("/")
				.apiInfo(metadata());
	}
	
	
	private ApiInfo metadata(){
		
		Contact contact = new Contact("Samet Baskıcı","https://sametbaskici.com/about/","sam@sametbaskici.com");
		
		return new ApiInfo(
				"Samet Baskcı",//title
				"Description",//description
				"1.0",//version
				"terms of service: bla bla",
				contact,
				"Apache licence Version 2.0",
				"https://www.apache.org/licenses/LICENSE-2.0",
				new ArrayList<>());
				
		
	}
	
   

}
