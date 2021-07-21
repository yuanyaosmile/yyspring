package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.example")
@Import({BookBeanDefinitionRegistrar.class, WatchImportSelector.class})
public class YYConfig {
}
