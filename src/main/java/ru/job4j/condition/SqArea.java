package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double h = p / 2 / (k + 1);
        double w = h * k;
        return w * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(9, 3);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}
