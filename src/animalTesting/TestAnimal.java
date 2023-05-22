package animalTesting;

import myAnimals.Cat;
import myAnimals.Dog;
import myAnimals.Frog;

/**
 * The {@code TestAnimal} class is used to test the behavior and functionality of the animal classes.
 * It creates instances of {@link myAnimals.Cat}, {@link myAnimals.Dog}, and {@link myAnimals.Frog}
 * and invokes various methods to demonstrate their behavior.
 */
public class TestAnimal {

    /**
     * The main method is the entry point of the program.
     * It creates instances of animal classes, invokes methods, and prints the results.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        Cat myCat = new Cat(true, true, 1);
        myCat.getMood();
        System.out.println(myCat.isMammal());
        System.out.println(myCat.getNumOfLegs());
        myCat.setMammal(false);
        System.out.println(myCat.isMammal());
        myCat.sayHello(2);

        System.out.println();
        Dog myDog = new Dog(true, true, 0);
        myDog.getMood();
        myDog.sayHello(3);
        System.out.println();
        System.out.println(myDog.isMammal());
        myDog.setMammal(false);
        System.out.println(myDog.isMammal());
        System.out.println();
        System.out.println(myDog.isCarnivorous());
        myDog.makeCarnivorous(false);
        System.out.println(myDog.isCarnivorous());
        System.out.println();
        Frog myFrog = new Frog(false, false, 0);
        myFrog.getMood();
        System.out.println(myFrog.isAmphibian());
        System.out.println(myFrog);

        myFrog.setName("Ribbioti");
        System.out.println(myFrog.getName());
        System.out.println("Do frogs have gills? " + myFrog.doesLayEggs());
        System.out.println("Do frogs lay eggs? " + myFrog.hasGills());
        myFrog.setSleeping(true);
        System.out.println(myFrog.isSleeping());

        System.out.println();
        myCat.setMood(0);
        myCat.getMood();
        myCat.setMood(1);
        myCat.getMood();
        System.out.println();
        myDog.setMood(0);
        myDog.getMood();
        myDog.setMood(1);
        myDog.getMood();

        myFrog.setMood(0);
        myFrog.getMood();
        myFrog.setMood(1);
        myFrog.getMood();
    }
}