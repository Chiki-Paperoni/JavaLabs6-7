package com.company;

public class Computer implements Device {
    private String name;
    private boolean isOn = true;
    private long cpuHz;
    private int cpus;
    private long ram;
    private long HDmemory;

    public String getName() {
        return name;
    }

    @Override
    public boolean getStatus() {
        return this.isOn;
    }

    public long getCpuHz() {
        return cpuHz;
    }

    public int getCpus() {
        return cpus;
    }

    public long getRam() {
        return ram;
    }

    public long getHDmemory() {
        return HDmemory;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Device createDevice() {
        return new Computer();
    }

    public void setCpuHz(long cpuHz) {
        this.cpuHz = cpuHz;
    }

    public void setCpus(int cpus) {
        this.cpus = cpus;
    }

    public void setRam(long ram) {
        this.ram = ram;
    }

    public void setHDmemory(long HDmemory) {
        this.HDmemory = HDmemory;
    }

    public Computer(String name, long cpuHz, int cpus, long ram, long HDmemory) {
        this.name = name;
        this.cpuHz = cpuHz;
        this.cpus = cpus;
        this.ram = ram;
        this.HDmemory = HDmemory;
        System.out.println("computer constructor");

    }

    public Computer() {
        System.out.println("computer empty constructor");

    }
    @MyAnnotation()
    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", cpuHz=" + cpuHz +
                ", cpus=" + cpus +
                ", ram=" + ram +
                ", HDmemory=" + HDmemory +
                '}';
    }

    @Override
    public void stratup() {
        this.isOn = true;
    }

    @Override
    public void switchoff() {
        this.isOn = false;
    }

    @Override
    public void showdata() {

    }
}
