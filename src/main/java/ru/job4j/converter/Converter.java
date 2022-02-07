package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 65;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        in = 130;
        expected = 2;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("130 rubles are 2 dollars. Test result : " + passed);

    }
}