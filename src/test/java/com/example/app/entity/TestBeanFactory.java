package com.example.app.entity;

import com.example.ys.beans.factory.config.BeanDefinition;
import com.example.ys.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class TestBeanFactory {

    @Test
    public void test_beanFactory() {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(User.class);
        factory.registerBeanDefinition("user", beanDefinition);

        User user = (User) factory.getBean("user", "tom");
        System.out.println(user.getName());
    }


}
