package com.qu1etboy.basic.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.add("Dog");
        animalShelter.add("Cat");
        animalShelter.add("Bird");

//        String result = animalShelter.search(animal -> animal.contains("C"));
        String result = animalShelter.search2(new AnimalFilterable() {
            @Override
            public boolean filter(String animal) {
                return animal.contains("C");
            }
        });

        System.out.println(result);

        forEach();
    }

    public static void filter() {
        List<Integer> numbers = List.of(1, -2, 3, -4, 5, -6, 7, -8, 9, -10);

        List<Integer> filteredNumber = numbers.stream().filter(n -> n > 0).toList();

        System.out.println(filteredNumber);
    }

    public static void sum() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // (a, b) -> a + b is equivalent to Integer::sum
        int sum = numbers.stream().reduce(0, Integer::sum);

        System.out.println(sum);
    }

    /**
     * Map each element in the list to a new value
     */
    public static void map() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).toList();

        System.out.println(squaredNumbers);
        System.out.println(numbers);
    }

    // Take function with 2 parameters and return an Integer
    public static void lambda(Function<Integer, Integer> f) {
        f.apply(5);
    }

    public static void forEach() {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);

        numbers.sort(Comparator.naturalOrder());
        numbers.forEach(System.out::println);
    }

    // Make it work, make it right, make it fast.
}
