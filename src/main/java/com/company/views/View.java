package com.company.views;

import com.company.Computer;
import com.company.Laptop;

import java.util.List;

public class View {
    public void showComputers(List<Computer> c) {
        System.out.println("-------------COMPUTERS---------------");
       for(Computer comp : c) {
           System.out.println("Number of cpus:" + comp.getCpus());
           System.out.println("Cpu frequency:" + comp.getCpuHz());
           System.out.println("Name:" + comp.getName());
           System.out.println("Memory:" + comp.getHDmemory());
           System.out.println("Ram:" + comp.getRam());
           System.out.println("Status:" + comp.getStatus());
           System.out.println("-------------------------------------");
       }
        System.out.println("-------------------------------------");
    }
    public void showLaptops(List<Laptop> l) {
        System.out.println("-------------Laptops---------------");
        for(Laptop lpt : l) {
            System.out.println("Number of cpus:" + lpt.getCpus());
            System.out.println("Cpu frequency:" + lpt.getCpuHz());
            System.out.println("Name:" + lpt.getName());
            System.out.println("Memory:" + lpt.getHDmemory());
            System.out.println("Ram:" + lpt.getRam());
            System.out.println("Battery capacity:" + lpt.getCapacity());
            System.out.println("Diagonal:" + lpt.getDiag());
            System.out.println("Weight:" + lpt.getCapacity());
            System.out.println("Status:" + lpt.getStatus());
        }
        System.out.println("-------------------------------------");
    }
}
