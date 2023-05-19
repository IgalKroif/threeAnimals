import threeAnimals.Land;


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
    public int Mood;
    Animal isSleeping;
    public Cat(boolean mammal, boolean carnivorous, int Mood) {
        super(mammal, carnivorous, Mood);
        this.carnivorous = carnivorous;
        this.mammal = mammal;
        this.Mood = mood;

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
    public int getNumOfLegs() {
        return 4;
    }
}










