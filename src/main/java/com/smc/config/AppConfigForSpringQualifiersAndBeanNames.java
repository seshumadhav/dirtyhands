package com.smc.config;

import com.smc.springqualifiers.iinterface.IInterface;
import com.smc.springqualifiers.iinterface.IInterfaceImpl;
import com.smc.springqualifiers.inheritance.ChildClass;
import com.smc.springqualifiers.inheritance.ParentClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigForSpringQualifiersAndBeanNames {

    public static int uniqueId = 0;


//    If we intend to create a ChildClass object to generate a bean of type ParentClass and ChildClass with same name: “foobar”
//    Like below:
//    @Bean(name = "foobar") public ParentClass getParentClass() { return new ChildClass();}
//    @Bean(name = "foobar") public ChildClass getChildClass() { return new ChildClass();}
//    After processing first line, Spring creates one bean with name: ‘foobar’ and marks that it has one bean of name: ‘foobar’ and types: [ParentClass.class, ChildClass.class]
//    It is not creating or attempting to create a second bean  after second line (since I guess it already has noted a bean with similar name and same type)
//    @Bean(name = "foobar") public ParentClass getParentClass() { return new ChildClass(); }
//    @Bean(name = "foobar") public ChildClass getChildClass() { return new ChildClass(); }

//    If we intend to create two beans (One type: ParentClass & one type: ChildClass) with same name: “foobar”
//    Like below:
//    @Bean(name = "foobar") public ParentClass getParentClass() { return new ParentClass();}
//    @Bean(name = "foobar") public ChildClass getChildClass() { return new ChildClass();}
//    After processing first line, Spring creates one bean with name: ‘foobar’ and marks that it has one bean which of types [ParentClass.class]
//    It is not creating or attempting to create a second bean after second line (since I guess it already has noted a bean with similar name even though not with same type)
//    In this case if someone asked for a bean of type: “foobar” and tried to cast it to ChildClass OR
//    If someone asked for a bean of type: ChildClass.class,
//    Spring would fail the request
    @Bean(name = "foobar") public ParentClass getParentClass() { return new ParentClass(); }
    @Bean(name = "foobar") public ChildClass getChildClass() { return new ChildClass(); }

//    If we intend to create two beans (One type: Interface & one type: InterfaceImpl) with same name: “bazz”
//    Like below:
//    @Bean(name = "bazz") public IInterface getInterfaceClass() { return new IInterfaceImpl();}
//    @Bean(name = "bazz") public IInterfaceImpl IInterfaceImpl() { return new IInterfaceImpl();}
//    Spring after processing first line, Creates one bean with name: bazz and marks that it has one bean with name: bazz, and types: [IInterface.class, IInterfaceImpl.class]
//    It is not creating or attempting to create a second bean  after second line (since I guess it already has noted a bean with similar name and same type)
    @Bean(name = "bazz") public IInterface getInterfaceClass() { return new IInterfaceImpl();}
    @Bean(name = "bazz") public IInterfaceImpl IInterfaceImpl() { return new IInterfaceImpl();}

}
