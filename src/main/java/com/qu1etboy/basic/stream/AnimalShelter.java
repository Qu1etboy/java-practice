package com.qu1etboy.basic.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class AnimalShelter {
    private final List<String> animals;

    public AnimalShelter() {
        animals = new ArrayList<>();
    }

    public void add(String animal) {
        animals.add(animal);
    }

    public List<String> getAnimals() {
        return animals;
    }

    public String search(Function<String, Boolean> filter) {
        for (String animal : animals) {
            if (filter.apply(animal)) {
                return animal;
            }
        }
        return null;
    }

    public String search2(AnimalFilterable filterable) {
        for (String animal : animals) {
            if (filterable.filter(animal)) {
                return animal;
            }
        }
        return null;
    }
}
