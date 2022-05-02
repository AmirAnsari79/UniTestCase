package Exercise_Test_5;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortTest {

    @Test
    public void testSortEmpty() {
        int[] input = {};
        int[] expected = {};
        Sort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortSingle() {
        int[] input = {12};
        int[] expected = {12};
        Sort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortDouble() {
        int[] input = {4, 0};
        int[] expected = {0, 4};
        Sort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortLong() {
        int[] input = {3, 6, 8, 7, 1, 5, 2, 4};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        Sort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortOdd() {
        int[] input = {3, 6, 8, 9, 7, 1, 5, 2, 4,};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Sort.sort(input);
        assertArrayEquals(expected, input);

    }

    @Test
    public void testSortCharOdd() {
        int[] input = {'3', '2', '4', '5'};
        int[] expected = {'2', '3', '4', '5'};
        Sort.sort(input);
        assertArrayEquals(expected, input);
    }


}

