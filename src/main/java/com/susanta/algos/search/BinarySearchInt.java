package com.susanta.algos.search;

public class BinarySearchInt {

    public int findIndex(int[] list, int value) {
        return findIndex(list, 0, list.length - 1, value) ;
    }

    private int findIndex(int[] list, int left, int right, int value) {
        if (left > right) {
            return -1;
        }
        int mid = (int) ((long) left + right) / 2;
        if (value == list[mid]) {
            return mid;
        } else if (value > list[mid]) { // search in right half
            return findIndex(list, mid + 1, right, value);
        } else  { // search in left half
            return findIndex(list, left, mid - 1, value) ;
        }
    }

}
