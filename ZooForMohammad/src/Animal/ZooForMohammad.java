/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Animal;

/**
 *
 * @author carroll
 */
public class ZooForMohammad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create lion and others animals + 
        Animal lion = new Lion("lee-BAX", 5);
        Animal elephant = new Elephant("mah-ROO-di", 10);
        Animal monkey = new Monkey("dah-NYEER", 3);

        // MORPHISM
        // HERE I AM USING POLYMORPHISME
        Animal[] animals = {lion, elephant, monkey};
        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
        }

        // OVERLOADED HERE
        System.out.println("\noVERLOADED METHOD HERE:");
        lion.makeSound(3);
        elephant.eat("fruits");
        monkey.makeSound(2);
    }
}

// DISPLAYING HERE
class Animal {
    // MY VARIABLES
    protected String name;
    protected int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ANIMAL'S SOUND HERE
    public void makeSound() {
        System.out.println("Animal sound");
    }
// ANIMAL'S EAT
    public void eat() {
        System.out.println("Animal eating");
    }

    // SOUND AGAIN
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    public void eat(String foodType) {
        System.out.println("Animal eating " + foodType);
    }
}

// Here is lion
class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("I.Lion:");
        System.out.println("Roar");
    }

    @Override
    public void eat() {
        System.out.println("Eating meat");
    }
}

// Here is Elephant
class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("II.Elephant:");
        System.out.println("Trumpet");
    }

    @Override
    public void eat() {
        System.out.println("Eating grass");
    }
}

// Here is For monkey
class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("III.Monkey:");
        System.out.println("Chatter");
    }

    @Override
    public void eat() {
        System.out.println("Eating bananas");
    }
}

