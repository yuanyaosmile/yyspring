package com.example.ys.beans.factory.support;

import com.example.ys.beans.factory.config.BeanDefinition;
import com.example.ys.BeanException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SimpleInstantiationStrategy implements InstantiationStrategy {
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) {
        Class clazz = beanDefinition.getBeanClass();
        try{
            if (null != ctor) {
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            }else {
                return clazz.getDeclaredConstructor().newInstance();
            }
        }catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new BeanException("Failed to instantiate [" + clazz.getName() + "]", e);
        }
    }
}
