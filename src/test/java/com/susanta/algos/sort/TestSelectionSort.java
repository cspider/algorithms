package com.susanta.algos.sort;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class TestSelectionSort {

    SelectionSort sorter = new SelectionSort();

    @Test public void testSelectionSortFirst() {
        Integer array[] = new Integer[]{100, 0, 11, 23, 98, 45, 23, 78} ;
        sorter.sort(array);
        Integer expectedArray[] = {0, 11, 23, 23, 45, 78, 98, 100} ;
        Assertions.assertArrayEquals(expectedArray, array) ;
    }

    @Test
    public void testSelectionSortTwoElements() {
        Integer array[] = {100, 0} ;
        sorter.sort(array);
        Integer expectedArray[] = {0, 100} ;
        Assertions.assertArrayEquals(expectedArray, array) ;
    }

    @Test
    public void testSelectionSortAlreadyOrdered() {
        Integer array[] = {0, 10, 20, 30, 40, 50} ;
        sorter.sort(array);
        Integer expectedArray[] = {0, 10, 20, 30, 40, 50} ;
        Assertions.assertArrayEquals(expectedArray, array) ;
    }

}
