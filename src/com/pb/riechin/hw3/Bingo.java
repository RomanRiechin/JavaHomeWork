package com.pb.riechin.hw3;

import java.util.Scanner;
import java.lang.Math;

public class Bingo {
        public static void main(String[] args) {
            int RandNum, RetNum, TeCount = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Угадай число от 0 до 100");
            System.out.println("Надоест играть, наберите число больше 100");
            RandNum = (int)Math.floor(Math.random() * 100);
            do {
                TeCount++;
                System.out.print("Введите число: ");
                RetNum = input.nextInt();
                if (RetNum > 100) {
                    break;
                } else if (RetNum > RandNum)
                    System.out.println("Загаданное число меньше.");
                else if (RetNum < RandNum) System.out.println("Загаданное число больше.");
                else System.out.println("Вы угадали!");
            } while (RetNum != RandNum);
            System.out.println("Количество попыток: " + TeCount);
        }
}
