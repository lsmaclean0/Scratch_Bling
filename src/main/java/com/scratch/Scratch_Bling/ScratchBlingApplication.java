package com.scratch.Scratch_Bling;

import controller.scratcherController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import repository.ScratcherRepo;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackageClasses = scratcherController.class)
@ComponentScan(basePackageClasses = ScratcherRepo.class)
public class ScratchBlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScratchBlingApplication.class, args);
	}

}
