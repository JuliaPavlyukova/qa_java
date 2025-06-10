package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class FelineParamTest {
    private final int kittensCount;
    private final int expected;

    public FelineParamTest(int kittensCount, int expected) {
        this.kittensCount = kittensCount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCountData() {
        return new Object[][]{
                {1, 1},
                {2, 2},
                {3, 3},
        };
    }

    @Test
    public void testFelineParam() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        Assert.assertEquals(expected, actual);
    }
}
