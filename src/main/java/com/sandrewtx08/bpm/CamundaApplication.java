package com.sandrewtx08.bpm;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableProcessApplication("postalservice")
public class CamundaApplication extends SpringBootServletInitializer {
  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(applicationClass);
  }

  public static void main(String... args) {
    SpringApplication.run(CamundaApplication.class, args);
  }

  private static Class<CamundaApplication> applicationClass = CamundaApplication.class;
}
