package com.liuyuns.last.entities;


import lombok.Data;
import org.springframework.data.neo4j.core.schema.*;

import java.util.List;

@Data
@RelationshipProperties
public class rela {

    @Id
    @GeneratedValue
    private long id;

    @Property("re")
    private  String roles;

    @Property("type")
    private  String type;

    @TargetNode
    private  en en;


}
