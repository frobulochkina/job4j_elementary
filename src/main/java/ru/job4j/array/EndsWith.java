package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int indexWord = word.length - post.length;
        for (int i = 0; i < post.length; i++, indexWord++) {
           if (post[i] != word[indexWord]) {
               result = false;
           }
        }
        return result;
    }
}
