package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LaptopTest {
    Laptop l = new Laptop();
    @Test
    public void LaptopSetDiagTest() {
        l.setDiag(12);
        assertEquals(l.getDiag(),12);
    }
    @Test
    public void LaptopSetWeightTest() {
        l.setWeight(120);
        assertEquals(l.getWeight(),120);
    }
    @Test
    public void LaptopSetCapacityTest() {
        l.setCapacity(121);
        assertEquals(l.getCapacity(),121);
    }
}
