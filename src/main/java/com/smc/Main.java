package com.smc;

import com.smc.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.smc.properties.WorkersConfigurationParser;
import com.smc.springdemo.HelloWorld;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean = context.getBean("helloWorldBean", HelloWorld.class);
        helloWorldBean.sayHello();

        WorkersConfigurationParser parser = context.getBean(WorkersConfigurationParser.class);
        parser.parsePropertiesAndPrint();
    }
}
