package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
    float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        float in1 = 140;
        float expected1 = 2.3333333f;
        float out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro or " + dollar + " dollar.");
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        System.out.println("140 rubles are 2.3333333 dollar. Test result : " + passed1);
    }
}