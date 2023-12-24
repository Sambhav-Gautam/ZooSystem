//Package of Amphibian.java
package org.Zoo;

/**
 * This class a type of animal amphibian which has two subtypes amphibianType1 and amphibianType2 .
 * Used to add, modify and remove the animal from the Zoo .
 */
public class Amphibian extends Animal implements AnimalInterface {

    /**
     * Constructs a new Amphibian object with the specified attributes.
     *
     * @param name        The name of the amphibian.
     * @param description A description of the amphibian.
     * @param type        The type or category of the amphibian.
     * @param Sound       The sound made by the amphibian.
     */
    public Amphibian(String name, String description, String type, String Sound) {
        super(name, description, type, Sound);
    }

    /**
     * Used toa add the animal in the Zoo.
     * @param animal Animal that needs to be Added in the Zoo.
     */

    @Override
    public void addAnimal(Animal animal) {
        Zoo.presentAnimals.add(animal);
        System.out.println("Added from Amphibian ...");
        System.out.println("Runtime polymorphism .....");
    }
    /**
     * Used toa modify the animal in the Zoo .
     * @param index where the animal is present in presentAnimals.
     * @param updatedAnimal Animal that needs to be modified in the Zoo.
     */
    @Override
    public void modifyAnimal(int index,Animal updatedAnimal){
        Zoo.presentAnimals.set(index,updatedAnimal);
        System.out.println("Modified from Amphibian....");
        System.out.println("Runtime Polymorphism");

    }
    /**
     * Used to remove an animal from the Zoo.
     * @param animal Animal that needs to be removed in the Zoo.
     */
    @Override
    public void removeAnimal(Animal animal){
        Zoo.presentAnimals.remove(animal);
        System.out.println("Removed from Amphibian");
        System.out.println("Runtime Polymorphism");
    }
}

/**
 * Subtype of the Amphibian class.
 */
class AmphibianType1 extends Amphibian{

    /**
     * Constructs a new Amphibian object with the specified attributes.
     *
     * @param name        The name of the amphibian.
     * @param description A description of the amphibian.
     * @param type        The type or category of the amphibian.
     * @param Sound       The sound made by the amphibian.
     */
    public AmphibianType1(String name, String description, String type, String Sound) {
        super(name, description, type, Sound);
    }
}

/**
 * Subtype of the Amphibian class.
 */
class AmphibianType2 extends Amphibian{

    /**
     * Constructs a new Amphibian object with the specified attributes.
     *
     * @param name        The name of the amphibian.
     * @param description A description of the amphibian.
     * @param type        The type or category of the amphibian.
     * @param Sound       The sound made by the amphibian.
     */
    public AmphibianType2(String name, String description, String type, String Sound) {
        super(name, description, type, Sound);
    }
}
