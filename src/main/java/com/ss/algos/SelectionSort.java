package com.ss.algos;

import java.util.concurrent.ConcurrentMap;

public class  SelectionSort {

    /* package-private to be test eliginble */
    <T extends Comparable> void swap(T[] array, int firstIndex, int secondIndex) {
        T tmp = array[firstIndex] ;
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp ;
    }

    private <T extends Comparable> int indexOfMinimum(T array[], int startIndex ){
        T minValue = array[startIndex] ;
        int minIndex = startIndex ;

        for (int i = minIndex + 1; i < array.length; i++) {
            if (array[i].compareTo(minValue) < 0) {
                minIndex = i ;
                minValue = array[i];
            }
        }
        return minIndex ;
    }

    public void sort(Integer[] array) {
        int i ;
        for (int c = 0; c < array.length - 1; c++) {
            i = indexOfMinimum(array, c) ;
            swap(array, c, i) ;
        }
    }
}
