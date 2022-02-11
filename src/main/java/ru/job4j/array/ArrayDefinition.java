package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        names[0] = "Squidward";
        names[1] = "Garry";
        names[2] = "Spanch Bob";
        names[3] = "Patrick";
        for (String name : names) {
            System.out.println(name);
        }
    }
}
