package com.company.servises;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class AnotherService2 extends DevisesServise{
    public AnotherService2(DevisesServise s) {
        super(s);
    }
    public int saveComputer() {
        File file = new File("target/test2");
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write("NEW COMPUTER ADDED22".getBytes(), 0,"target/test2.txt".length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("logged");
        return super.saveComputer();
    }
}
