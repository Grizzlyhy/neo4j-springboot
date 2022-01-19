package com.liuyuns.last;


import com.liuyuns.last.dao.en1Repository;


import com.liuyuns.last.entity.en1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


@SpringBootTest
class LastApplicationTests {

    @Autowired
    en1Repository enrepository;

    @Test
    public void testCreate(){
        Optional<en1> byId = enrepository.findById(2246L);
        byId.orElse(null);
    }
}
