package com.company;

import com.company.controller.MainController;
import com.company.servises.DevisesServise;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MainControllerTest {
    DevisesServise s = mock(DevisesServise.class);
    MainController c = new MainController(s);
    int comps,lpts;

    @Test
    public void option1ShouldReturnSize() {
        when(s.getComputers()).thenReturn(new ArrayList<Computer>(3));
        assertEquals(c.executeOption(1),0);
    }
    @Test
    public void option2ShouldReturnSize() {
        when(s.getLaptops()).thenReturn(new ArrayList<Laptop>());
        assertEquals(c.executeOption(2),0);
    }
    @Test
    public void option3Test() {
        c.executeOption(3);
        verify(s,times(1)).saveComputer();
    }
    @Test
    public void option4Test() {
        c.executeOption(4);
        verify(s,times(1)).saveLaptop();
    }

}
