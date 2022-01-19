package com.liuyuns.hello.entity;



import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


import java.io.Serializable;

@Data
@NodeEntity(label = "ThisIsALabel")
public class en implements Serializable {

    @Id
    @GeneratedValue
    private long Id;

    private String name;

    private Integer entity_hash;


}
