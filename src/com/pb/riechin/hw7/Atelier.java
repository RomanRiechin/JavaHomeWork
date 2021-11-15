package com.pb.riechin.hw7;

public class Atelier {
        public static void main(String[] args) {

        Clothes [] clothes = new Clothes[4];
        clothes[0] = new Tshirt(Size.S, 110, "Красный");
        clothes[1] = new Pants(Size.XXS, 85, "Оранжевый");
        clothes[2] = new Skirt(Size.M, 120, "Желтый");
        clothes[3] = new Tie(Size.L, 50, "Зеленый");

        dressMan(clothes);
        dressWomen(clothes);
    }

    public static void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда: ");
        for (Clothes c : clothes) {
            if (c instanceof ManClothes) {
                ((ManClothes) c).dressMan();
            }
        }
    }

    public static void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда: ");
        for (Clothes c : clothes) {
            if (c instanceof WomenClothes) {
                ((WomenClothes) c).dressWomen();
            }
        }
    }
}