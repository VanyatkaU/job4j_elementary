package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && first > third) {
            result = first;
        } else {
            result = second;
        }
        if (third > second) {
            result = third;
        }
        return result;
    }
}
