package com.susanta.algos.sort;

public class MergeSort {
    void sort(int[] array) {
        int leftStart = 0, rightEnd = array.length - 1;
        mergeSort(array, new int[array.length], leftStart, rightEnd);
    }

    void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd) {
        if(leftStart >= rightEnd) {
            return;
        }
        int mid = (leftStart + rightEnd)/2;
        mergeSort(array, temp, leftStart, mid);
        mergeSort(array, temp, mid+1, rightEnd);
        mergeHalves(array, temp, leftStart, rightEnd);
    }

    void mergeHalves(int[] array, int[]temp, int leftStart, int rightEnd) {
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int index = leftStart;
        int left = leftStart;
        int right = rightStart;
        int size = rightEnd - leftStart + 1;

        while( left <= leftEnd && right <= rightEnd) {
            if(array[left] <= array[right]) {
                temp[index] = array[left];
                left++ ;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }
        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);

    }
}
