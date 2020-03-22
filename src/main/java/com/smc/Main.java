package com.smc;

import com.smc.config.AppConfigForSpringQualifiersAndBeanNames;
import com.smc.springqualifiers.iinterface.IInterface;
import com.smc.springqualifiers.iinterface.IInterfaceImpl;
import com.smc.springqualifiers.inheritance.ChildClass;
import com.smc.springqualifiers.inheritance.ParentClass;
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

        System.out.println("\n\n--Real business starts now");

        ParentClass pc1 = (ParentClass) applicationContext.getBean("foobar");
        System.out.println("Bean with ID: '" + pc1.id + "' was allotted by Spring");
        pc1.run();

//        ChildClass cc1 = (ChildClass) applicationContext.getBean("foobar");
//        System.out.println("Bean with ID: '" + cc1.id + "' was allotted by Spring");
//        cc1.run();

//        ChildClass cc2 = (ChildClass) applicationContext.getBean(ChildClass.class);
//        System.out.println("Bean with ID: '" + cc2.id + "' was allotted by Spring");
//        cc2.run();

        IInterface i = (IInterface) applicationContext.getBean("bazz");
        System.out.println("Bean with ID: '" + i.getId() + "' was allotted by Spring");
        i.run();

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

        System.out.println("\n\n---All Beans of type IInterface: ");
        Arrays.asList(applicationContext.getBeanNamesForType(IInterface.class)).forEach(System.out::println);

        System.out.println("\n\n---All Beans of type IInterfaceImpl: ");
        Arrays.asList(applicationContext.getBeanNamesForType(IInterfaceImpl.class)).forEach(System.out::println);

    }
}
