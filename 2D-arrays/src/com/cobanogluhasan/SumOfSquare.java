package com.cobanogluhasan;

public class SumOfSquare {
    static int count = 0;

    public static int sumOfSquares(int number) {
        int newVal = (int) Math.sqrt(number);
        int remain = (int) (number - Math.pow(newVal, 2));
        count++;
        if (remain >= 1) sumOfSquares(remain);
        return count;
    }
}
