package com.liuyuns.last.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

import java.io.Serializable;

@Data
@NodeEntity(label = "en1")
public class en1 implements Serializable {
    @Id
    @GeneratedValue
    private Long Id;

    @Property
    private String name;
}
