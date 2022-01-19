package com.liuyuns.last.dao;

import com.liuyuns.last.entity.en;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface enRepository extends Neo4jRepository<en,Long> {

}
