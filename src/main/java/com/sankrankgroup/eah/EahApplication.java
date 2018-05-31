package com.sankrankgroup.eah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.sankrankgroup.*")
@EnableJpaRepositories("com.sankrankgroup.eah.repositories")
@ComponentScan("com.sankrankgroup.*")
@SpringBootApplication
public class EahApplication {
	public static void main(String[] args) {

	    SpringApplication.run(EahApplication.class, args);
	}
}
