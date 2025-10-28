package zadania;

import java.util.Random;
import animals.*;


public class Zoo {

    public static void main(String[] args) {
        Animal[] animals = new Animal[100];
        Dog dog = new Dog();
        Snake snake = new Snake();
        Parrot parrot = new Parrot();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int r = rand.nextInt(3);
            if (r == 0) {
                animals[i] = dog;
            } else if (r == 1) {
                animals[i] = parrot;
            } else {
                animals[i] = snake;
            }
            System.out.println(animals[i].GetDescription());
            animals[i].MakeSound();
        }
        int legs = CountLegs(animals);
        System.out.println(legs);
    }

        static int CountLegs(Animal[] animals) {
            int l = 0;
            for (Animal animal : animals) {
                l += animal.legs;
            }
            return l;
        }

}
