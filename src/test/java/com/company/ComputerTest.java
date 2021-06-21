package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class ComputerTest {

    Computer c = new Computer();
    @Test
    public void ComputerSetNameTest() {
        c.setName("test");
        assertEquals(c.getName(),"test");
    }
    @Test
    public void ComputerSetCpusTest() {
        c.setCpus(2);
        assertEquals(c.getCpus(),2);
    }
    @Test
    public void ComputerSetHZTest() {
        c.setCpuHz(2111);
        assertEquals(c.getCpuHz(),2111);
    }
    @Test
    public void ComputerSetRamTest() {
        c.setRam(4096);
        assertEquals(c.getRam(),4096);
    }
    @Test
    public void ComputerSetMemTest() {
        c.setHDmemory(8096);
        assertEquals(c.getHDmemory(),8096);
    }



}
