package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            int in = array[i];
            if (min > in) {
                min = in;
            }
        }
        return min;
    }
}
