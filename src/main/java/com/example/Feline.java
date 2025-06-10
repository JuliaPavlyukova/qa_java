package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        System.out.println(getFood("Хищник"));
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        System.out.println("getKittens from Feline");
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
