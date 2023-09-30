package com.udemydemo.udemy;

import com.udemydemo.udemy.GameConsole.Nintendo;
import com.udemydemo.udemy.GameConsole.PlayStation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

//@SpringBootApplication
@ComponentScan
public class UdemyApplication {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UdemyApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(element -> {
            System.out.println(element);
        });
        Nintendo nintendo = context.getBean(Nintendo.class);
        nintendo.run();
        nintendo.restart();

        System.out.println(context.getBean(PlayStation.class));
        System.out.println(context.getBean(PlayStation.class));
        System.out.println(context.getBean(PlayStation.class));
    }


}
