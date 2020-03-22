package com.smc.springqualifiers.inheritance;

import com.smc.config.AppConfigForSpringQualifiersAndBeanNames;

import java.util.Arrays;

public class ParentClass {

    public int id;

    public ParentClass() {
//         Prints call stack
//        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
//        Arrays.asList(ste).forEach(System.out::println);

        id = AppConfigForSpringQualifiersAndBeanNames.uniqueId++;
        System.out.println("A new ParentClass object '" + id + "' is created");
    }

    public void run() {
        System.out.println("ParentClass '" + id + "' is running");
    }
}
