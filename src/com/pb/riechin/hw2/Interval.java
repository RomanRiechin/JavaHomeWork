package com.pb.riechin.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Введите число от 1 до 100");
        x = scan.nextInt();
        if (x > 0 || x < 100) {
            if (x <= 14) {
                System.out.print("число в диапозоне [0-14]");
            } else if (x >= 15 && x <= 35) {
                System.out.print("число в диапозоне [15-35]");
            } else if (x >= 36 && x <= 50) {
                System.out.print("число в диапозоне [36-50]");
            } else if (x >= 51 || x <= 100) {
                System.out.print("число в диапозоне [51-100]");
            }
        }
    }
}

