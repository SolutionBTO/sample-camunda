package com.example.workflow;

import camundajar.impl.scala.App;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableProcessApplication("my-camunda-process")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class);
  }
}