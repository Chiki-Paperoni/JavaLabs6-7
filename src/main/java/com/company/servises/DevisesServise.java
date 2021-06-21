package com.company.servises;

import com.company.Computer;
import com.company.Laptop;
import com.company.model.DevisesModel;

import java.util.List;

//DECORATOR
public class DevisesServise implements DBService {
    private final DevisesModel db = new DevisesModel();

    private DBService wrapper;

    public int saveComputer() {
        return db.addComputer();
    }
    public int saveLaptop() {
        return db.addLaptop();
    }
    public Computer findComputer(int id) {
        return db.getComputer(id);
    }
    public Laptop findLaptop(int id) {
        return db.getLaptop(id);
    }
    public List<Computer> getComputers() {
        return db.getComputers();
    }
    public List<Laptop> getLaptops() {
        return db.getLaptops();
    }

    public DevisesServise(DBService wrapper) {
        this.wrapper = wrapper;
    }
    public DevisesServise(){}
}
