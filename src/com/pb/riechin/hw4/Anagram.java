package com.pb.riechin.hw4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Наберите первую фразу");
        String fr1 = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Наберите вторую фразу");
        String fr2 = scanner.nextLine();

        char[] nfr1 = fr1.toCharArray();
        char[] nfr2 = fr2.toCharArray();

        Arrays.sort(nfr1);
        Arrays.sort(nfr2);

        fr1 = new String(nfr1);
        fr2 = new String(nfr2);

        if (fr1.equals(fr2)){
            System.out.println("Анаграмма");
        }
        else System.out.println("Не анаграмма");
    }

}
