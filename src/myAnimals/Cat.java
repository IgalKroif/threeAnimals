package myAnimals;

import animalInterfaces.Land;


//ONLY FOR FROG IMPLEMENTATION!
//    @Override
//    public boolean hasGills() {
//        return false;
//    }
//
//    @Override
//    public boolean doesLayEggs() {
//        return false;

//}

public class Cat extends Animal implements Land {
    public String petName;
    protected int Mood;
    public Cat(boolean mammal, boolean carnivorous, int Mood) {
        super(mammal, carnivorous, Mood);
        this.carnivorous = carnivorous;
        this.mammal = mammal;
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
            System.out.println("The cat is happy: ~Purrr Purr~");

        } else if (Mood == 1) {
            System.out.println("You've angered the cat: HISSSSSS!!!");
        }
    }

    @Override
    public void sayHello() {
        System.out.println("The animal greets you : ~MEOW~");
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










