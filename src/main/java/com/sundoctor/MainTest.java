package com.sundoctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhanglong on 2015/5/22.
 */
public class MainTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext(
                new String[]{"classpath:applicationContext.xml","classpath:applicationContext-quartz.xml"});
    }
}
