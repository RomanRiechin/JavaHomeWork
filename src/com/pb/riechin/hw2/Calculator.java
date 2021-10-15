package com.pb.riechin.hw2;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = nextInt();
        int operand2 = nextInt();
        char operation = getOperation();
        int result = calc(operand1,operand2,operation);
        System.out.println("Результат вычисления: "+result);
    }

    public static int nextInt(){
        System.out.println("Введите число:");
        int operand;
        if(scanner.hasNextInt()){
            operand = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не число.");
            scanner.next();
            operand = nextInt();
        }
        return operand;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы выбрали не операцию.");
            scanner.next();
            operation = getOperation();
        }

        return operation;
    }

    public static int calc(int operand1, int operand2, char operation){
        int result = 0;
        switch (operation){
            case '+':
                result = operand1+operand2;
                break;
            case '-':
                result = operand1-operand2;
                break;
            case '*':
                result = operand1*operand2;
                break;
            case '/':
                if (operand2 == 0) System.out.print("На 0 делить нельзя");
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(operand1, operand2, getOperation());
        }
        return result;
    }
}