package com.liuyuns.hello.entity;


import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.io.Serializable;

@Data
@RelationshipEntity(type = "RELTYPE")
public class relationShip implements Serializable {
    @Id
    @GeneratedValue
    private Long Id;

    @StartNode
    private en sta;

    @EndNode
    private en end;

}
