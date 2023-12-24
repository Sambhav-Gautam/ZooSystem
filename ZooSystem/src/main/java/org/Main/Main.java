//Package of Main.java
package org.Main;

//Header Files Required
import org.errors.HandleExceptions;
//Header Files Required

/**
 * The main entry point for the program. It displays a welcome message and handles user interactions
 * for both administrators and visitors, allowing them to perform various actions based on their roles.
 */
public class Main {
    public static void main(String[] args) {
        while (true) {
            UserInterface.displayWelcomeMessage();
            int userInput = HandleExceptions.getInputInRange("Enter your Choice[1-4] :: ",1,4);
            //1. Login As Admin
            if(userInput==1){
                Admin admin = new Admin();
                admin.Login();
                boolean exitFlag = false;
                while(!exitFlag){
                    UserInterface.displayAdminMessage();
                    int adminInput = HandleExceptions.getInputInRange("Enter your Choice [1- 8] ::",1,8);
                    exitFlag =  admin.adminChoice(adminInput);
                }

            }
            //2. Login As Visitor
            else if(userInput==2){

                while(true){
                    UserInterface.displayVisitorMessage();
                    int visitorInput = HandleExceptions.getInputInRange("Enter your Choice[1-2] ::",1,2);
                    // 1. Register New Visitor
                    if(visitorInput==1){
                        Visitor.visitorRegistration();
                    }
                    //2. Login
                    else if(visitorInput==2){
                        Visitor newVisitor = new Visitor();
                        if(Visitor.presentVisitors.size()==0) System.out.println("Register first as their is no registrations yet ....");
                        else  newVisitor.Login();
                        break;
                    }
                    else{
                        System.out.println("Error ...");
                    }
                }
            }
            //3. View Special Deals
            else if(userInput==3){
                UserInterface.presentSpecialDeals();
            } else if (userInput==4) {
                System.out.println("Thanks For Using Interface ....");
                break;
            } else{
                System.out.println("Error");
            }
        }
    }
}
