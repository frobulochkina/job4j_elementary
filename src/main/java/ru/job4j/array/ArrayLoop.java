package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index * 2 + 3;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
