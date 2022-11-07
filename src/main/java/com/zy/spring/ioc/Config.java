package com.zy.spring.ioc;

import com.zy.spring.ioc.controller.UserController;
import com.zy.spring.ioc.dao.EmployeeDao;
import com.zy.spring.ioc.dao.UserDao;
import com.zy.spring.ioc.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration  //当前类是一个配置类，用于替代applicationContext.xml
@ComponentScan(basePackages = "com.zy")
public class Config {

    @Bean  //java Config利用方法创建对象，将方法返回的对象放入容器，beanId=方法名
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        System.out.println("已创建"+userDao);
        return userDao;
    }

    @Bean  //java Config利用方法创建对象，将方法返回的对象放入容器，beanId=方法名
    @Primary
    public UserDao userDao1() {
        UserDao userDao = new UserDao();
        System.out.println("已创建"+userDao);
        return userDao;
    }

    //java config对象依赖注入
    @Bean //相当于 <bean id="XXX" class="xxx">
    //先按name尝试注入，name不存在则按类型注入
    public UserService userService(UserDao userDao , EmployeeDao employeeDao){
        UserService userService = new UserService();
        System.out.println("已创建"+userService);
        userService.setUserDao(userDao);
        System.out.println("调用setUserDao:"+userDao);
        userService.setEmployeeDao(employeeDao);
        return userService;
    }

    @Bean
    public UserController userController(UserService userService){
        UserController userController = new UserController();
        System.out.println("已创建"+userController);
        userController.setUserService(userService);
        System.out.println("调用setUserService:"+userService);
        return userController;
    }
}
