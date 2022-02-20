package main;


import animal.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Fish fish1 = new Fish();
        Fish fish2 = new Fish();
        Bird bird1 = new Bird();
        Bird bird2 = new Bird();
        ArrayList<CanRun> animalsRun = new ArrayList<>();
        animalsRun.add(dog1);
        animalsRun.add(cat1);
        animalsRun.add(bird1);
        animalsRun.add(bird2);
        for (CanRun animalRun : animalsRun) {
            animalRun.run();
        }

    }
}
