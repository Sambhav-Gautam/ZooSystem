//Pac
package org.Main;

/**
 * This interface contains methods to display messages and menus to users.
 */
public  interface UserInterface {
    /**
     * Displays information about present special deals.
     */
    static void presentSpecialDeals(){
        if(Admin.isSpecialDeal1() && Admin.isSpecialDeal2()) viewSpecialDeals();
        else if(Admin.isSpecialDeal1()) System.out.println("1. If a person buys more than 2 attractions, they get a special discount of 15% on the total amount");
        else if(Admin.isSpecialDeal2()) System.out.println("1. If a person buys more than 3 attractions, they get a special discount of 30% on the total amount");
        else System.out.println(" .... No Special Deals are present at this moment .....");
    }
    /**
     * Displays options to add, remove, or exit from special deals.
     */
    static void setSpecialDeal(){
        System.out.println("1. Add Special Deal ...");
        System.out.println("2. Remove Special Deal ...");
        System.out.println("3. Exit ...");
    }
    /**
     * Displays options for visitors to interact with animals.
     */
    static  void visitAnimal(){
        System.out.println("1. Feed An Animal ");
        System.out.println("2. Read About Animal ");
    }
    /**
     * Displays information about memberships and their prices.
     */
    static void displayMembership(){
        System.out.println("..Only Press 1 or 2...");
        System.out.println("1. Basic Membership (₹20) ");
        System.out.println("2. Premium Membership (₹80) ");

    }
    /**
     * Displays information about special deals.
     */
    static void viewSpecialDeals(){
        System.out.println("1. If a person buys more than 2 attractions, they get a special discount of 15% on the total amount");
        System.out.println("2. If a person buys more than 3 attractions, they get a special discount of 30% on the total amount");
    }
    /**
     * Displays options for visitors to explore the zoo.
     */
    static  void displayExploreZoo(){
        String border = "+---------------------------+";
        System.out.println(border);
        System.out.println("1. View Attraction  ");
        System.out.println("2. View Animals ");
        System.out.println("3. Exit  ");

        System.out.println(border);
    }
    /**
     * Displays options for scheduling events related to attractions.
     */
    static void displayScheduleEvents(){
        String border = "+---------------------------+";
        System.out.println(border);
        System.out.println("1. Open Attraction ");
        System.out.println("2. Close Attraction ");
        System.out.println("3. Set Price for Attraction ");
        System.out.println("4. Exit");
        System.out.println(border);
    }
    /**
     * Displays options for visitor login and actions.
     */
    static void displayVisitorLogin(){
        String border = "+---------------------------+";
        System.out.println(border);
        System.out.println("1. Explore the Zoo");
        System.out.println("2. Buy Membership");
        System.out.println("3. Buy Tickets");
        System.out.println("4. View Discounts");
        System.out.println("5. View Special Deals");
        System.out.println("6. Visit Animals");
        System.out.println("7. Visit Attractions");
        System.out.println("8. Leave Feedback");
        System.out.println("9. Log Out");
        System.out.println(border);

    }
    /**
     * Displays options for visitor actions (Register or Login).
     */
    static void displayVisitorMessage(){
        String border = "+---------------------------+";
        System.out.println(border);
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println(border);
    }
    /**
     * Displays options for setting discounts.
     */
    static void displaySetDiscount(){

        String border = "+---------------------------+";

        System.out.println(border);
        System.out.println("|  Set Discount !     |");
        System.out.println(border);
        System.out.println("1. Add Discount");
        System.out.println("2. Modify Discount");
        System.out.println("3. Remove Discount");
        System.out.println("4. Exit");
        System.out.println(border);
    }
    /**
     * Displays options for managing animals.
     */
    static void displayManageAnimals(){
        String border = "+---------------------------+";

        System.out.println(border);
        System.out.println("|  Manage Animals !     |");
        System.out.println(border);
        System.out.println("1. Add Animal");
        System.out.println("2. Update Animal Details");
        System.out.println("3. Remove Animal");
        System.out.println("4. View Animals ");
        System.out.println("5. Exit");
        System.out.println(border);
    }
    /**
     * Displays options for managing attractions.
     */
    static void displayManageAttractions(){

        String border = "+---------------------------+";

        System.out.println(border);
        System.out.println("|  Manage Attractions!     |");
        System.out.println(border);
        System.out.println("1. Add Attraction");
        System.out.println("2. View Attractions");
        System.out.println("3. Modify Attraction");
        System.out.println("4. Remove Attraction");
        System.out.println("5. Exit");
        System.out.println(border);
    }
    /**
     * Displays a welcome message and menu for user choices.
     */
    static void displayWelcomeMessage() {
        String border = "+---------------------------+";

        System.out.println(border);
        System.out.println("|  Welcome to ZOOtopia!     |");
        System.out.println(border);
        System.out.println("|  1. Enter as Admin        |");
        System.out.println("|  2. Enter as Visitor      |");
        System.out.println("|  3. View Special Deals    |");
        System.out.println("|  4. Exit                  |");
        System.out.println(border);
    }
    /**
     * Displays the admin menu and options.
     */
   static void  displayAdminMessage(){
        String border = "+---------------------------+";

        System.out.println(border);
        System.out.println("|  Admin Menu  :     ");
        System.out.println(border);
        System.out.println("|   1. Manage Attractions   ");
        System.out.println("|   2. Manage Animals   ");
        System.out.println("|   3. Schedule Events  ");
        System.out.println("|   4. Set Discounts    ");
        System.out.println("|   5. Set Special Deal ");
        System.out.println("|   6. View Visitor Stats"  );
        System.out.println("|   7. View Feedback    ");
        System.out.println("|   8. Exit ");
        System.out.println(border);
    }

}
