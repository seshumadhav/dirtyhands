package com.smc.config;

import com.smc.springqualifiers.ChildClass;
import com.smc.springqualifiers.ParentClass;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigForSpringQualifiersAndBeanNames {

    @Bean(name = "foobar")
    public ParentClass getParentClass() {
        return new ChildClass();
    }

    @Bean(name = "foobar")
    public ChildClass getChildClass() {
        return new ChildClass();
    }

}
