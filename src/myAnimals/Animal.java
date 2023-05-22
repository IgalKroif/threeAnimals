package myAnimals;

abstract class Animal {
    public boolean mammal;
    public boolean carnivorous;
    protected int mood;

    protected boolean isSleeping;

    public String isSleeping() {
        if (isSleeping) {
            return "zzzz...";
        }else {
            sayHello();
            return "The animal is wide awake";
        }
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    public Animal(boolean mammal, boolean carnivorous, int mood) {
        this.mammal = mammal;
        this.carnivorous = carnivorous;

        if (this.mood == AnimalMoods.GOOD_MOOD.getValue()) {
            this.mood = mood;

        } else if (this.mood == AnimalMoods.SCARED.getValue()) {
            this.mood = mood;

        }else {
            System.out.println("The 'mood' index is out of bounds > [1] OR < [0]");
        }

    }
    public boolean isMammal() {
        return mammal;
    }

    public void setMammal(boolean isAMammal) {
        this.mammal = isAMammal;
    }
    public boolean isCarnivorous() {
        return carnivorous;
    }
    public void makeCarnivorous(boolean isCarnivorous) {
        this.carnivorous = isCarnivorous;
    }

    public void sayHello(int helloTimes) {
        for (int numOfLoops = 0; numOfLoops <= helloTimes -1; numOfLoops++) {
            sayHello();
        }
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    @Override
    public String toString() {
        return "myAnimals.Animal{" +
                "mammal=" + mammal +
                ", carnivorous=" + carnivorous +
                ", mood=" + mood +
                '}';
    }

    public abstract void getMood();
    public abstract void sayHello();

    public abstract String getName();

    public abstract void setName(String petName);
}
