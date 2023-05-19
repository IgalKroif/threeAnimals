import animalInterfaces.Land;
import animalInterfaces.getWater;

public class Frog  extends  Animal implements Land, getWater {
    public String petName;
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

    @Override
    public String getName() {
        if (petName == null) {
            System.out.println("Pet have yet to receive a name!");
            return null;
        }
        return petName;
    }

    @Override
    public void setName(String petName) {

        this.petName = petName;
    }


}

