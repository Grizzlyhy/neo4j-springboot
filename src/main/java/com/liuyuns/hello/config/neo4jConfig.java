package com.liuyuns.hello.config;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@EntityScan(basePackages = "com.liuyuns.hello.entity")
@EnableNeo4jRepositories(basePackages="com.liuyuns.hello.dao")
@Configuration
public class neo4jConfig {
}
