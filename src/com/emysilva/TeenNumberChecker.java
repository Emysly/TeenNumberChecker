package com.emysilva;

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(17, 67, 56));
    }
    public static boolean hasTeen(int num1, int num2, int num3) {
        if(num1 > 12 && num1 < 20 || num1 > 12 && num1 < 20 || num1 > 12 && num1 < 20)
            return true;
        return false;
    }
}
