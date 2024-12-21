package com.dev.banking;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Banking API",
				description = "Banking API implements some basic credit, debit and transfer amount from source to destination and " +
						"Account creation and transfer api enabled with Email sender feature",
				version = "v1.0",
				contact = @Contact(
						name = "Prajwal R Shetty",
						email = "prajwalrshetty27@gmail.com",
						url = "https://www.linkedin.com/in/prajwal-shetty-dev/"
				),
				license = @License(
						name = "Prajwal R Shetty",
						url = "https://www.linkedin.com/in/prajwal-shetty-dev/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Developed by Prajwal R Shetty",
				url = "https://www.linkedin.com/in/prajwal-shetty-dev/"
		)
)
public class BankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);
	}

}
