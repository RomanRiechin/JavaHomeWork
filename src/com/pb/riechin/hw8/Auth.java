package com.pb.riechin.hw8;

import java.util.regex.Pattern;

public class Auth {
    private String login;
    private String password=null;

    public void signUp(String s, String login, String passwd) throws WrongLoginException, WrongPasswordException {
        if (!(Pattern.matches("[a-zA-Z0-9]+", login) && (login.length() > 4 && login.length() < 21)))
            throw new WrongLoginException("Введены недопустимые символы");
        if (!Pattern.matches("[a-zA-Z0-9_]+", passwd))
            throw new WrongPasswordException("Введены недопустимые символы");
        if (passwd.length() < 5)
            throw new WrongPasswordException("Введено менее 6 символов");
        this.login = login;
        this.password = passwd;
    }

    public void signIn(String login, String passwd) throws WrongLoginException, WrongPasswordException {
        if (!((this.login).equalsIgnoreCase(login))) throw new WrongLoginException("Такой логин не существует");
        if (!(this.password).equals(passwd)) throw new WrongPasswordException("Ошибочный пароль");
        System.out.println("you're welcome");
    }

    public String getLogin() {
        return login;
    }
}