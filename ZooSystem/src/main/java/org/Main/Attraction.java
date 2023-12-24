//Package of Attraction.java
package org.Main;

//Required Header Files
import org.errors.HandleExceptions;
import java.util.ArrayList;
import java.util.Scanner;
//Required Header Files

/**
 * The Attraction class provides different methods that for admin to add remove modify and view attractions
 * and also name , description, ticketPrice and uniqueID as data Members
 */
public class Attraction implements ModifyInterface {
    //Data Members
    private String name;
    private String description;
    private double ticketPrice;
    private int uniqueID;
    private static int prevUniqueID =0;
    private boolean isOpen = false;
    private int countOfTicketedVisitors = 0;
    static ArrayList<Attraction> presentAttractions = new ArrayList<>();
    //Data Members
    /**
     * Searches for an attraction by its unique ID in the list of present attractions.
     *
     * @param uniqueID The unique ID of the attraction to search for.
     * @return The index of the attraction with the specified unique ID, or -1 if not found.
     */
    public static int searchByAttractionID(int uniqueID) {
        int index = 0;
        int curr = -1;
        for (Attraction attraction : Attraction.presentAttractions) {
            if (attraction.getUniqueID() == uniqueID) {
                curr = index;
                break;
            }
            index++;
        }
        return curr;
    }

    /**
     * Constructor for Attraction class.
     *
     * @param name Name of the attraction that the admin wants to add .
     * @param description    Description of the Attraction that admin wants to enter.
     * @param ticketPrice    Already fixed to 101.0 for Basic members
     */
    public Attraction(String name, String description, double ticketPrice) {
        this.name = name;
        this.description = description;
        this.ticketPrice = ticketPrice;
        setPrevUniqueID((int) getPrevUniqueID());
        this.uniqueID =++prevUniqueID;
        setUniqueID((int) getPrevUniqueID());
    }


    // Getter and Setter for the members
    /**
     * Get the name of the attraction.
     * @return The attraction's name.
     */
    public String getName() {
        return name;
    }
    /**
     * Set the name of the attraction.
     * @param name The attraction's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the description of the attraction.
     * @return The attraction's description.
     */
    public String getDescription() {
        return description;
    }
    /**
     * Set the description of the attraction.
     * @param description The attraction's description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the ticket price of the attraction.
     * @return The attraction's ticket price.
     */
    public double getTicketPrice() {
        return ticketPrice;
    }
    /**
     * Set the ticket price of the attraction.
     * @param ticketPrice The attraction's ticket price.
     */
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    /**
     * Get the uniqueID of the attraction.
     * @return The attraction's uniqueID.
     */
    public int getUniqueID() {
        return uniqueID;
    }
    /**
     * Set the description of the attraction.
     * @param uniqueID The attraction's UniqueID.
     */
    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }
    /**
     * Get previous uniqueID of the attraction.
     * @return The attraction's previous uniqueID.
     */
    public static long getPrevUniqueID() {
        return prevUniqueID;
    }
    /**
     * Set previous uniqueID of the attraction.
     * @param prevUniqueID  The attraction's previous uniqueID.
     */
    public static void setPrevUniqueID(int prevUniqueID) {
        Attraction.prevUniqueID = prevUniqueID;
    }
    //Getter and Setter for the members

    /**
     * Adds the current Attraction object to the list of present attractions and prints a success message.
     * This method is used to add an Attraction to the list of attractions.
     */
    @Override
    public  void add(){
        Attraction.presentAttractions.add(this);
        System.out.println("Attraction Added Successfully....");
    }
    /**
     * Prints All the attractions that are present at that moment
     * If no attractions are present it will be informed to the user.
     */
    public static void viewAttractionInVisitor(){
        int foundAt =Attraction.viewAttractionVisitor();
        if(foundAt!=-1){
            int choiceVisitor = HandleExceptions.getInputInRange("Enter the Number to learn about between [1- "+presentAttractions.size()+"] :::::",1,presentAttractions.size());
            System.out.println(presentAttractions.get(choiceVisitor-1).getDescription());
            System.out.println(".....Buy Your Ticket Now .......");
        }
    }
    /**
     * Displays a list of present attractions along with their names and ticket prices.
     *
     * @return The number of attractions displayed, or -1 if no attractions are present.
     */
    public static int viewAttractionVisitor() {
        if (presentAttractions.size() == 0) {
            System.out.println("No Attractions Present...");
            return -1;
        } else {
            int i = 1;
            String border = "+---------------------------+";
            System.out.println(border);
            for (Attraction presentAttraction : presentAttractions) {
                System.out.println(i + ". Name ::" + presentAttraction.getName());
                System.out.println("Price ::" + presentAttraction.getTicketPrice());
                i++;
            }
            System.out.println(border);
            return i;
        }
    }

    /**
     * Displays a list of present attractions along with their names, descriptions, and unique IDs.
     */
    public static void viewAttraction() {
        if (presentAttractions.size() == 0) {
            System.out.println("No Attractions Present...");
        } else {
            int i = 1;
            for (Attraction presentAttraction : presentAttractions) {
                String border = "+---------------------------+";
                System.out.println(border);
                System.out.println(i + ". Name ::" + presentAttraction.getName());
                System.out.println(i + ". Description ::" + presentAttraction.getDescription());
                System.out.println(i + ". UniqueID ::" + presentAttraction.getUniqueID());
                System.out.println(border);
                i++;
            }
        }
    }

    /**
     * This method removes an Attraction Object if it exists Otherwise it prints an error message.
     */
    @Override
    public  void remove(){
        presentAttractions.remove(this);
    }
    /**
     * This method modifies an Attraction Object if it exists Otherwise it prints an error message.
     */
    @Override
    public void modify(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Details of Attraction with Attraction ID ::"+this.getUniqueID());
        System.out.println("Name of Attraction ID ->"+ this.getName());
        System.out.println("Description of Attraction ID -> "+ this.getDescription());
        System.out.println("Enter New Name ::");
        String newName = sc.nextLine();
        System.out.println("Enter Updated Description ::");
        String newDescription = sc.nextLine();
        this.setTicketPrice(101);
        this.setName(newName);
        this.setDescription(newDescription);
        System.out.println("Details Has Been Updated Successfully......");
    }
    /**
     * This method provides user to add , view , modify and remove the attraction.
     * @param adminAttractionInput The choice the user wants to enter
     * @return a boolean value that indicate if the program should continue or not
     */
    public static boolean attractionChoice(int adminAttractionInput){
        boolean exitFlagAttraction =false;
        Scanner sc = new Scanner(System.in);

        //1. Add Attraction
        if(adminAttractionInput==1){
            System.out.println("Enter Attraction Name::");
            String attractionName = sc.nextLine();
            System.out.println("Enter Attraction Description::");
            String attractionDescription = sc.nextLine();
            System.out.println("Enter the ticket price");
            double ticketPrice = HandleExceptions.getInputInRange("Enter ticket price :::",0,Integer.MAX_VALUE);
            Attraction newAttraction = new Attraction(attractionName,attractionDescription,ticketPrice);
            newAttraction.add();
        }
        //2. View Attractions
        else if(adminAttractionInput==2){
            Attraction.viewAttraction();
        }
        //3. Modify Attraction
        else if(adminAttractionInput==3){
            System.out.println("Enter the Attraction ID ::: ");
            int attractionID = sc.nextInt();
            sc.nextLine();
            int index = 0;
            boolean foundOrNot = false;
            for(int i=0;i<presentAttractions.size();i++){
                if(attractionID == presentAttractions.get(i).getUniqueID()){
                    index =i;
                    foundOrNot = true;
                }
            }
            if(foundOrNot) presentAttractions.get(index).modify();
            else System.out.println("No Attraction with Attraction ID ::" + attractionID+" Exists ....");

        }
        //4. Remove Attraction
        else if(adminAttractionInput==4){
            System.out.println("Enter attractionID to remove the attraction ::: ");
            int uniqueID = sc.nextInt();
            boolean attractionRemovedOrNot = false;
            int index = 0;
            for(int i=0;i<presentAttractions.size();i++){
                if(presentAttractions.get(i).getUniqueID()==uniqueID){
                    index =i;
                    attractionRemovedOrNot = true;
                }
            }
            if(attractionRemovedOrNot){
                presentAttractions.get(index).remove();
                System.out.println("Attraction Has Been Removed...");
            }
            else{
                System.out.println("No Such Attraction with Id "+ uniqueID+" Do no exists ....");
            }
        }
        // 5. Exit
        else if(adminAttractionInput==5){
            exitFlagAttraction = true;
        }
        else{
            System.out.println("Error");
        }
        return exitFlagAttraction;
    }

    /**
     * Gets the count of ticketed visitors for the attraction.
     *
     * @return The count of ticketed visitors.
     */
    public int getCountOfTicketedVisitors() {
        return countOfTicketedVisitors;
    }

    /**
     * Sets the count of ticketed visitors for the attraction.
     *
     * @param countOfTicketedVisitors The new count of ticketed visitors to set.
     */
    public void setCountOfTicketedVisitors(int countOfTicketedVisitors) {
        this.countOfTicketedVisitors = countOfTicketedVisitors;
    }

    /**
     * Checks if the attraction is currently open.
     *
     * @return {@code true} if the attraction is open, {@code false} if it is closed.
     */
    public boolean isOpen() {
        return isOpen;
    }

    /**
     * Sets the status of the attraction, whether it is open or closed.
     *
     * @param open {@code true} to indicate that the attraction is open, {@code false} to indicate that it is closed.
     */
    public void setOpen(boolean open) {
        isOpen = open;
    }

}
