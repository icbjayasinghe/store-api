package com.skyhigh.storeapi;

import com.fasterxml.jackson.databind.Module;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.skyhigh.storeapi",
        "com.skyhigh.storeapi.controller",
        "com.skyhigh.storeapi.config.swagger",
        "com.skyhigh.storeapi.util",
        "com.skyhigh.storeapi.util.convertor",
        "com.skyhigh.storeapi.service",
        "com.skyhigh.storeapi.repository",
        "com.skyhigh.storeapi.exception"})
public class StoreApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreApiApplication.class, args);
    }

    @Bean
    public Module jsonNullableModule() {
        return new JsonNullableModule();
    }

}
