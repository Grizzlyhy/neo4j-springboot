package com.liuyuns.hello.dao;


import com.liuyuns.hello.entity.en;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface enRepository extends Neo4jRepository<en,Long> {



}
