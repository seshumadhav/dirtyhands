package com.smc.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class IBeanFactory implements FactoryBean<IBean> {

    private static int index = 0;


    @Override
    public IBean getObject() throws Exception {
        return new IBean("foo");
    }

    @Override
    public Class<?> getObjectType() {
        return IBean.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
