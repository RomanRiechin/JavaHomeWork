package com.pb.riechin.hw6;

import java.lang.reflect.Constructor;

public class VetClinic {

    public static void main(String[] args) throws Exception {

        Animal[] patientsVC = new Animal[3];

        Cat leo = new Cat();
        leo.food = "мыши, колбаса";
        leo.location = "кресло";
        leo.setEarsPurity("чистые");

        Dog rex = new Dog();
        rex.food = "сахарные кости";
        rex.location = "диван";
        rex.setNeedsWalk(false);

        Horse pegas = new Horse();
        pegas.food = "сено, солома";
        pegas.location = "конюшня";
        pegas.setIsMounted(false);

        patientsVC[0] = rex;
        patientsVC[1] = leo;
        patientsVC[2] = pegas;

        for (int i = 0; i < patientsVC.length; i++) {

            Class vetClass = Class.forName("com.pb.riechin.hw6.Veterenarian");
            Constructor constr = vetClass.getConstructor(new Class[] {});

            Object obj = constr.newInstance();

            if (obj instanceof Veterenarian) {
                ((Veterenarian) obj).treatAnimal(patientsVC[i]);
            }
        }
    }
}