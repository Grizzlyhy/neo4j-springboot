package com.liuyuns.last;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
public class LastApplication {

    public static void main(String[] args) {
        SpringApplication.run(LastApplication.class, args);
    }

}
