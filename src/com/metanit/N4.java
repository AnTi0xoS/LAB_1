package com.metanit;

import java.util.Scanner;

public class N4 {
    public static String checkTimeOfTheYear(int m) {
        if ((m >= 1 && m <= 2) || m == 12 ) {
            return "Winter";
        } else if (m >= 3 && m <= 5) {
            return "Spring";
        } else if (m >= 6 && m <= 8) {
            return "Summer";
        } else if (m >= 9 && m <= 11) {
            return "Autumn";
        } else {
            return "Please, input the month number from 1 to 12";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the month number: ");
        int month = in.nextInt();
        System.out.println(checkTimeOfTheYear(month));
        in.close();
    }
}
