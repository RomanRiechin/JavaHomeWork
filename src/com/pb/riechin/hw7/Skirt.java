package com.pb.riechin.hw7;

public class Skirt extends Clothes implements WomenClothes {

    public Skirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина примеряет юбку\nразмер: "
                + size.getDescription() + "(" + size.getEuroSize() + ")\n"
                + "стоимость: " + cost + "$\n"
                + "цвет: " + color);
    }
}