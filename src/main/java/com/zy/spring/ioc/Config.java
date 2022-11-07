package com.zy.spring.ioc;

import com.zy.spring.ioc.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //当前类是一个配置类，用于替代applicationContext.xml
public class Config {

    @Bean  //java Config利用方法创建对象，将方法返回的对象放入容器，beanId=方法名
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        return userDao;
    }
}
