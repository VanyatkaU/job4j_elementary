package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumMinusAndDiv(double first, double second) {
        return minus(first, second)
                + div(first, second);
    }

    public static double sumAllOp(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + div(first, second)
                + minus(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumMinusAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + sumAllOp(10, 20));
    }
}
