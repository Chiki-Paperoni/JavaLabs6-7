package com.company.servises;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class AnotherService extends DevisesServise{
    private String name;
    public AnotherService(String name) {
        this.name = name;
    }
    public int saveComputer() {
        File file = new File(name);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write("NEW COMPUTER ADDED".getBytes(), 0, name.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("logged");
        return super.saveComputer();
    }
}
