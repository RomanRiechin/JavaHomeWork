package com.pb.riechin.hw6;

public class Veterenarian {

    String veterinarian="Ветеринар Коновалов А.Д.";
    public void treatAnimal(Animal animal){
        String string=animal.toString();
        System.out.println(veterinarian +" принимает питомца " + string+".");
    }
}