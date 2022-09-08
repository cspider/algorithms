package com.susanta.algos.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchIntTest {
    private BinarySearchInt binarySearch = null;

    @BeforeEach
    void setup() {
        binarySearch = new BinarySearchInt();
    }

    @Test
    void testSearch1() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int itemToSearch = 6;

        int index = binarySearch.findIndex(list, itemToSearch);
        assertEquals(5, index, "Index does not match with expected values");
    }

    @Test
    void testSearch2() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 16, 58, 89};
        int itemToSearch = 27;

        int index = binarySearch.findIndex(list, itemToSearch);
        assertEquals(-1, index, "Index does not match with expected values");
    }

    @Test
    void testSearch3() {
        int[] list = new int[]{1};
        int itemToSearch = 1;

        int index = binarySearch.findIndex(list, itemToSearch);
        assertEquals(0, index, "Index does not match with expected values");
    }

    @Test
    void testSearch4() {
        int[] list = new int[]{1};
        int itemToSearch = 2;

        int index = binarySearch.findIndex(list, itemToSearch);
        assertEquals(-1, index, "Index does not match with expected values");
    }
}
