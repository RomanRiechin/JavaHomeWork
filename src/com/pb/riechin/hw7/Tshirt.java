package com.pb.riechin.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{

    public Tshirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одел футболку\nразмер: "
                + size.getDescription() + "(" + size.getEuroSize() + ")\n"
                + "стоимость: " + cost + "$\n"
                + "цвет: " + color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина примеряет футболку\nразмер: "
                + size.getDescription() + "(" + size.getEuroSize() + ")\n"
                + "стоимость: " + cost + "$\n"
                + "цвет: " + color);
    }
}