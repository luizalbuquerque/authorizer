package com.card.authorizer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@OpenAPIDefinition(info = @Info(title = "Authorizer Manager Card", version = "1.0"))
@SpringBootApplication
public class AuthorizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorizerApplication.class, args);
	}

}
