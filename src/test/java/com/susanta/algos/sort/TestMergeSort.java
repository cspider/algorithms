package com.susanta.algos.sort;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMergeSort {

    MergeSort mergeSort = new MergeSort() ;
/*
    @BeforeAll
    void setup() {
        mergeSort = new MergeSort();
    }
*/
    @Test
    void testMergeSort1() {
         int[] array = {10, 5, 2, 7, 4, 9, 12, 1, 8, 6, 11, 3};
         mergeSort.sort(array); ;
         int[] expected = {1,2,3, 4, 5, 6, 7, 8, 9, 10, 11, 12} ;

         assertEquals(true,
                 Arrays.equals(expected, array),
                 "Arrays should have been equals");
     }
    @Test
    void testMergeSort2() {
        int[] array = {10, 5, 2};
        mergeSort.sort(array); ;
        int[] expected = {2, 5, 10} ;

        assertEquals(true,
                Arrays.equals(expected, array),
                "Arrays should have been equals");
    }

}
