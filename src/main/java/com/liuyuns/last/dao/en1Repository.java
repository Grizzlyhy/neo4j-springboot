package com.liuyuns.last.dao;


import com.liuyuns.last.entity.en1;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface en1Repository extends Neo4jRepository<en1,Long> {
}
