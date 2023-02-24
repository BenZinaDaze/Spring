package com.test;

import com.test.dao.UserDao;
import com.test.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {

    public static void main(String[] args) {
        //创建一个工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //创建一个读取器（读XML文件）
        XmlBeanDefinitionReader  reader = new XmlBeanDefinitionReader(beanFactory);
        //读取器配置文件给工厂
        reader.loadBeanDefinitions("beans.xml");
        //根据id获取bean对象
        UserService userService = (UserService) beanFactory.getBean("userService");
//        System.out.println(userService);

//        UserDao userDao = (UserDao) beanFactory.getBean("userDao");
//        System.out.println(userDao);
    }
}
