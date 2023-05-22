package animalHolder;

/**
 * The abstract class Animal represents an animal with properties such as mammal, carnivorous, and mood.
 */
public abstract class Animal {
    protected boolean mammal;
    protected boolean carnivorous;
    protected int mood;

    protected boolean isSleeping;

    /**
     * Returns the sleeping status of the animal.
     *
     * @return The sleeping status of the animal as a string.
     */
    public String isSleeping() {
        if (isSleeping) {
            return "zzzz...";
        } else {
            sayHello();
            return "The animal is wide awake";
        }
    }

    /**
     * Sets the sleeping status of the animal.
     *
     * @param sleeping The sleeping status of the animal.
     */
    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    /**
     * Constructs an Animal object with the specified properties.
     *
     * @param mammal      A boolean indicating if the animal is a mammal.
     * @param carnivorous A boolean indicating if the animal is carnivorous.
     * @param mood        The mood index of the animal.
     */
    public Animal(boolean mammal, boolean carnivorous, int mood) {
        this.mammal = mammal;
        this.carnivorous = carnivorous;

        if (this.mood == AnimalMoods.GOOD_MOOD.getValue()) {
            this.mood = mood;
        } else if (this.mood == AnimalMoods.SCARED.getValue()) {
            this.mood = mood;
        } else {
            System.out.println("The 'mood' index is out of bounds > [1] OR < [0]");
        }
    }
    /**
     * Checks if the animal is a mammal.
     *
     * @return true if the animal is a mammal, false otherwise.
     */
    public boolean isMammal() {
        return mammal;
    }

    /**
     * Sets the mammal status of the animal.
     *
     * @param isAMammal A boolean indicating if the animal is a mammal.
     */
    public void setMammal(boolean isAMammal) {
        this.mammal = isAMammal;
    }

    /**
     * Checks if the animal is carnivorous.
     *
     * @return true if the animal is carnivorous, false otherwise.
     */
    public boolean isCarnivorous() {
        return carnivorous;
    }

    /**
     * Sets the carnivorous status of the animal.
     *
     * @param isCarnivorous A boolean indicating if the animal is carnivorous.
     */
    public void makeCarnivorous(boolean isCarnivorous) {
        this.carnivorous = isCarnivorous;
    }

    /**
     * Greets the animal a specified number of times.
     *
     * @param helloTimes The number of times to greet the animal.
     */
    public void sayHello(int helloTimes) {
        for (int numOfLoops = 0; numOfLoops <= helloTimes - 1; numOfLoops++) {
            sayHello();
        }
    }

    /**
     * Returns a string representation of the Animal object.
     *
     * @return A string representation of the Animal object.
     */
    @Override
    public String toString() {
        return "animalHolder.Animal{" +
                "mammal=" + mammal +
                ", carnivorous=" + carnivorous +
                ", mood=" + mood +
                '}';
    }

    /**
     * Abstract method to get the mood of the animal.
     */
    public abstract void getMood();

    public abstract void setMood(int mood);

    /**
     * Abstract method to make the animal say hello.
     */
    public abstract void sayHello();

    /**
     * Abstract method to get the name of the animal.
     *
     * @return The name of the animal.
     */
    public abstract String getName();

    /**
     * Abstract method to set the name of the animal.
     *
     * @param petName The name to set for the animal.
     */
    public abstract void setName(String petName);
}