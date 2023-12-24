//Package for Animal.java
package org.Zoo;

//Header File Required
import java.util.Objects;
import java.util.Scanner;
//Header File Required

public  class Animal implements AnimalInterface {
    private String name;
    private String description;
    private String type;
    private String Sound;

    public Animal(String name, String description, String type,String Sound) {
        this.name = name;
        this.description =  description;
        this.type = type;
        this.Sound = Sound;
    }
    public static void viewAnimalInVisitor(){
        String border = "+---------------------------+";
        if(Zoo.presentAnimals.size()==0) System.out.println("No animals are present .....");
        else{
            int i =1;
            System.out.println(border);
            for(Animal animal: Zoo.presentAnimals){
                System.out.println(i+". Animal Name ::"+animal.getName());
                i++;
            }
        }
    }

    public static void viewAnimal(){
        String border = "+---------------------------+";
        if(Zoo.presentAnimals.size()==0) System.out.println("No animals are present .....");
        else{
            System.out.println(border);
            for(Animal animal: Zoo.presentAnimals){
                System.out.println();
                System.out.println("Animal Name ::"+animal.getName());
                System.out.println("Animal Description ::"+animal.getDescription());
                System.out.println("Animal Type ::"+animal.getType());
                System.out.println("Animal Sound ::"+animal.getSound());
            }
        }
    }

    public static boolean animalChoice(int adminAnimalInput) {

        //1. Add Animal
        if(adminAnimalInput==1){
            Scanner sc = new Scanner(System.in);
            System.out.println("Animal name  ::");
            String name= sc.nextLine();
            System.out.println("Animal Brief Description ::");
            String description = sc.nextLine();
            System.out.println("Animal Sound  ::");
            String Sound = sc.nextLine();
            while(true){
                System.out.println("Animal type (Mammal,Amphibian or Reptile ) ::");
                String type  = sc.nextLine();
                if(type.equalsIgnoreCase("mammal")){

                    while(true) {
                        System.out.println("Enter Subtype Mammal (enter exact spelling MammalType1 or MammalType2) ::");
                        String subType = sc.nextLine();
                        if (subType.equalsIgnoreCase("mammaltype1")) {
                            Mammal newMammal = new MammalType1(name, description, type, Sound);
                            newMammal.addAnimal(newMammal);
                            break;
                        } else if (subType.equalsIgnoreCase("mammaltype2")) {
                            Mammal newMammal = new MammalType2(name, description, type, Sound);
                            newMammal.addAnimal(newMammal);
                            break;
                        } else {
                            System.out.println("No such sub type exists.. re-prompt");
                        }
                    }
                    break;
                }
                else if(type.equalsIgnoreCase("reptile")){

                    while(true) {
                        System.out.println("Enter Subtype Reptile ( enter exact spelling ReptileType1 or ReptileType2) ::");
                        String subType = sc.nextLine();
                        if (subType.equalsIgnoreCase("reptiletype1")) {
                            Reptile newReptile = new ReptileType1(name, description, type, Sound);
                            newReptile.addAnimal(newReptile);
                            break;
                        } else if (subType.equalsIgnoreCase("reptiletype2")) {
                            Reptile newReptile = new ReptileType2(name, description, type, Sound);
                            newReptile.addAnimal(newReptile);
                            break;
                        } else {
                            System.out.println("No such sub type exists.. re-prompt");
                        }
                    }
                    break;
                }
                else if(type.equalsIgnoreCase("amphibian")){

                    while(true) {
                        System.out.println("Enter Subtype Amphibian ( enter exact spelling AmphibianType1 or AmphibianType2) ::");
                        String subType = sc.nextLine();
                        if (subType.equalsIgnoreCase("amphibiantype1")) {
                            Amphibian newAmphibian = new AmphibianType1(name, description, type, Sound);
                            newAmphibian.addAnimal(newAmphibian);
                            break;
                        } else if (subType.equalsIgnoreCase("amphibiantype2")) {
                            Amphibian newAmphibian = new AmphibianType2(name, description, type, Sound);
                            newAmphibian.addAnimal(newAmphibian);
                            break;
                        } else {
                            System.out.println("No such sub type exists.. re-prompt ");
                        }
                    }
                    break;
                }
                else{
                    System.out.println("Enter a Valid type of Animal (Mammal,Amphibian or Reptile ) only......");
                }
            }
        }
        //2. Update Animal Details
        else if(adminAnimalInput==2){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Existing Animal name  to be modified   ::");
            String name= sc.nextLine();
            System.out.println("Animal Existing type (Mammal,Amphibian or Reptile ) to be modified ::");
            String type  = sc.nextLine();

            int index = 0;
            int curr = -1;
            boolean animalFoundOrNot = false;

            if(type.equalsIgnoreCase("mammal")){

                for(Animal animal :Zoo.presentAnimals){
                    if(animal instanceof Mammal && Objects.equals(animal.getName().toLowerCase(), name.toLowerCase())){
                        curr = index;
                        animalFoundOrNot = true;
                    }
                    index++;
                }
            }
            else if(type.equalsIgnoreCase("reptile")){
                for(Animal animal :Zoo.presentAnimals){
                    if(animal instanceof Reptile && Objects.equals(animal.getName().toLowerCase(), name.toLowerCase())){
                        curr = index;
                        animalFoundOrNot = true;
                    }
                    index++;
                }
            }
            else if(type.equalsIgnoreCase(("amphibian"))){
                for(Animal animal :Zoo.presentAnimals){
                    if(animal instanceof Amphibian && Objects.equals(animal.getName().toLowerCase(), name.toLowerCase())){
                        curr = index;
                        animalFoundOrNot = true;
                    }
                    index++;
                }
            }
            else System.out.println("No such type of animal exists ......");
            if(animalFoundOrNot){
                System.out.println("Enter New Name for Animal ::");
                String modifiedName= sc.nextLine();
                System.out.println("Enter New Description for animal ::");
                String modifiedDescription = sc.nextLine();
                System.out.println("Enter New Sound for animal ::");
                String modifiedSound = sc.nextLine();
                System.out.println("Animal New type (Mammal,Amphibian or Reptile ) ::");
                String modifiedType  = sc.nextLine();
                if(modifiedType.equalsIgnoreCase("mammal")){
                    while(true){
                        System.out.println("Enter New -Subtype of Mammal MammalType1 or MammalType2 :::");
                        String subtype = sc.nextLine();
                        if(subtype.equalsIgnoreCase("mammaltype1")){
                            Mammal newMammal = new MammalType1(modifiedName,modifiedDescription,modifiedType,modifiedSound);
                            newMammal.setName(modifiedName);
                            newMammal.setType(modifiedType);
                            newMammal.modifyAnimal(curr,newMammal);
                            break;
                        }
                        else if(subtype.equalsIgnoreCase("mammaltype2")){
                            Mammal newMammal = new MammalType2(modifiedName,modifiedDescription,modifiedType,modifiedSound);
                            newMammal.setName(modifiedName);
                            newMammal.setType(modifiedType);
                            newMammal.modifyAnimal(curr,newMammal);
                            break;
                        }
                        else{
                            System.out.println("Enter correct subtype please ...re-prompt");
                        }
                    }

                }
                else if(modifiedType.equalsIgnoreCase("reptile")){
                    while(true){
                        System.out.println("Enter New -Subtype of Reptile ReptileType1 or ReptileType2 :::");
                        String subtype = sc.nextLine();
                        if(subtype.equalsIgnoreCase("reptiletype1")){
                            Reptile newReptile = new ReptileType1(modifiedName,modifiedDescription,modifiedType,modifiedSound);
                            newReptile.setName(modifiedName);
                            newReptile.setType(modifiedType);
                            newReptile.modifyAnimal(curr,newReptile);
                            break;
                        }
                        else if(subtype.equalsIgnoreCase("reptiletype2")){
                            Reptile newReptile = new ReptileType2(modifiedName,modifiedDescription,modifiedType,modifiedSound);
                            newReptile.setName(modifiedName);
                            newReptile.setType(modifiedType);
                            newReptile.modifyAnimal(curr,newReptile);
                            break;
                        }
                        else{
                            System.out.println("Enter correct subtype please ...re-prompt");
                        }
                    }
                }
                else if(modifiedType.equalsIgnoreCase("amphibian")){
                    while(true){
                        System.out.println("Enter New -Subtype of Amphibian AmphibianType1 or AmphibianType2 :::");
                        String subtype = sc.nextLine();
                        if(subtype.equalsIgnoreCase("amphibiantype1")){
                            Amphibian newAmphibian = new AmphibianType1(modifiedName,modifiedDescription,modifiedType,modifiedSound);
                            newAmphibian.setName(modifiedName);
                            newAmphibian.setType(modifiedType);
                            newAmphibian.modifyAnimal(curr,newAmphibian);
                            break;
                        }
                        else if(subtype.equalsIgnoreCase("amphibiantype2")){
                            Amphibian newAmphibian = new AmphibianType2(modifiedName,modifiedDescription,modifiedType,modifiedSound);
                            newAmphibian.setName(modifiedName);
                            newAmphibian.setType(modifiedType);
                            newAmphibian.modifyAnimal(curr,newAmphibian);
                            break;
                        }
                        else{
                            System.out.println("Enter correct subtype please ...re-prompt");
                        }
                    }
                }

            }
            else System.out.println("No such animal exists .....");




        }
        //3. Remove Animal
        else if(adminAnimalInput==3){
            if(Zoo.presentAnimals.size()==0) System.out.println("No animals are there in the Zoo...");
            else{
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Animal Name to be Removed :::");
                String name = sc.nextLine();
                System.out.println("Enter the type of the Animal to be Removed :::");
                String type = sc.nextLine();
                boolean animalFoundOrNot = false;
                Animal animalToRemove = null;
                if(type.equalsIgnoreCase("mammal")){
                    for(Animal animal :Zoo.presentAnimals){
                        if(animal instanceof Mammal && Objects.equals(animal.getName().toLowerCase(), name.toLowerCase())){
                            animalToRemove = animal;
                            animalFoundOrNot = true;
                        }

                    }
                }
                else if(type.equalsIgnoreCase("reptile")){
                    for(Animal animal :Zoo.presentAnimals){
                        if(animal instanceof Reptile && Objects.equals(animal.getName().toLowerCase(), name.toLowerCase())){
                            animalToRemove = animal;
                            animalFoundOrNot = true;
                        }

                    }
                }
                else if(type.equalsIgnoreCase("amphibian")){
                    for(Animal animal :Zoo.presentAnimals){
                        if(animal instanceof Amphibian && Objects.equals(animal.getName().toLowerCase(), name.toLowerCase())){
                            animalToRemove = animal;
                            animalFoundOrNot = true;
                        }

                    }
                }
                else System.out.println("No Such type of animal exists .......");
                if(animalFoundOrNot) {
                    animalToRemove.removeAnimal(animalToRemove);
                }
                else System.out.println("No such Animal exists with this name .....");
            }



        }
        //4. View Animals
        else if(adminAnimalInput==4){
            viewAnimal();

        }
        //5. Exit
        else if(adminAnimalInput==5) return true;
        else{
            System.out.println("Error....");
        }
        return false;
    }


     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void addAnimal(Animal animal) {
        Zoo.presentAnimals.add(animal);
    }

    @Override
    public void modifyAnimal(int index ,Animal updatedAnimal) {
        Zoo.presentAnimals.set(index,updatedAnimal);
    }

    @Override
    public void removeAnimal(Animal animal) {
        Zoo.presentAnimals.remove(animal);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSound() {
        return Sound;
    }

    public void setSound(String sound) {

        this.Sound = sound;
    }

    public  void feed(){
        System.out.println(this.getSound());
        System.out.println(".....Animal Feeding.....");
    }

    public  void read(){
        System.out.println(this.getDescription());
        System.out.println("....Animal Reading....");
    }
}