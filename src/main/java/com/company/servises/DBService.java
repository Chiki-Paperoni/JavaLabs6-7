package com.company.servises;

import com.company.Computer;
import com.company.Laptop;

import java.util.List;

public interface DBService {
    public int saveComputer();
    public int saveLaptop();
    public Computer findComputer(int id);
    public Laptop findLaptop(int id);
    public List<Computer> getComputers();
    public List<Laptop> getLaptops();
}
