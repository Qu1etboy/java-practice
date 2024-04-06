package com.qu1etboy.basic.algo.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class QuickSortTest {

    private QuickSort quickSort = new QuickSort();

    @Before
    public void setUp() {
        quickSort = new QuickSort();
    }

    @Test
    public void testSort() {
        List<Integer> arr = List.of(3, 2, 1, 5, 4);

        assertEquals(List.of(1, 2, 3, 4, 5), quickSort.sort(arr));
    }

    @Test
    public void testSortWithDuplicate() {
        List<Integer> arr = List.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);

        assertEquals(List.of(1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9), quickSort.sort(arr));
    }
}