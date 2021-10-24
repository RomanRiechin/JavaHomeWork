package com.pb.riechin.hw3;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива, количество ячеек: ");
        int size = input.nextInt();
        int myArray[] = new int[size];
        System.out.println("Введите числа массива:");
        for (int i = 0; i < size; i++) {
            myArray[i] = input.nextInt();
        }
        System.out.print("Заполняем массив элементами:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + myArray[i]);
        }
        System.out.println();

        System.out.print("Сумма элементов массива: ");
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.print(sum);
        System.out.println();

        System.out.print("Количество элементов массива: ");
        int pluss = 0;
        int minuss = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                minuss++;
            } else {
                pluss++;
            }
        }
        System.out.println("отрицательных: " + minuss + ", положительных: " + pluss);

        System.out.print("Сортировка пузырьком: ");
        int tmp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i+1]) {
                    tmp = myArray[i];
                    myArray[i] = myArray[i+1];
                    myArray[i+1] = tmp;
                    sorted = false;
                }
            }
        }
        for (int anArray : myArray) {
            System.out.print(anArray + " ");
        }
    }
}

