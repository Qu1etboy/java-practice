package com.qu1etboy.basic.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        Pig pig = new Pig();
        Bear bear = new Bear();

        animals.add(pig);
        animals.add(bear);

        for (Animal animal : animals) {
            animal.eat();
        }
    }
}
