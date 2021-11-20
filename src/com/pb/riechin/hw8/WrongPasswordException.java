package com.pb.riechin.hw8;

public class WrongPasswordException extends  Exception{
    public WrongPasswordException() {
    }
    public WrongPasswordException(String str) {
        super(str);
    }
}