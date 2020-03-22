package com.smc;

import com.smc.config.AppConfigForSpringQualifiersAndBeanNames;
import com.smc.springqualifiers.ChildClass;
import com.smc.springqualifiers.ParentClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

    private static AnnotationConfigApplicationContext applicationContext;

    public static void main(String[] args) {
        System.out.println("Hello World!");

//        @SuppressWarnings("resource")
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        HelloWorld helloWorldBean = context.getBean("helloWorldBean", HelloWorld.class);
//        helloWorldBean.sayHello();
//
//        WorkersConfigurationParser parser = context.getBean(WorkersConfigurationParser.class);
//        parser.parsePropertiesAndPrint();

        applicationContext = new AnnotationConfigApplicationContext(AppConfigForSpringQualifiersAndBeanNames.class);
        displayAllBeans();

        ParentClass pc1 = (ParentClass) applicationContext.getBean("foobar");
        System.out.println("\n\n--Real business starts now");
        pc1.run();

    }

    public static void displayAllBeans() {
        System.out.println("\n\n---All Beans: ");
        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }

        System.out.println("\n\n---All Beans of type ParentClass: ");
        Arrays.asList(applicationContext.getBeanNamesForType(ParentClass.class)).forEach(System.out::println);

        System.out.println("\n\n---All Beans of type ChildClass: ");
        Arrays.asList(applicationContext.getBeanNamesForType(ChildClass.class)).forEach(System.out::println);
    }
}
