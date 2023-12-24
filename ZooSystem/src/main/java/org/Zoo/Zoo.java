//Package for Zoo.java
package org.Zoo;
//Header Files Required
import java.util.ArrayList;
//Header Files Required

/**
 * This class contains all the animals and there are 6 default animals  hardcoded in the program .
 */

public class Zoo {
    public static  boolean oneTimeCall = false;

    public static ArrayList<Animal> presentAnimals = new ArrayList<>();
    public static void addZoo() {
        // Create instances of the specified classes and add them to the presentAnimals list.
        presentAnimals.add(new Lion("Simba", "A majestic lion with a golden mane, often seen napping in the shade of the savannah.", "Mammal", "Roars "));
        presentAnimals.add(new Chimpanzee("Coco", "A playful and intelligent chimpanzee who loves swinging through the trees and solving puzzles.", "Mammal", "Chatter"));
        presentAnimals.add(new KomodoDragon("KomodoDragon", "A fearsome Komodo dragon, the largest lizard species on Earth, known for its stealth and venomous bite.", "Reptile", "Hisses menacingly"));
        presentAnimals.add(new RattleSnake("Rattler", "A venomous rattlesnake with a distinctive rattling tail, a master of camouflage in the desert.", "Reptile", "W rattle"));
        presentAnimals.add(new AmericanBullFrog("Frog", "A bullfrog that resides by the pond, a skilled jumper, and a symphony conductor of the wetlands.", "Amphibian", "Riz"));
        presentAnimals.add(new TigerSalamander("Stripes", "A tiger salamander, marked by distinctive black and yellow stripes, renowned for its regenerative abilities.", "Amphibian", "Croak"));

    }


}
class Lion extends MammalType1 {
    Lion(String name, String description, String type, String sound) {
        super(name, description, type, sound);
    }

    @Override
    public void feed() {
        System.out.println("Feeding the lion: " + getName());
        System.out.println("Feeding in Zoo Class in Lion Class");
        System.out.println("Runtime PolyMorphism");
    }

    @Override
    public void read() {
        System.out.println("Reading to the lion: " + getName());
        System.out.println("Reading in Zoo Class in Lion Class");
        System.out.println("Runtime PolyMorphism");
    }
}

class Chimpanzee extends MammalType2 {
    Chimpanzee(String name, String description, String type, String sound) {
        super(name, description, type, sound);
    }

    @Override
    public void feed() {
        System.out.println("Feeding the chimpanzee: " + getName());
        System.out.println("Feeding in Zoo Class in Chimpanzee Class");
        System.out.println("Runtime PolyMorphism");
    }

    @Override
    public void read() {
        System.out.println("Reading to the chimpanzee: " + getName());
        System.out.println("Reading in Zoo Class in Chimpanzee Class");
        System.out.println("Runtime PolyMorphism");
    }
}

class KomodoDragon extends ReptileType1 {
    KomodoDragon(String name, String description, String type, String sound) {
        super(name, description, type, sound);
    }

    @Override
    public void feed() {
        System.out.println("Feeding the Komodo dragon: " + getName());
        System.out.println("Feeding in Zoo Class in KomodoDragon Class");
        System.out.println("Runtime PolyMorphism");
    }

    @Override
    public void read() {
        System.out.println("Reading to the Komodo dragon: " + getName());
        System.out.println("Reading in Zoo Class in KomodoDragon Class");
        System.out.println("Runtime PolyMorphism");
    }
}

class RattleSnake extends ReptileType2 {
    RattleSnake(String name, String description, String type, String sound) {
        super(name, description, type, sound);
    }

    @Override
    public void feed() {
        System.out.println("Feeding the rattlesnake: " + getName());
        System.out.println("Feeding in Zoo Class in RattleSnake Class");
        System.out.println("Runtime PolyMorphism");
    }

    @Override
    public void read() {
        System.out.println("Reading to the rattlesnake: " + getName());
        System.out.println("Reading in Zoo Class in RattleSnake Class");
        System.out.println("Runtime PolyMorphism");
    }
}

class AmericanBullFrog extends AmphibianType1 {
    AmericanBullFrog(String name, String description, String type, String sound) {
        super(name, description, type, sound);
    }

    @Override
    public void feed() {
        System.out.println("Feeding the bullfrog: " + getName());
        System.out.println("Feeding in Zoo Class in AmericanBullFrog Class");
        System.out.println("Runtime PolyMorphism");
    }

    @Override
    public void read() {
        System.out.println("Reading to the bullfrog: " + getName());
        System.out.println("Reading in Zoo Class in AmericanBullFrog Class");
        System.out.println("Runtime PolyMorphism");
    }
}

class TigerSalamander extends AmphibianType2 {
    TigerSalamander(String name, String description, String type, String sound) {
        super(name, description, type, sound);
    }

    @Override
    public void feed() {
        System.out.println("Feeding the tiger salamander: " + getName());
        System.out.println("Feeding in Zoo Class in TigerSalamander Class");
        System.out.println("Runtime PolyMorphism");
    }

    @Override
    public void read() {
        System.out.println("Reading to the tiger salamander: " + getName());
        System.out.println("Reading in Zoo Class in TigerSalamander Class");
        System.out.println("Runtime PolyMorphism");
    }
}
