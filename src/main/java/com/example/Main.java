package com.example;

public class Main {
    public static void main(String[] args) throws Exception {
//        Lion lion = new Lion("Самец", new Feline() );
//        System.out.println(lion.doesHaveMane());
//        System.out.println(lion.getFood());
//        System.out.println(lion.getKittens());
//
//        //
//        Cat cat = new Cat(new Feline());
//        System.out.println("cat.getFood() "+ cat.getFood());
//        cat.predator.eatMeat();
//
//
//
//        Animal animal = new Animal();
//        System.out.println("Травоядное" + animal.getFood("Травоядное"));
//        System.out.println("Хищник" + animal.getFood("Хищник"));
//        System.out.println("чтото другое " +animal.getFood(""));

        LionAlex lionAlex = new LionAlex(new Feline());
        System.out.println("lionAlex.getFood() "+ lionAlex.getFood());
        System.out.println("lionAlex.getKittens() " + lionAlex.getKittens());
        System.out.println("lionAlex.getFriends() " +lionAlex.getFriends());
        System.out.println("lionAlex.getPlaceOfLiving() " +lionAlex.getPlaceOfLiving());
        System.out.println("lionAlex.doesHaveMane() " + lionAlex.doesHaveMane());


    }
}
