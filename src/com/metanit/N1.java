package com.metanit;

import java.util.Scanner;

public class N1 {
    public static int minNumber(int num1, int num2, int num3, int num4) {
        if (num1 < num2 && num1 < num3 && num1 < num4) {
            return num1;
        } else if (num2 < num1 && num2 < num3 && num2 < num4) {
            return num2;
        } else if (num3 < num1 && num3 < num2 && num3 < num4) {
            return num3;
        } else {
            return num4;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
        System.out.println(minNumber(num1, num2, num3, num4));
        in.close();
    }
}
