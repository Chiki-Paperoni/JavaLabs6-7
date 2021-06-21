package com.company.Observer;

import com.company.Device;

import java.util.ArrayList;
import java.util.List;

//OBSERVER + SINGLETON
public class MyObserver {
    private static MyObserver instance;
    private List<Device> subscribers = new ArrayList<Device>();

    private MyObserver() {

    }
    public static MyObserver getInstance() {
        if (instance == null) {
            instance = new MyObserver();
        }
        return instance;
    }

    public void subscribe(Device d) {
        this.subscribers.add(d);
    }
    public void unsubscribe(String name) {
        subscribers.stream().filter(d ->d.getName() != name );
    }
    public void allDown() {
        for (Device d: subscribers) {
            d.switchoff();
        }
    }
}
