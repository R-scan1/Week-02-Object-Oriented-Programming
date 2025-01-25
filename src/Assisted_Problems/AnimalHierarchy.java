package Assisted_Problems;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound!!!");
    }

    void displayDetails() {
        System.out.println("Animal Name is: " + name + "\nAnimal Age is: " + age);
    }
}

class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " Barks!!!\n");
    }

}

class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " Meows!!!\n");
    }


}

class Bird extends Animal {

    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " Chirps!!!\n");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Dog dog = new Dog("Universe Annihilator", 3);
        Cat cat = new Cat("Asteroid Destroyer", 2);
        Bird bird = new Bird("Suiiiii", 1);

        dog.displayDetails();
        dog.makeSound();
        cat.displayDetails();
        cat.makeSound();
        bird.displayDetails();
        bird.makeSound();

    }
}
