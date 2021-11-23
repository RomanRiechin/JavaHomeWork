package com.pb.riechin.hw9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileNumbers {

    public static void createNumbersFile() throws Exception{

        try (PrintWriter out = new PrintWriter(new FileWriter("numbers.txt")); ) {
            for (int i = 0; i < 99; i++) {
                out.print(1 + (int)(Math.random() * 100) + " ");
                if (i % 10 == 0)
                    out.println();
            }
        } catch (IOException x) { System.out.println("IO error: " + x); }
    }

    public static void createOddNumbersFile() throws IOException {

        try (Scanner in = new Scanner(new File("numbers.txt"));
             PrintWriter out = new PrintWriter(new FileWriter("odd_number.txt"));) {
             System.out.println("Четные числа будут заменены на '0':");
            while (in.hasNextLine()) {
                Scanner line = new Scanner(in.nextLine());
                while (line.hasNextInt()) {
                    int data = line.nextInt();
                    if (data % 2 == 0) {
                        System.out.format("%d -> 0, ", data);
                        data = 0;
                   } else
                       System.out.print(data + ", ");
                       out.print(data + ", ");
                }
                line.close();
                out.println();
                System.out.println();
            }
        } catch (IOException x) { System.out.println("IO error: " + x); }
    }

    public static void main(String[] args) throws Exception {
        createNumbersFile();
        createOddNumbersFile();
    }
}
