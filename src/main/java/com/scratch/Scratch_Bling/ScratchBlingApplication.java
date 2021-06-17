package com.scratch.Scratch_Bling;

import com.scratch.controller.scratcherController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import com.scratch.repository.ScratcherRepo;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackageClasses = scratcherController.class)
@ComponentScan(basePackageClasses = ScratcherRepo.class)
public class ScratchBlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScratchBlingApplication.class, args);
	}

}
