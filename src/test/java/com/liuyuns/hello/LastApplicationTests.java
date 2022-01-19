package com.liuyuns.hello;


import com.liuyuns.hello.dao.enRepository;


import com.liuyuns.hello.entity.en;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class LastApplicationTests {

    @Autowired
    enRepository enrepository;

    @Test
    public void testCreate(){
        Iterable<en> byId = enrepository.findAll();

        Iterable<en> all = enrepository.findAll();
        System.out.println(all);
    }

//    @Autowired
//    relationRepository relation;
//
//
//    @Test
//    public void testgetall(){
//        Optional<relationShip> byId = relation.findById(1680L);
//        System.out.println(byId);
//    }
}
