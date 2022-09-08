package com.susanta.algos.search;

public class BinarySearchInt {

     public int findIndex(int[] list, int value) {
         int left = 0;
         int right = list.length - 1;
         return findIndex(list, left, right, value);
     }

     private int findIndex(int[] list , int left, int right, int value) {
         if(left > right){
             return -1;
         }
         int mid = (int) ((long)left + right) / 2;
         if (value == list[mid]) {
             return mid;
         } else if ( value > list[mid]) {
             return findIndex(list, mid + 1, right, value) ;
         } else if ( value < list[mid]){
             return findIndex(list, left, mid - 1, value) ;
         }
         return -1;
     }
}
