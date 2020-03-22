package com.smc.springqualifiers.iinterface;

import com.smc.config.AppConfigForSpringQualifiersAndBeanNames;

public class IInterfaceImpl implements  IInterface {

    public int id;

    public IInterfaceImpl() {
        id = AppConfigForSpringQualifiersAndBeanNames.uniqueId++;
        System.out.println("A new IInterfaceImpl object '" + id + "' is created");
    }

    @Override
    public void run() {
        System.out.println("IInterfaceImpl object with id '" + id + "' is running");
    }

    @Override
    public int getId() {
        return id;
    }

}
