package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int len = array.length;
        for (int  i = 0; i < len / 2; i++) {
            int temp = array[i];
            array[i] = array[len - (i + 1)];
            array[len - (i + 1)] = temp;
        }
        return array;
    }
}
