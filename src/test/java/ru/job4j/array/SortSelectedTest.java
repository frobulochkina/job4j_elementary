package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {9, 6, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {6, 7, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf4elements() {
        int[] data = new int[] {9, 6, 7, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {6, 7, 9, 9};
        Assert.assertArrayEquals(expected, result);
    }
}