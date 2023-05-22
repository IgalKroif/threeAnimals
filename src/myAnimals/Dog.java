package myAnimals;

import animalHolder.Animal;
import animalInterfaces.Land;

/**
 * The class Dog represents a domestic dog.
 */
public class Dog extends Animal implements Land {
    public String petName;
    protected int Mood;

    /**
     * Constructs a Dog object with the specified properties.
     *
     * @param mammal      A boolean indicating if the dog is a mammal.
     * @param carnivorous A boolean indicating if the dog is carnivorous.
     * @param mood        The mood index of the dog.
     */
    public Dog(boolean mammal, boolean carnivorous, int mood) {
        super(mammal, carnivorous, mood);
        this.mammal = mammal;
        this.carnivorous = carnivorous;
        this.Mood = mood;
    }

    /**
     * Checks if the dog is sleeping and calls the isSleeping method.
     */
    public void animalSleeping() {
        if (isSleeping) {
            isSleeping();
        }
    }

    /**
     * Sets the sleeping status of the dog to true.
     */
    public void animalSleep() {
        setSleeping(true);
    }

    /**
     * Gets the mood of the dog and prints a corresponding message.
     */
    @Override
    public void getMood() {
        if (Mood == 0) {
            System.out.println("The dog is comfortable being touched: ~BARKS LOUDLY~");
        } else if (Mood == 1) {
            System.out.println("You've angered the dog: ~*MAKES A WHOOPING SOUND*~");
        }
    }

    @Override
    public void setMood(int mood) {
        if(mood == 0) {
            Mood = 0;

        }else if (mood == 1) {
            Mood = 1;
        }
    }

    /**
     * Makes the dog greet by wagging its tail.
     */
    @Override
    public void sayHello() {
        System.out.println("The animal greets you: ~WAGS HIS TAIL~");
    }

    /**
     * Gets the name of the dog.
     *
     * @return The name of the dog.
     */
    @Override
    public String getName() {
        return petName;
    }

    /**
     * Sets the name of the dog.
     *
     * @param petName The name to set for the dog.
     */
    @Override
    public void setName(String petName) {
        this.petName = petName;
    }

    /**
     * Gets the number of legs of the dog.
     *
     * @return The number of legs of the dog.
     */
    @Override
    public int getNumOfLegs() {
        return 4;
    }
}