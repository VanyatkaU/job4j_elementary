package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[1];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}
