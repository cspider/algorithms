package com.ss.algos;

public class SelectionSort {

    private void swap(int[] array, int firstIndex, int secondIndex) {
        int tmp = array[firstIndex] ;
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp ;
    }

    private int indexOfMinimum(int array[], int startIndex ){
        int minValue = array[startIndex] ;
        int minIndex = startIndex ;

        for (int i = minIndex + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minIndex = i ;
                minValue = array[i];
            }
        }
        return minIndex ;
    }

    public void sort(int[] array) {
        int i ;
        for (int c = 0; c < array.length - 1; c++) {
            i = indexOfMinimum(array, c) ;
            swap(array, c, i) ;
        }
    }

    public static void main(String args[]) {
        int [] array = new int[] {3, 100, 2, 4, 6, 1} ;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        new SelectionSort().sort(array) ;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
