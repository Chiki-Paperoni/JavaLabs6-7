package com.company.model;

import com.company.Computer;
import com.company.Laptop;

import java.util.ArrayList;
import java.util.List;

public class DevisesModel {
    private List<Computer> computers = new ArrayList<Computer>();
    private List<Laptop>  laptops = new ArrayList<Laptop>() ;


    public List<Computer> getComputers() {
        return computers;
    }
    public Computer getComputer(int id) {
        if (id >= computers.size()) return null;
        return computers.get(id);
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }
    public Laptop getLaptop(int id) {
        if (id >= laptops.size()) return null;
        return laptops.get(id);
    }
    public int addComputer() {
        computers.add(new Computer("Test",100,100,100,10));
        return computers.size();
    }
    public int addLaptop() {
        laptops.add(new Laptop(100,100,100));
        return laptops.size();
    }
    public DevisesModel() {
        laptops.add(new Laptop(100,100,100));
        computers.add(new Computer("c1",100,100,100,10));
        computers.add(new Computer("c2",110,110,110,10));
        computers.add(new Computer("c3",120,120,120,10));
        computers.add(new Computer("c4",130,130,130,10));


    }

}
