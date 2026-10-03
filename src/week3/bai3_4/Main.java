package week3.bai3_4;

import week3.bai3_2.Animal;
import week3.bai3_2.Cat;
import week3.bai3_2.Dog;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.makeSound();
        } else {
            System.out.println("Đây không phải là Mèo!");
        }
    }
}