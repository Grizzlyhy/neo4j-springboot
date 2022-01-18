package com.liuyuns.last;


import com.liuyuns.last.dao.enRepository;
import com.liuyuns.last.dao.relaReponsitory;
import com.liuyuns.last.entities.en;
import com.liuyuns.last.entities.rela;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class LastApplicationTests {

//    @Autowired
//    com.liuyuns.last.dao.enRepository enRepository;
//
//    @Test
//    public void testCreate(){
//        Optional<en> byId = enRepository.findById(2246L);
//        byId.orElse(null);
//    }
@Autowired
com.liuyuns.last.dao.relaReponsitory relaReponsitory;

    @Test
    public void testCreate(){
        List<rela> all = relaReponsitory.findAll();


    }

}
