package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < word.length; i++) {
            for (int j = i; j < post.length; j++) {
                if (word[word.length - 1 - i] != post[post.length - 1 - j]) {
                    result = false;
                } else {
                    break;
                }
            }
        }
        return result;
    }
}