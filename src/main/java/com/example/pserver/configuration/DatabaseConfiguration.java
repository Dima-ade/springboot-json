package com.example.pserver.configuration;

import com.example.pserver.persistence.ManagerPersistence;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@Import({ManagerPersistence.class})
@EntityScan(basePackages = "com.example.pserver.entity")
@EnableJpaRepositories(basePackages = {"com.example.pserver.repository"})
public class DatabaseConfiguration {

    public DatabaseConfiguration() {
        System.out.println("TEST");
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        // Custom configurations go here
        return mapper;
    }
}
