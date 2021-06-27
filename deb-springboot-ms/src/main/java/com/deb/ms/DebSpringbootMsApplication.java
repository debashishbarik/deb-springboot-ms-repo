package com.deb.ms;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Slf4j
@SpringBootApplication
public class DebSpringbootMsApplication {

	public static void main(String[] args) {
		log.info("this is a info message");
		log.warn("this is a warn message");
		log.error("this is a error message");
		SpringApplication.run(DebSpringbootMsApplication.class, args);
	}
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.deb.ms")).build();
	}
}
