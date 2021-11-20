package com.pb.riechin.hw8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Регистрация пользователя.");
        System.out.print("\nВведите логин: ");
        String login = in.nextLine();
        System.out.print("\nВведите пароль: ");
        String passwd = in.nextLine();
        System.out.print("\nВведите пароль еще раз: ");
        String confPswd = in.nextLine();

        Auth authorization = new Auth();
        try {
            authorization.signUp(login, passwd, confPswd);
        } catch (WrongLoginException ex) {
            System.out.println(ex.getMessage());
        } catch (WrongPasswordException ex) {
            System.out.println(ex.getMessage());
        }
        if (null != authorization.getLogin()) {
            System.out.println("Авторизация пользователя.");
            System.out.print("\nВведите логин: ");
            login = in.nextLine();
            System.out.print("\nВведите пароль: ");
            passwd = in.nextLine();
            try {
                authorization.signIn(login, passwd);
            } catch (WrongLoginException ex) {
                System.out.println(ex.getMessage());
            } catch (WrongPasswordException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}