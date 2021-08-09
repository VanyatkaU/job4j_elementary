package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double rsl = Math.pow(x, 2);
        double rsl1 = Math.pow(y, 2);
        double summ = rsl + rsl1;
        double d = Math.sqrt(summ);
        return d;
    }

    public static void main(String[] args) {

        double result = Point.distance(3, 2, 5, 3);
        System.out.println("result (3, 2) to (5, 3) " + result);
    }
}