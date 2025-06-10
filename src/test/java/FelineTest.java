package com.example;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    //  private Feline feline;

    @Mock
    private Feline feline;

    @Before
    public void setUp() throws Exception {
        feline = new Feline();
    }


    @Test
    public void testFelineEatMeat() throws Exception {
        List<String> list = feline.eatMeat();
        System.out.println("list.size() " + list.toString());
        Assert.assertEquals(3, list.size());
    }

    @Test
    public void testFelineGetFamily() throws Exception {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testFelineGetKittens() throws Exception {
        Assert.assertEquals(1, feline.getKittens());
    }
}
