// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TestAnimal {
    public static void main(String[] args) {
        Cat myCat = new Cat(true,true,1);
        myCat.getMood();
        System.out.println(myCat.isMammal());
        System.out.println(myCat.getNumOfLegs());
        myCat.setMammal(false);
        System.out.println(myCat.isMammal());
        myCat.sayHello(2);


        Dog myDog = new Dog(true,true,0);
        myDog.getMood();
        myDog.sayHello(3);
        System.out.println();
        System.out.println(myDog.isMammal());
        myDog.setMammal(false);
        System.out.println(myDog.isMammal());
        System.out.println();
        System.out.println(myDog.isCarnivorous());
        myDog.makeCarnivorous(false);
        System.out.println(myDog.isCarnivorous());

        Frog myFrog = new Frog(false,false,0);
        myFrog.getMood();
        System.out.println(myFrog.isAmphibian());

        //System.out.println("Do frogs have gills? " + myCat.doesLayEggs());
        //System.out.println("Do frogs lay eggs? " + myCat.hasGills());

    }
}