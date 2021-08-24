
              package com.springrest.springrest;
              import org.springframework.boot.SpringApplication;
              import org.springframework.boot.autoconfigure.SpringBootApplication;
              import org.springframework.data.jpa.repository.Query;
              import org.springframework.web.bind.annotation.GetMapping;
              import org.springframework.web.bind.annotation.RequestParam;
              import org.springframework.web.bind.annotation.RestController;
              
              @SpringBootApplication
              @RestController
              public class SpringrestApplication {
                
                  
                  public static void main(String[] args) {
                  SpringApplication.run(SpringrestApplication.class, args);
                  
                  
                  }
                  
                 
                  @GetMapping("/hello")
                  public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
                	  createTable();
                  return String.format("Hello %s!", name);
                  
                  
                  }
                  @Query("create table test(name varchar(10))")
                  public static void createTable() {
                	  
                  }
                  
                
              }
            