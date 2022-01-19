package com.liuyuns.last.entity;



import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;


import java.io.Serializable;

@Data
@NodeEntity(label = "en")
public class en implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String type;

}
