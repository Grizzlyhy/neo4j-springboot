package com.liuyuns.last.entities;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

import java.io.Serializable;


@Data
@Node(labels = "en")
public class en implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Property("type")
    private  String type;

    @Property("name")
    private  String name;

}
