package com.liuyuns.last;


import com.liuyuns.last.dao.en1Repository;
import com.liuyuns.last.dao.enRepository;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;




@SpringBootTest
class LastApplicationTests {

    @Autowired
    en1Repository enrepository;

    @Test
    public void testCreate(){
        enrepository.findById(2246L);
    }
}
