package com.company;

import com.company.Observer.MyObserver;
import com.company.controller.AbstractController;
import com.company.controller.AnotherController;
import com.company.controller.MainController;
import com.company.servises.AnotherService;
import com.company.servises.AnotherService2;
import com.company.servises.DevisesServise;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Computer c1 = new Computer();
//        Computer c2 = new Computer("c2",999,999,999,999);
//
//
//
//        ClassLoader classLoader = c1.getClass().getClassLoader();
//        Class<?>[] interfaces = c1.getClass().getInterfaces();
//        Handler invocationHandler = new Handler(c1);
//        Device d = (Device) Proxy.newProxyInstance(c2.getClass().getClassLoader(), c2.getClass().getInterfaces(), new Handler(c2));
//        try {
//            d.setName("hello");
//        } catch (Exception e) {
//            System.out.println("error");
//        }
//        System.out.println(c2.getName());
//        MyObserver observr = MyObserver.getInstance();

        String config = "maincontroller";
        AbstractController controller;
//        DevisesServise s = new DevisesServise(new AnotherService("target/test.txt"));
        DevisesServise s = new AnotherService2(new AnotherService("target/test.txt"));
        if (config == "maincontroller") {
            controller = new MainController(s);
        } else {
            controller = new AnotherController();
        }


        controller.menu();

    }


}

