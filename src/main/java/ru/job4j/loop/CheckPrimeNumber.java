package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int     count = 0;
        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0) {
                count += 1;
            }
            if (count > 2) {
              prime = false;
              break;
            }
        }
        return prime;
    }
}
