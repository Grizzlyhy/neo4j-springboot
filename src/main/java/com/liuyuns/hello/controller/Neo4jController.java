package com.liuyuns.hello.controller;

import com.liuyuns.hello.dao.enRepository;
import com.liuyuns.hello.entity.en;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/neo4j")
public class Neo4jController {

    @Autowired
    private enRepository repository;

    @RequestMapping("/all")
    public Optional<en> all(Long id){

        System.out.println(id);
        Optional<en> all = repository.findById(id);
        return  all;
    }
}
