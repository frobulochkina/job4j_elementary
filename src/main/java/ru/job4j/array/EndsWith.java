package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int lenWord = word.length;
        for (int i = post.length - 1; i >= 0; i--) {
            if (post[i] == word[lenWord - 1])
                lenWord--;
            else
                return false;
        }
        return result;
    }
}
