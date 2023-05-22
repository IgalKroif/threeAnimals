package myAnimals;

import animalInterfaces.Land;

public class Dog extends Animal implements Land {
    public String petName;
    protected int Mood;

    public Dog(boolean mammal, boolean carnivorous, int mood) {
        super(mammal, carnivorous, mood);
        this.mammal = mammal;
        this.carnivorous = carnivorous;
        this.Mood = mood;
    }

    public void animalSleeping() {
        if (isSleeping) {
            isSleeping();
        }
    }
    public void animalSleep() {
        setSleeping(true);
    }

    @Override
    public void getMood() {
        if (Mood == 0) {
            System.out.println("The dog is comfortable being touched: ~BARKS LOUDLY~");

        } else if (Mood == 1) {
            System.out.println("You've angered the dog: ~*MAKES A WHOOPING SOUND*~");
        }
    }

    @Override
    public void sayHello() {

        System.out.println("The animal greets you : ~WAGS HIS TAIL~");
        }

    @Override
    public String getName() {
        return petName;
    }

    @Override
    public void setName(String petName) {
        this.petName = petName;
    }

    @Override
    public int getNumOfLegs() {
        return 4;
    }
}