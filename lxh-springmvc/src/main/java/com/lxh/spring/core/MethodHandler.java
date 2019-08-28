package com.lxh.spring.core;

import java.lang.reflect.Method;
import java.util.List;

import lombok.Data;

@Data
public class MethodHandler {

    //方法所在的类
    private Object object;

    private Method method;
    //参数顺序
    private List<String> params;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }
}