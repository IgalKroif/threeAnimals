package myAnimals;

import animalHolder.Animal;
import animalInterfaces.Land;

/**
 * The class Cat represents a domestic cat.
 */
public class Cat extends Animal implements Land {
    public String petName;
    protected int Mood;

    /**
     * Constructs a Cat object with the specified properties.
     *
     * @param mammal      A boolean indicating if the cat is a mammal.
     * @param carnivorous A boolean indicating if the cat is carnivorous.
     * @param mood        The mood index of the cat.
     */
    public Cat(boolean mammal, boolean carnivorous, int mood) {
        super(mammal, carnivorous, mood);
        this.carnivorous = carnivorous;
        this.mammal = mammal;
        this.Mood = mood;
    }

    /**
     * Checks if the cat is sleeping and calls the isSleeping method.
     */
    public void animalSleeping() {
        if (isSleeping) {
            isSleeping();
        }
    }

    /**
     * Sets the sleeping status of the cat to true.
     */
    public void animalSleep() {
        setSleeping(true);
    }

    /**
     * Gets the mood of the cat and prints a corresponding message.
     */
    @Override
    public void getMood() {
        if (Mood == 0) {
            System.out.println("The cat is happy: ~Purrr Purr~");
        } else if (Mood == 1) {
            System.out.println("You've angered the cat: HISSSSSS!!!");
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
     * Makes the cat greet by saying "MEOW".
     */
    @Override
    public void sayHello() {
        System.out.println("The animal greets you: ~MEOW~");
    }

    /**
     * Gets the name of the cat.
     *
     * @return The name of the cat.
     */
    @Override
    public String getName() {
        return petName;
    }

    /**
     * Sets the name of the cat.
     *
     * @param petName The name to set for the cat.
     */
    @Override
    public void setName(String petName) {
        this.petName = petName;
    }

    /**
     * Gets the number of legs of the cat.
     *
     * @return The number of legs of the cat.
     */
    @Override
    public int getNumOfLegs() {
        return 4;
    }
}