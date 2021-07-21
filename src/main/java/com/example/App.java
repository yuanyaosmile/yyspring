package com.example;


import com.example.config.YYConfig;
import com.example.entity.Book;
import com.example.entity.Phone;
import com.example.entity.Watch;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(YYConfig.class);
        Phone phone =(Phone) ac.getBean("phone");
        phone.ring();

        Book book = (Book) ac.getBean("book");
        book.page();

        Watch watch = (Watch) ac.getBean("com.example.entity.Watch");
        watch.time();
    }
}
