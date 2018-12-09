package com.ss.algos;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestSelectionSort {


    @Test
    public void testSelectionSortFirst() {

        int array[] = new int[]{100, 0, 11, 23, 98, 45, 23, 78} ;
        new SelectionSort().sort(array);

        int expectedArray[] = {0, 11, 23, 23, 45, 78, 98, 100} ;
        Assertions.assertArrayEquals(expectedArray, array) ;
    }

    @Test
    public void testSelectionSortTwoElements() {

        int array[] = new int[]{100, 0, } ;
        new SelectionSort().sort(array);

        int expectedArray[] = {0, 100} ;
        Assertions.assertArrayEquals(expectedArray, array) ;
    }

}
