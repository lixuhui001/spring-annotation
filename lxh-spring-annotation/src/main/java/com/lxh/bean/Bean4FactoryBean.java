package com.lxh.bean;

import org.springframework.beans.factory.FactoryBean;

//����һ��Spring�����FactoryBean
public class Bean4FactoryBean implements FactoryBean<Bean04> {

    //����һ��Color��������������ӵ�������
    @Override
    public Bean04 getObject() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("Bean04�ѱ���ӵ�������");
        return new Bean04();
    }

    @Override
    public Class<?> getObjectType() {
        // TODO Auto-generated method stub
        return Bean04.class;
    }

    //�Ƿ���
    @Override
    public boolean isSingleton() {
        // TODO Auto-generated method stub
        return false;
    }

}
