package com.company;

public class Laptop extends Computer {
    private double diag;
    private double weight;
    private double сapacity;

    public Laptop(String name, long cpuHz, int cpus, long ram, long HDmemory, double diag, double weight, double сapacity) {
        super(name, cpuHz, cpus, ram, HDmemory);
        this.diag = diag;
        this.weight = weight;
        this.сapacity = сapacity;
        System.out.println("laptop constructor + super()");

    }

    public Laptop(double diag, double weight, double сapacity) {
        this.diag = diag;
        this.weight = weight;
        this.сapacity = сapacity;
        System.out.println("laptop constructor");

    }
    @Override
    public Device createDevice() {
        return new Laptop();
    }
    public Laptop() {
        System.out.println("laptop empty constructor");
    }
    @MyAnnotation()
    public void setDiag(double diag) {
        this.diag = diag;
    }
    @MyAnnotation()
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCapacity(double сapacity) {
        this.сapacity = сapacity;
    }

    public double getDiag() {
        return diag;
    }

    public double getWeight() {
        return weight;
    }

    public double getCapacity() {
        return сapacity;
    }
    @MyAnnotation()
    public String toString() {
        return "Laptop{" +
                "diag=" + diag +
                ", weight=" + weight +
                ", сapacity=" + сapacity +
                '}';
    }
}
