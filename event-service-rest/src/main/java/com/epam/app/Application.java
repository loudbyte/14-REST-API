package com.epam.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.epam.service.impl")
@EntityScan("com.epam.service.dto")
@SpringBootApplication(scanBasePackages = {"com.epam"})
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
