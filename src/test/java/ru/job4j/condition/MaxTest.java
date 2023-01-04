package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void firstMax() {
        int first = 2;
        int second = 1;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void secondMax() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void firstEquallySecond() {
        int first = 2;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void thirdMax() {
        int first = 0;
        int second = 2;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void fourthdMax() {
        int first = 0;
        int second = -1;
        int third = 2;
        int fourth = 3;
        int result = Max.max(first, second, third, fourth);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }
}
