package com.pb.riechin.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Integer> taul = new NumBox<>(5);
        taul.add(0, 3);
        taul.add(1, 5);
        taul.add(2, 7);
        taul.add(3, 11);
        taul.add(4, 13);

        System.out.println("Первое число массива taul : " + taul.get(0));
        System.out.println("Максимальное число массива taul : " + taul.max());
        System.out.println("Сумма всех чисел массива taul : " + taul.sum());
        System.out.println("Среднее значение элементов массива taul : " + taul.average());
        System.out.println("Количество элементов массива taul : " + taul.length());
        System.out.println();

        NumBox<Float> taul1 = new NumBox<>(6);
        taul1.add(0, 23.1f);
        taul1.add(1, 17.6f);
        taul1.add(2, 11.3f);
        taul1.add(3, 14.1f);
        taul1.add(4, 1.4f);
        taul1.add(5, 21.7f);

        System.out.println(taul1.get(2));
        System.out.println(taul1.max());
        System.out.println(taul1.sum());
        System.out.println(taul1.average());
        System.out.println(taul1.length());
    }
}