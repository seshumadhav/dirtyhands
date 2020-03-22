package com.smc.springqualifiers.inheritance;

public class ChildClass extends ParentClass {

    public ChildClass() {
        super();
        System.out.println("A new ChildClass object '" + super.id + "' is created");
    }

    @Override
    public void run() {
        System.out.println("ChildClass '" + super.id + "' is running");
    }

}
