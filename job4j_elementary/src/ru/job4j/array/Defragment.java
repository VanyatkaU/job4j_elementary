package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (index = point; point < array.length; point++) {
                    if (array[point] != null) {
                        array[index] = array[point];
                        array[point] = null;
                        break;
                    }
                }
            }
        }
    return array;
    }
}
