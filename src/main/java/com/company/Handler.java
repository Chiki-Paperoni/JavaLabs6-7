package com.company;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler implements InvocationHandler {
    private Computer computer;
    public Handler(Computer computer) {
        this.computer = computer;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println(method.getName() + " invoked");
        if (method.getName().startsWith("set")) {
            throw new IllegalArgumentException();
        }
        return method.invoke(computer,args);
    }
}
