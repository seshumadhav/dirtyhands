package com.smc.springqualifiers;

import java.util.Arrays;

public class ParentClass {

    protected int id;

    public ParentClass() {
        // Prints call stack
//        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
//        Arrays.asList(ste).forEach(System.out::println);

        System.out.println("A new ParentClass object is created");
        id = this.hashCode();
    }

    public void run() {
        System.out.println("ParentClass '" + id + "' is running");
    }
}
