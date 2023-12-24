//Package of Admin.java
package org.Main;

//Header Files Required
import org.Zoo.Animal;
import org.Zoo.Zoo;
import org.errors.HandleExceptions;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
//Header Files Required



/**
 * The `Admin` class represents an administrative user and extends the `User` class.
 * It also a  method admin choice for different operation available for user .
 * 1. Manage Attractions
 * 2. Display Animals
 * 3. Schedule Events
 * 4. Set Discounts
 * 5. Set Special Deals
 * 6. View Visitor Stats
 * 7. View Feedback
 * 8. Exit
 */
public class Admin extends User implements UserAction{
    //Admin username and password should not be changed by anyone
    private static final String ADMIN_USERNAME  = "admin";
    private static final String ADMIN_PASSWORD = "admin123";
    private static boolean specialDeal1 ;
    private static boolean specialDeal2 ;

    /**
     * Default constructor for the Admin class.
     * It calls the constructor of the superclass (`User`) with default values.
     */

    public Admin() {
        super();
    }

    /**
     * Checks if special deal 1 is active.
     * @return if special deal 1  is active
     */
    public static boolean isSpecialDeal1() {
        return specialDeal1;
    }

    /**
     * Set the status of Special Deal1
     * @param specialDeal1  specialDeal1  {@code true} to activate special deal 1, {@code false} to deactivate it
     */
    public static void setSpecialDeal1(boolean specialDeal1) {
        Admin.specialDeal1 = specialDeal1;
    }

    /**
     * Checks if special deal 2 is active.
     * @return if special deal 2  is active
     */
    public static boolean isSpecialDeal2() {
        return specialDeal2;
    }
    /**
     * Set the status of Special Deal2
     * @param specialDeal2  specialDeal2  {@code true} to activate special deal 2, {@code false} to deactivate it
     */
    public static void setSpecialDeal2(boolean specialDeal2) {
        Admin.specialDeal2 = specialDeal2;
    }

    /**
     * This method handles the choices made by an admin user.
     * @param adminInput The input the user wants to give .
     * @return A boolean indicating whether the admin wishes to exit after the choice that is 8 is pressed or not.
     */
    public  boolean adminChoice(int adminInput) {
        boolean exitFlag = false;
        //1. Manage Attractions
        if (adminInput == 1) {
            boolean exitFlagAttraction = false;
            while(!exitFlagAttraction){
                UserInterface.displayManageAttractions();
                int adminAttractionInput = HandleExceptions.getInputInRange("Enter your Choice [1- 5] ::",1,5);
                exitFlagAttraction = Attraction.attractionChoice(adminAttractionInput);

            }


        }
        //2. Manage Animals
        else if (adminInput == 2) {
            if(!Zoo.oneTimeCall){
                Zoo.addZoo();
                Zoo.oneTimeCall =true;

            }
            boolean exitFlagAnimals = false;
            while(!exitFlagAnimals){
                UserInterface.displayManageAnimals();
                int adminAnimalInput = HandleExceptions.getInputInRange("Enter your Choice [1- 5] ::",1,5);
                exitFlagAnimals = Animal.animalChoice(adminAnimalInput);
            }
        }
        //3. Schedule Events
        //Step 1 -> Check if the attraction exists or not
        else if(adminInput==3){
            if(Attraction.presentAttractions.size()==0){
                System.out.println("... No Attractions are present to open ,close or set price ....");
            }
            else{
                System.out.println("Attractions that can be opened, closed or can set price for  are :::");
                Attraction.viewAttraction();
                while(true ){

                    UserInterface.displayScheduleEvents();
                    int adminEventInput = HandleExceptions.getInputInRange("Enter your Choice [1- 4] ::",1,4);
                    // 1. Open Attraction
                    if(adminEventInput==1){
                        int attractionID = HandleExceptions.getInputInRange("Give attractionID to open the Attraction :::",1,Integer.MAX_VALUE);
                        int indexObject = Attraction.searchByAttractionID(attractionID);
                        if(indexObject==-1) System.out.println("No attraction exists with this attractionID.....");
                        else{
                            if(Attraction.presentAttractions.get(indexObject).isOpen()) System.out.println("Attraction already open...");
                            else {Attraction.presentAttractions.get(indexObject).setOpen(true);
                                System.out.println("Attraction has been opened....");}
                        }
                    }
                    // 2. Close Attraction
                    else if(adminEventInput==2){
                        int attractionID = HandleExceptions.getInputInRange("Give attractionID to Close the Attraction :::",1,Integer.MAX_VALUE);
                        int indexObject = Attraction.searchByAttractionID(attractionID);
                        if(indexObject==-1) System.out.println("No attraction exists with this attractionID.....");
                        else{
                            if(!Attraction.presentAttractions.get(indexObject).isOpen()) System.out.println("Attraction already closed...");
                            else {Attraction.presentAttractions.get(indexObject).setOpen(false);
                                System.out.println("Attraction Closed ...");}
                        }

                    }
                    // 3. Set Price for Attraction
                    else if(adminEventInput==3){
                        int attractionID = HandleExceptions.getInputInRange("Give attractionID to set the Price for the attraction :::",1,Integer.MAX_VALUE);
                        int indexObject = Attraction.searchByAttractionID(attractionID);
                        if(indexObject==-1) System.out.println("No attraction exists with this attractionID to set price for.....");
                        else{

                            double priceAttraction = HandleExceptions.getInputInRange("Enter the Price for the Attraction  "+  Attraction.presentAttractions.get(indexObject).getName()+" (+ve value):::",0,Integer.MAX_VALUE);
                            Attraction.presentAttractions.get(indexObject).setTicketPrice(priceAttraction);
                            System.out.println("Price has been set successfully ....");
                        }
                    }
                    // 4. Exit
                    else if (adminEventInput==4){
                        break;
                    }
                    else{
                        System.out.println("..... ERROR .....");
                    }
                }

            }
        }
        //4. Set Discounts
        else if(adminInput==4){
            Scanner sc = new Scanner(System.in);
            while(true){
                UserInterface.displaySetDiscount();
                int discountChoice = HandleExceptions.getInputInRange("Enter your choice [1-4] :::",1,4);
                //1. Add
                if(discountChoice==1){
                    System.out.println("Enter Discount Category :::");
                    String discountCategory = sc.nextLine();
                    int discountPercentage = HandleExceptions.correctPercentage("Enter Discount Percentage [1-100]",1,100);
                    Discount newDiscount = new Discount(discountCategory,discountPercentage);
                    newDiscount.add();

                //2. Modify
                } else if (discountChoice==2) {
                    if(Discount.presentDiscounts.size()==0) System.out.println("No Discount present to modify .....");
                    else{
                        System.out.println("Present Discounts that can be modified ::::");
                        Discount.view();
                        System.out.println("Enter Discount Category to be modified :::");
                        String discountCategory = sc.nextLine();

                        int index  =Discount.search(discountCategory);
                        if(index==-1){
                            System.out.println("No Discount exists with name and percentage ....");
                            System.out.println("Check The Menu that is printed for correct values ...");
                        }
                        else{
                            Discount.presentDiscounts.get(index).modify();
                        }

                    }

                }
                //3.Remove
                else if (discountChoice==3) {
                    if(Discount.presentDiscounts.size()==0) System.out.println("No Discount present to be removed .....");
                    else {
                        System.out.println("Present Discounts that can be Removed ::::");
                        Discount.view();
                        System.out.println("Enter Discount Category to be Removed :::");
                        String discountCategory = sc.nextLine();

                        int index = Discount.search(discountCategory);
                        if(index==-1){
                            System.out.println("No Discount exists with name and percentage ....");
                            System.out.println("Check The Menu that is printed for correct values ...");
                        }
                        else{
                            Discount.presentDiscounts.get(index).remove();
                        }
                    }

                }
                //4. Exit
                else if (discountChoice==4) {
                    break;
                }else System.out.println("Error .......");
            }

        }
        //5. Set Special Deal
        else if(adminInput==5){
            while(true){
                UserInterface.setSpecialDeal();
                int choiceSpecialDeal = HandleExceptions.getInputInRange("Enter your Choice [1-3] inclusive :::",1,3);
                //1. Add Special Deal
                if(choiceSpecialDeal==1){
                    System.out.println("You Can Add Two Special Deals :::");
                    UserInterface.viewSpecialDeals();
                    int choice = HandleExceptions.getInputInRange("Please enter 1 to add the first deal and 2 to add the second deal. ::",1,2);
                    if(choice==1){
                        if(isSpecialDeal1()) System.out.println("This Special Deal is already set ...");
                        else System.out.println("Special Deal Set Successfully ....");
                        setSpecialDeal1(true);
                    }
                    else if(choice==2){
                        if(isSpecialDeal2()) System.out.println("This Special Deal is already set ..");
                        else System.out.println("Special Deal Set Successfully");
                        setSpecialDeal2(true);
                    }
                    else System.out.println("...Invalid Special Deal...");
                }
                //2. Remove Special Deal
                else if(choiceSpecialDeal==2){
                    //If both Deals are active
                    if(isSpecialDeal1() && isSpecialDeal2()){
                        System.out.println("Two Special Deals Are Active Currently ...");
                        UserInterface.viewSpecialDeals();
                        int choice = HandleExceptions.getInputInRange("Enter 1 or 2 or (press 3 ro cancel )for Corresponding Deal to remove ::",1,3);
                        if(choice==1){
                            setSpecialDeal1(false);
                            System.out.println("Special Deal Removed Successfully ....");
                        } else if (choice ==2) {
                            setSpecialDeal2(false);
                            System.out.println("Special Deal Removed Successfully ....");
                        }
                        else if(choice==3){
                            System.out.println("Removing is Cancelled by the Admin User .....");
                        }
                        else System.out.println("..... Enter Correctly .....");
                    }
                    //If Only Special Deal1 Is Active
                    else if(isSpecialDeal1()){
                        System.out.println("Only 1 Special Deal is Present to remove ....");
                        System.out.println("1. If a person buys more than 2 attractions, they get a special discount of 15% on the total amount\n");
                        int choice = HandleExceptions.getInputInRange("Enter 1 to remove the Special Deal or 2 to cancel removing :::",1,2);
                        if(choice==1){
                            setSpecialDeal1(false);
                            System.out.println("Special Deal Removed Successfully...");
                        }
                        else if(choice==2){
                            System.out.println("Removing is Cancelled by the Admin User .....");
                        }
                        else System.out.println("Enter Correctly .....");
                    }
                    //If Only Special Deal2 Is Active
                    else if(isSpecialDeal2()){
                        System.out.println("Only 1 Special Deal is Present to remove ....");
                        System.out.println("1. If a person buys more than 3 attractions, they get a special discount of 30% on the total amount\n");
                        int choice = HandleExceptions.getInputInRange("Enter 1 to remove the Special Deal or 2 to cancel removing :::",1,2);
                        if(choice==1){
                            setSpecialDeal1(false);
                            System.out.println("Special Deal Removed Successfully...");
                        }
                        else if(choice==2){
                            System.out.println("Removing is Cancelled by the Admin User .....");
                        }
                        else System.out.println("Enter Correctly .....");
                    }
                    else{
                        System.out.println("No Special Deals Are Preset To Be Removed ....");
                    }
                }
                else if(choiceSpecialDeal==3) break;
            }
        }
        //6. View Visitor Stat
        else if(adminInput==6){
            System.out.println("Total Number Of Visitors :::"+VisitorStats.getNumberOfVisitors());
            System.out.println("Total Earned Profit is ::: ₹"+VisitorStats.getProfitEarned());
            ArrayList<Attraction> mostVisitedAttractions = VisitorStats.mostVisitedAttractions();
            if(mostVisitedAttractions.size()==0 || mostVisitedAttractions.get(0).getCountOfTicketedVisitors()==0) System.out.println("No Attractions has been visited ...");
            else{
                int i =1;
                System.out.println("Most Visited Attractions ....");
                for(Attraction curr : mostVisitedAttractions){
                    System.out.println(i +". Attraction Name "+curr.getName()+"with ticketed visitors"+ curr.getCountOfTicketedVisitors());
                    i++;
                }

            }
        }
        //7. View Feedback
        else if(adminInput==7){
            if(Visitor.presentVisitors.size() ==0) System.out.println("No Feedback ...");
            else{
                String border = "+---------------------------+";
                for(Visitor oldVisitor : Visitor.presentVisitors){
                    System.out.println(border);
                    System.out.println("Name :::"+oldVisitor.getName());
                    System.out.println("Feedback ::"+oldVisitor.getFeedback());
                }
            }

        }
        //8. Logout
        else if(adminInput==8){
            exitFlag = Logout();

        }
        else{
            System.out.println("Error ");
        }
        return exitFlag;
    }

    /**
     * This method is used as a flag in case if the user wants to exit.
     * @return returns a true indicating the user wants to log out.
     */
    @Override
    public boolean Logout() {
        return true;
    }

    /**
     * This method is used to validate the admin login .
     * If the input details are wrong it will keep asking until right details are given .
     * Prints user-friendly message as well .
     */
    @Override
    public void Login() {
        Scanner sc = new Scanner(System.in);
        boolean validAdminLogin = true;
        while(validAdminLogin){
            System.out.println("Enter Admin Username:::");
            String name = sc.nextLine();
            System.out.println("Enter Admin Password:::");
            String password = sc.nextLine();
            if(Objects.equals(name, ADMIN_USERNAME) && Objects.equals(password, ADMIN_PASSWORD)){
                validAdminLogin = false;
            }
            else{
                System.out.println("Login Failed as Admin...");
            }
        }
        System.out.println("Logged in as Admin.");

    }


}
