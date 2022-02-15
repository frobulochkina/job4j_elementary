package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int lenData = data.length;
        for (int i = 0; i < lenData; i++) {
            int min = MinDiapason.findMin(data, i, lenData - 1);
            int index = FindLoop.indexOf(data, min, i, lenData - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }
}
