package com.pb.riechin.hw6;

import java.util.Objects;

public class Cat extends Animal {

    private String earsPurity;
    public String getEarsPurity() {
        return this.earsPurity;
    }
    public void setEarsPurity(String earsPurityarsPurity) {
        this.earsPurity = earsPurity;
    }
    @Override
    public void eat() {
        System.out.println("Кот жрет");
    };
    @Override
    public void makeNoise() {
        System.out.println("Кот орет");
    };
    @Override
    public String toString() {
        return "Кот (питается: " + food + "; живет: " + location + "; состояние ушей: " + earsPurity + ")";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        };
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cat cat = (Cat) o;
        return (Objects.equals(food, cat.food) & Objects.equals(location, cat.location) & Objects.equals(earsPurity, cat.earsPurity));
    }
    @Override
    public int hashCode() {
        return Objects.hash(food, location, earsPurity);
    }
}
