package com.smc.springqualifiers;

public class ChildClass extends ParentClass {

    public ChildClass() {
        super();
        System.out.println("A new ChildClass object is created");
    }

    @Override
    public void run() {
        System.out.println("ChildClass '" + super.id + "' is running");
    }

}
