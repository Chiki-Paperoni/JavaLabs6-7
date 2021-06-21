package com.company;

public interface Device {
    public void stratup();
    public void switchoff();
    public void showdata();

    void setName(String hello);
    public Device createDevice();
    String getName();
    boolean getStatus();
}
