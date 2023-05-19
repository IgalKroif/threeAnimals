enum Mood {

    GOOD_MOOD(0),
    SCARED(1);


    public int value;

    Mood(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int setValue(int value) {
        this.value = value;
        return value;
    }

}
abstract class Animal {
    public boolean mammal;
    public boolean carnivorous;
    public int mood;

    public boolean isSleeping;

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

        if (this.mood == Mood.GOOD_MOOD.getValue()) {
            this.mood = mood;

        } else if (this.mood == Mood.SCARED.getValue()) {
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
        return "Animal{" +
                "mammal=" + mammal +
                ", carnivorous=" + carnivorous +
                ", mood=" + mood +
                '}';
    }

    public abstract void getMood();
    public abstract void sayHello();
}
