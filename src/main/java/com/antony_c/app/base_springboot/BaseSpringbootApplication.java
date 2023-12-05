package com.antony_c.app.base_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.antony_c.app.base_springboot.model.HelloWorld;
import com.antony_c.app.base_springboot.service.BusinessService;

@SpringBootApplication
public class BaseSpringbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(BaseSpringbootApplication.class, args);
	}

}

/**
 * This class is responsible for initializing the application on startup.
 * It implements the CommandLineRunner interface to execute the run method
 * when the application starts.
 */
@Component
class StartupInitializer implements CommandLineRunner {

	@Autowired
	private BusinessService businessService;

	@Override
	public void run(String... args) throws Exception {
		HelloWorld hw = businessService.getHelloWorld();
		System.out.println(hw);
	}
}