package com.pb.riechin.hw6;

public class Animal {

    protected String food;
    protected String location;

    public void makeNoise() {
        System.out.println("Животное говорит.");
    };

    public void eat() {
        System.out.println("Животное кушает.");
    };

    public void sleep() {
        System.out.println("Животное спит.");
    };
}
