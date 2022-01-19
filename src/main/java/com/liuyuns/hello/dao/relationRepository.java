package com.liuyuns.hello.dao;


import com.liuyuns.hello.entity.en;
import com.liuyuns.hello.entity.relationShip;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface relationRepository extends Neo4jRepository<relationShip,Long> {

}
