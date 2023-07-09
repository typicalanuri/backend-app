package org.recruitingapp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="pl.hypeapp.org.recruitingapp.*")
@EntityScan("pl.hypeapp.org.recruitingapp.*")
public class RecruitingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecruitingAppApplication.class, args);
	}

}
