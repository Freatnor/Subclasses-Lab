package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Animal> animals = new ArrayList<>();

        Reptile bird = new Archosaur("Bird", false, true, true);
        Reptile tRex = new Archosaur("T Rex", true, true, true);
        Reptile croc = new Archosaur("Crocodile", false, false, false);
        Reptile seaTurtle = new Testudinata("Sea Turtle", true);
        Reptile slider = new Testudinata("Slider");

        Mammal wolf = new Carnivora("Wolf");
        Mammal cat = new Carnivora("Cat");
        Mammal horse = new Ungulate("Horse", 3);
        Mammal goat = new Ungulate("Goat");
        Mammal rhino = new Ungulate("Rhinoceros", 3);
        rhino.setEndangered(true);
        Ungulate whale = new Ungulate("Whale", 0);
        whale.setNumLegs(2);
        whale.setEndangered(true);
        whale.setHasHair(false);

        animals.add(bird);
        animals.add(tRex);
        animals.add(croc);
        animals.add(seaTurtle);
        animals.add(slider);
        animals.add(wolf);
        animals.add(cat);
        animals.add(horse);
        animals.add(goat);
        animals.add(rhino);
        animals.add(whale);

        for(Animal a : animals){
            System.out.println(a.toString());
            System.out.println();
        }

    }
}
