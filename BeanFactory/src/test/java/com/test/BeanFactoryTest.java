package com.test;

import com.test.servise.UserServise;
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
        UserServise userServise = (UserServise) beanFactory.getBean("userServise");
        System.out.println(userServise);
    }
}
