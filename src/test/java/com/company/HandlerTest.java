package com.company;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HandlerTest {
    @Test
    public void HandlerInvokeTest() {
        Computer c2 = new Computer("c2",999,999,999,999);
        Device d = (Device) Proxy.newProxyInstance(c2.getClass().getClassLoader(), c2.getClass().getInterfaces(), new Handler(c2));
        assertEquals(d.getName(),"c2");
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    //@Test
    public void HandlerCantInvokeSeter() {
        Computer c2 = new Computer("c2",999,999,999,999);
        Device d = (Device) Proxy.newProxyInstance(c2.getClass().getClassLoader(), c2.getClass().getInterfaces(), new Handler(c2));
        d.setName("INVALID");

    }

}
