package com.smc.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

 public class HelloWorld {

    private String salutation;
    private String serverName;

    public String getSalutation() {
        return salutation;
    }


    public String getServerName() {
        return serverName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public HelloWorld(String salutation, String name, String serverName) {
        this.salutation = salutation;
        this.name = name;
        this.serverName = serverName;
    }

    public void sayHello() {
        System.out.println("Hello World " + getSalutation() + "." + getName() + "!" + " - Greeted by " + getServerName());
    }
}
