package com.qu1etboy.basic.algo.sort;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        System.out.println(quickSort.sort(List.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)));
    }

    public List<Integer> sort(List<Integer> items) {
        if (items.size() <= 1) {
            return items;
        }

        int pivot = findPivot(items);
        List<Integer> less = partition(items, i -> i < pivot);
        List<Integer> greater = partition(items, i -> i >= pivot);

        return Stream.of(sort(less), List.of(pivot), sort(greater)).flatMap(List::stream).toList();
    }

    /**
     * Find the pivot element
     * (Note: Better pivot selection can improve performance)
     *
     * @param items list of items
     * @return pivot element
     */
    private int findPivot(List<Integer> items) {
        return items.getFirst();
    }

    /**
     * Partition the list based on the filter
     *
     * @param items  list of items
     * @param filter filter to apply
     * @return partitioned list
     */
    private List<Integer> partition(List<Integer> items, Predicate<Integer> filter) {
        return items.subList(1, items.size()).stream().filter(filter).toList();
    }
}
