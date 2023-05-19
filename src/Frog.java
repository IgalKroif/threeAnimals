import threeAnimals.Land;
import threeAnimals.getWater;

public class Frog  extends  Animal implements Land, getWater {

    public int Mood;
    public  boolean isAmphibian;
    public Frog(boolean mammal, boolean carnivorous, int mood) {
        super(mammal, carnivorous, mood);
        this.mammal = false;
        this.carnivorous = false;
        this.Mood = mood;
        if (!mammal && !carnivorous) {
            this.isAmphibian = true;
        }else {
            this.isAmphibian = false;
            this.carnivorous = true;
            this.mammal = true;
        }
    }

    @Override
    public void getMood() {
        if (Mood == 0) {
            System.out.println("The Frog is is in a good Mood: ~Quack Quack~");

        } else if (Mood == 1) {
            System.out.println("You've scared the frog! : ~*Plops into the water*~");
        }
    }

    @Override
    public void sayHello() {
        System.out.println("The frog says nothing!");
    }

    public boolean isAmphibian() {
        return isAmphibian;
    }

    public void setAmphibian(boolean amphibian) {
        isAmphibian = amphibian;
    }

    @Override
    public int getNumOfLegs() {
        return 2;
    }

    @Override
    public boolean hasGills() {
        return true;
    }

    @Override
    public boolean doesLayEggs() {
        return true;
    }


}

