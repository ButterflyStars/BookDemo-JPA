package com.jia;

import com.jia.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootTestApplicationTests {
@Autowired
    BookDao bookDao;

    @Test
    void finAll(){
        System.out.println(bookDao.findAll());
    }

}
