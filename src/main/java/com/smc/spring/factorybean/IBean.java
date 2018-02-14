package com.smc.spring.factorybean;

import com.smc.springdemo.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IBean {

    private HelloWorld helloWorld;

    @Autowired
    public IBean(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public IBean(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private String name;
}
