package com.udemydemo.udemy;

import com.udemydemo.udemy.GameConsole.Nintendo;
import com.udemydemo.udemy.GameConsole.PlayStation;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootTest(classes = UdemyApplication.class)
class UdemyApplicationTests {

    @Test
    public void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UdemyApplication.class);
        Nintendo ps = context.getBean(Nintendo.class);
        ps.run();


    }

}
