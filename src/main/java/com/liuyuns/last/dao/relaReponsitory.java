package com.liuyuns.last.dao;

import com.liuyuns.last.entities.en;
import com.liuyuns.last.entities.rela;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface relaReponsitory extends Neo4jRepository<rela,Long>{
}
