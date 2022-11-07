package com.zy.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        //基于Java Config配置IoC容器初始化
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("==============================");
        //获取beanId
        String[] ids = context.getBeanDefinitionNames();
        for (String id : ids) {
            System.out.println(id+":"+context.getBean(id));
        }
    }
}
