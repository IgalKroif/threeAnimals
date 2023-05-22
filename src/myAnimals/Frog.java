package myAnimals;

import animalHolder.Animal;
import animalInterfaces.Land;
import animalInterfaces.getWater;

/**
 * The class Frog represents a frog that is an animal living both on land and in water.
 */
public class Frog extends Animal implements Land, getWater {
    public String petName;
    protected int Mood;
    public boolean isAmphibian;

    /**
     * Constructs a Frog object with the specified properties.
     *
     * @param mammal      A boolean indicating if the frog is a mammal.
     * @param carnivorous A boolean indicating if the frog is carnivorous.
     * @param mood        The mood index of the frog.
     */
    public Frog(boolean mammal, boolean carnivorous, int mood) {
        super(mammal, carnivorous, mood);
        this.mammal = false;
        this.carnivorous = false;
        this.Mood = mood;
        if (!mammal && !carnivorous) {
            this.isAmphibian = true;
        } else {
            this.isAmphibian = false;
            this.carnivorous = true;
            this.mammal = true;
        }
    }

    /**
     * Checks if the frog is sleeping and calls the isSleeping method.
     */
    public void animalSleeping() {
        if (isSleeping) {
            isSleeping();
        }
    }

    /**
     * Sets the sleeping status of the frog to true.
     */
    public void animalSleep() {
        setSleeping(true);
    }

    /**
     * Gets the mood of the frog and prints a corresponding message.
     */
    @Override
    public void getMood() {
        if (Mood == 0) {
            System.out.println("The Frog is in a good Mood: ~Quack Quack~");
        } else if (Mood == 1) {
            System.out.println("You've scared the frog! : ~*Plops into the water*~");
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
     * Makes the frog say nothing.
     */
    @Override
    public void sayHello() {
        System.out.println("The frog says nothing!");
    }

    /**
     * Checks if the frog is an amphibian.
     *
     * @return true if the frog is an amphibian, false otherwise.
     */
    public boolean isAmphibian() {
        return isAmphibian;
    }

    /**
     * Sets the amphibian status of the frog.
     *
     * @param amphibian A boolean indicating if the frog is an amphibian.
     */
    public void setAmphibian(boolean amphibian) {
        isAmphibian = amphibian;
    }

    /**
     * Gets the number of legs of the frog.
     *
     * @return The number of legs of the frog.
     */
    @Override
    public int getNumOfLegs() {
        return 2;
    }

    /**
     * Checks if the frog has gills.
     *
     * @return true if the frog has gills, false otherwise.
     */
    @Override
    public boolean hasGills() {
        return true;
    }

    /**
     * Checks if the frog lays eggs.
     *
     * @return true if the frog lays eggs, false otherwise.
     */
    @Override
    public boolean doesLayEggs() {
        return true;
    }

    /**
     * Gets the name of the frog.
     *
     * @return The name of the frog.
     */
    @Override
    public String getName() {
        if (petName == null) {
            System.out.println("Pet has yet to receive a name!");
            return null;
        }
        return petName;
    }

    /**
     * Sets the name of the frog.
     *
     * @param petName The name to set for the frog.
     */
    @Override
    public void setName(String petName) {
        this.petName = petName;
    }
}