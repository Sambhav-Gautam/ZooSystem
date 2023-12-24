// Package of Visitor.java
package org.Main;

//Header Files Required
import org.Zoo.Animal;
import org.Zoo.Zoo;
import org.errors.HandleExceptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Header Files Required

/**
 * The `Visitor` class represents non-administrative user and extends the `User` class.
 * It also a  method visitor choice for different operation available for user .
 * 1. Explore the Zoo
 * 2. Buy Membership
 * 3. Buy tickets
 * 4. View Discounts
 * 5. View Special Deals
 * 6. Visit Animals
 * 7. Visit Attractions
 * 8. Leave Feedback
 * 9. Logout
 */
public class Visitor extends  User implements UserAction{
    //Data Members
    private int age;
    private String phone;
    private double balance;
    private String email;
    private Feedback feedback;
    private String memberShip;
    private HashMap<Attraction,Integer> boughtTickets= new HashMap<>();

    public static  ArrayList<Visitor> presentVisitors = new ArrayList<>();
    //Data Members

    /**
     * Parametrized constructor for the Visitor class.
     * @param name Visitor's name.
     * @param password Visitor's password.
     * @param age Visitor's age
     * @param balance Visitor's balance
     * @param email Visitor's email
     */
    public Visitor(String name,String password,int age,String phone,double balance,String email) {
        super(name,  password);
        this.age = age;
        this.setAge(this.getAge());
        this.phone = phone;
        this.setPhone(this.getPhone());
        this.balance = balance;
        this.email  = email;
        this.setEmail(this.getEmail());
    }
    /**
     * Default constructor for the Visitor class.
     */
    public  Visitor(){

    }
    /**
     * This method handles the choices made by a visitor user.
     * @param visitorLoginInput The input the user wants to give .
     * @return A boolean indicating whether the admin wishes to exit after the choice that is 9 is pressed or not.
     */
    public boolean visitorChoice(int visitorLoginInput){

        Scanner sc = new Scanner(System.in);

        boolean visitorLoginFlag =false ;
        // 1. Explore the Zoo
        if(visitorLoginInput==1){
            while(true){
                UserInterface.displayExploreZoo();
                int exploreZooInput = HandleExceptions.getInputInRange("Enter Choice in range [1-3] ::",1,3);
                //1. View Attractions
                if(exploreZooInput==1){
                    Attraction.viewAttractionInVisitor();
                }
                //2. View Animals
                else if(exploreZooInput==2){
                    Animal.viewAnimal();
                }
                //3. Exit
                else if(exploreZooInput==3){break;}
                else System.out.println("Error.....");
            }


        }
        // 2. Buy Membership
        else if(visitorLoginInput==2){

            UserInterface.displayMembership();
            int memberShipInput = HandleExceptions.getInputInRange("Enter input in range [1 - 2] ::: ",1,2);
            System.out.println("Apply CouponCode(enter no or none if no coupon code ) :::");
            String couponCode = sc.nextLine();

            if(couponCode==null || Objects.equals(couponCode, "no") || Objects.equals(couponCode, "none")){
                System.out.print("");
            }


            //1. Basic Membership
            if(memberShipInput==1){
                if(this.getMemberShip()==null){
                    if(this.getBalance()>=20){
                        double discountCodeApplicable = Discount.applyDiscountCode(20,couponCode);
                        VisitorStats.setNumberOfVisitors(VisitorStats.getNumberOfVisitors()+1);
                        if(discountCodeApplicable!=-1) {
                            this.setBalance(this.getBalance() - discountCodeApplicable);
                            VisitorStats.setProfitEarned(VisitorStats.getProfitEarned()+( discountCodeApplicable));
                        }
                        else{
                            this.setBalance(this.getBalance() - 20);
                            VisitorStats.setProfitEarned(VisitorStats.getProfitEarned()+( 20));
                        }
                        System.out.println("....Successfully Purchased Basic MemberShip....");
                        System.out.println("Total Balance left :: ₹" + this.getBalance());
                        this.setMemberShip("basic");
                    }
                    else{
                        System.out.println("....Insufficient Balance....");
                        System.out.println("Current Balance :: ₹"+this.getBalance());
                    }
                }
                else if(Objects.equals(this.getMemberShip().toLowerCase(), "basic")){
                    System.out.println("....You Already have Basic membership, no need to purchase again....");
                }
                else if(Objects.equals(this.getMemberShip().toLowerCase(), "premium")){
                    System.out.println("....You Already have premium membership, no need to purchase basic one....");
                }

            }
            //2. Premium Membership
            else if(memberShipInput==2){
                if(this.getMemberShip()==null){
                    if(this.getBalance()>=80){
                        double discountCodeApplicable = Discount.applyDiscountCode(80,couponCode);
                        VisitorStats.setNumberOfVisitors(VisitorStats.getNumberOfVisitors()+1);
                        if(discountCodeApplicable!=-1) {
                            this.setBalance(this.getBalance() - discountCodeApplicable);
                            VisitorStats.setProfitEarned(VisitorStats.getProfitEarned()+(discountCodeApplicable));
                        }
                        else{
                            this.setBalance(this.getBalance() - 80);
                            VisitorStats.setProfitEarned(VisitorStats.getProfitEarned()+(80));
                        }
                        System.out.println("...Premium Membership bought successfully...");
                        System.out.println("Total Balance Left ::: ₹" + this.getBalance());
                        this.setMemberShip("premium");
                    }
                    else{
                        System.out.println("....Insufficient Balance...");
                        System.out.println("Current Balance :: ₹"+this.getBalance());
                    }
                }
                else if(Objects.equals(this.getMemberShip().toLowerCase(), "premium")){
                    System.out.println("...You Already Have Premium Membership...");
                }
                else if(Objects.equals(this.getMemberShip().toLowerCase(), "basic") && this.getBalance()>=80){
                    double discountCodeApplicable = Discount.applyDiscountCode(80,couponCode);
                    if(discountCodeApplicable!=-1){
                        this.setBalance(this.getBalance()-discountCodeApplicable);
                        VisitorStats.setProfitEarned(VisitorStats.getProfitEarned()+(discountCodeApplicable));
                    }
                    else{
                        this.setBalance(this.getBalance()-80);
                        VisitorStats.setProfitEarned(VisitorStats.getProfitEarned()+(80));
                    }
                    System.out.println("...Your MemberShip Has been upgraded from basic to premium...");
                    this.setMemberShip("premium");
                    System.out.println("Total Balance Left ::: ₹"+this.getBalance());

                }

            }
            else System.out.println("Error");
        }
        // 3. Buy Tickets
        else if(visitorLoginInput==3){
            if(Attraction.viewAttractionVisitor()==-1) System.out.println();
            else if(this.getMemberShip()==null){
                System.out.println("Buy Basic Membership First To Buy Tickets Or Buy Premium Membership to visit Attractions");
            }
            else if(Objects.equals(this.getMemberShip().toLowerCase(), "premium")){
                System.out.println("Premium members do not need to purchase tickets to visit attractions.");
            }

            else if(Objects.equals(this.getMemberShip().toLowerCase(), "basic")){

                int choice =  HandleExceptions.getInputInRange("Enter Your Choice in range [1-"+Attraction.presentAttractions.size()+"]",1,Attraction.presentAttractions.size());
                int numberOfTickets = HandleExceptions.getInputInRange("Enter number of tickets(+ve value >0) :::",1,Integer.MAX_VALUE);
                System.out.println("Apply CouponCode (enter no or none if no coupon code ) :::");
                String couponCode= sc.nextLine() ;
                if(couponCode==null || Objects.equals(couponCode.toLowerCase(), "no") || Objects.equals(couponCode.toLowerCase(), "none")){
                    System.out.print("");
                }
                Attraction objectFound  = Attraction.presentAttractions.get(choice-1);
                if(objectFound.isOpen()) {
                    double priceTicket = numberOfTickets * objectFound.getTicketPrice();
                    double discountCodeApplicable = Discount.applyDiscountCode(priceTicket, couponCode);

                    if (discountCodeApplicable != -1) {
                        priceTicket = discountCodeApplicable;
                    }
                    if (numberOfTickets > 3 && Admin.isSpecialDeal2()) {
                        priceTicket = (priceTicket - (((double) 30 / 100) * priceTicket));
//
                        System.out.println("Special Deal applied 30% discount since you have bought more than 3 tickets..");
                    } else if (numberOfTickets > 2 && Admin.isSpecialDeal1()) {
                        priceTicket = (priceTicket - (((double) 15 / 100) * priceTicket));

                        System.out.println("Special Deal applied since 15% discount since you have bought more than 2 tickets..");
                    }

                    if (this.getBalance() >= priceTicket) {

                        if (this.boughtTickets.containsKey(objectFound)) {
                            int value = this.boughtTickets.get(objectFound);
                            this.boughtTickets.put(objectFound, value + numberOfTickets);
                        } else {
                            this.boughtTickets.put(objectFound, numberOfTickets);
                        }
                        this.setBalance(this.getBalance() - priceTicket);
                        VisitorStats.setProfitEarned(VisitorStats.getProfitEarned()+priceTicket);
                        System.out.println("....Ticket Bought Successfully....");
                        System.out.println("Balance Left :::"+this.getBalance());
                    } else{
                        System.out.println(".... Insufficient Balance ....");
                        System.out.println("Balance Left :::"+this.getBalance());
                    }

                }
                else System.out.println(".... Cannot Buy Tickets As Attraction Is Already Closed ....");
            }
        }
        // 4. View Discounts
        else if(visitorLoginInput==4){
            Discount.viewForVisitors();
        }
        // 5. View Special Deal
        else if(visitorLoginInput==5){
            UserInterface.presentSpecialDeals();
        }
        // 6. Visit Animal
        else if(visitorLoginInput==6){
            Animal.viewAnimalInVisitor();
            if(Zoo.presentAnimals.size()!=0) {
                int animalChoice = HandleExceptions.getInputInRange("Enter Animal You want to visit in range [1-" +Zoo.presentAnimals.size()+" ]",1,Zoo.presentAnimals.size());
                Animal currAnimal =Zoo.presentAnimals.get(animalChoice-1);
                UserInterface.visitAnimal();
                int choiceFeedORRead = HandleExceptions.getInputInRange("Choose to feed or read about animal (1 or 2 ):::",1,2);
                if(choiceFeedORRead==1){
                    System.out.println("Animal Makes Sound :::");
                    currAnimal.feed();
                    System.out.println("Animal Feed Thanks .....");
                }
                else if(choiceFeedORRead==2){
                    System.out.println("Lets Learn About the Animal ....");
                    currAnimal.read();
                    System.out.println("..... Thanks .....");
                }
                else System.out.println(".....Error..... ");
            }
        }
        // 7. Visit Attraction
        else if(visitorLoginInput==7){
            if(this.getMemberShip()==null) System.out.println("Buy Basic Membership first ...");
            else if(this.getMemberShip().equalsIgnoreCase("premium")){
                if(Attraction.viewAttractionVisitor()==-1) System.out.println("No attractions present ....");
                else{
                    int choice =  HandleExceptions.getInputInRange("Enter Your Choice in range [1-"+Attraction.presentAttractions.size()+"]",1,Attraction.presentAttractions.size());
                    Attraction objectFound  = Attraction.presentAttractions.get(choice-1);
                    if(objectFound.isOpen()){
                        System.out.println("Welcome to the Attraction -> "+ objectFound.getName());
                        System.out.println("Description ->"+objectFound.getDescription());
                    }
                    else System.out.println("At this moment, the attraction is closed. Kindly request the administrator to open it.");
                }
            }
            else if(this.getMemberShip().equalsIgnoreCase("basic")){
                if(Attraction.viewAttractionVisitor()==-1) System.out.println("No Attraction present....");
                else{
                    int choice =  HandleExceptions.getInputInRange("Enter Your Choice in range [1-"+Attraction.presentAttractions.size()+"]",1,Attraction.presentAttractions.size());
                    Attraction objectFound  = Attraction.presentAttractions.get(choice-1);
                    if(objectFound.isOpen()){
                        if(this.boughtTickets.containsKey(objectFound) && this.boughtTickets.get(objectFound)>=1){
                            if(this.boughtTickets.get(objectFound)==1){
                                this.boughtTickets.remove(objectFound);
                                objectFound.setCountOfTicketedVisitors(objectFound.getCountOfTicketedVisitors()+1);
                                System.out.println("Welcome to the Attraction -> "+ objectFound.getName());
                                System.out.println("Description ->"+objectFound.getDescription());
                            }
                            else if(this.boughtTickets.get(objectFound)>1){
                                //One time Usage Ticket
                                this.boughtTickets.put(objectFound,this.boughtTickets.get(objectFound)-1);
                                objectFound.setCountOfTicketedVisitors(objectFound.getCountOfTicketedVisitors()+1);
                                System.out.println("Welcome to the Attraction -> "+ objectFound.getName());
                                System.out.println("Description ->"+objectFound.getDescription());
                            }
                            else {
                                this.boughtTickets.remove(objectFound);
                                System.out.println("... Buy Tickets First ...");
                            }
                        }
                        else System.out.println("..Buy Ticket For the Attraction first .....");
                    }
                    else System.out.println("At this moment, the attraction is closed. Kindly request the administrator to open it.");
                }
            }
            else System.out.println("...Buy At least Basic Membership First To Visit Attractions...");
        }
        // 8.Leave Feedback
        else if(visitorLoginInput==8){
            System.out.println("Enter Feedback that you want to give ::::");
            String feedback = sc.nextLine();
            Feedback newFeedback = new Feedback();
            newFeedback.setFeedback(feedback);
            this.setFeedback(newFeedback);
        }
        // 9. Exit
        else if(visitorLoginInput==9){
            visitorLoginFlag= this.Logout();
        }
        else{
            System.out.println("Error.....");
        }
        return visitorLoginFlag;
    }
    public static boolean isValidOrNot(String email) {

        String regex = ".+@email.com$";
        Pattern patternFound = Pattern.compile(regex);
        Matcher similar = patternFound.matcher(email);

        return similar.matches();
    }
    /**
     * This method handles the registration process for visitors, collecting their information and registering them.
     */
    public static void visitorRegistration(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Visitor Name: ");
        String name = sc.nextLine();
        int age = HandleExceptions.getInputInRange("Enter age +ve value ::",1,Integer.MAX_VALUE);
        System.out.print("Enter Visitor Phone Number: ");
        String phoneNumber = sc.nextLine();
        double balance = HandleExceptions.getInputInRange("Enter Visitor Balance +ve value ::",0,Integer.MAX_VALUE);
        String email;
        while(true){
            System.out.print("Enter Visitor Email: ");
            email = sc.nextLine();
            if(isValidOrNot(email)){
                break;
            }
            else{
                System.out.println("Email should be in format anything@email.com");
            }
        }
        System.out.print("Enter Visitor Password: ");
        String password = sc.nextLine();
        Visitor.register(name,password,age,phoneNumber,balance,email);
    }
    /**
     * Registers a new visitor with the provided information and adds them to the list of present visitors.
     *
     * @param name     The name of the visitor.
     * @param password The password of the visitor.
     * @param age      The age of the visitor.
     * @param phone    The phone number of the visitor.
     * @param balance  The balance of the visitor's account.
     * @param email    The email address of the visitor.
     */
    public static void register(String name, String password, int age, String phone, double balance, String email) {
        // Create a new Visitor instance with the provided information
        Visitor newVisitor = new Visitor(name, password, age, phone, balance, email);
        // Add the new visitor to the list of present visitors
        presentVisitors.add(newVisitor);
    }


    /**
     * This method is used as a flag in case if the user wants to exit.
     * @return returns a true indicating the user wants to log out.
     */
    @Override
    public boolean Logout() {
        System.out.println("Logged Out ....");
        return true;
    }
    /**
     * This method is used to validate the visitor login .
     * If the input details are wrong it will keep asking until right details are given .
     * Prints user-friendly message as well .
     */
    @Override
    public void Login() {
        Scanner sc = new Scanner(System.in);
        boolean loginTry = false;
        while (!loginTry) {
            System.out.println("Enter Visitor  Username:::");
            String name = sc.nextLine();
            System.out.println("Enter Visitor Password:::");
            String password = sc.nextLine();
            boolean loginSuccess = false;
            Visitor newVisitor = null;

            for (int i = 0; i < Visitor.presentVisitors.size(); i++) {
                if (Objects.equals(name, Visitor.presentVisitors.get(i).getName()) && Objects.equals(password, Visitor.presentVisitors.get(i).getPassword())) {
                    newVisitor = Visitor.presentVisitors.get(i);
                    loginSuccess = true;
                    break;
                }
            }
            if (loginSuccess) {
                if(!Zoo.oneTimeCall) {
                    Zoo.addZoo();
                    Zoo.oneTimeCall = true;
                }
                System.out.println("Login Successful....");
                boolean visitorLoginFlag = false;
                while(!visitorLoginFlag){
                    UserInterface.displayVisitorLogin();
                    int visitorLoginInput = HandleExceptions.getInputInRange("Enter your Choice[1-9] ::",1,9);
                    visitorLoginFlag = newVisitor.visitorChoice(visitorLoginInput);
                }
                loginTry = true;

            } else {
                System.out.println("Login Failed Try Again .........");
            }

        }
    }
    /**
     * Get the age of the visitor.
     *
     * @return The age of the visitor.
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the age of the visitor.
     *
     * @param age The age to set for the visitor.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get the phone number of the visitor.
     *
     * @return The phone number of the visitor.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set the phone number of the visitor.
     *
     * @param phone The phone number to set for the visitor.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Get the balance in the visitor's account.
     *
     * @return The balance in the visitor's account.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Set the balance in the visitor's account.
     *
     * @param balance The balance to set for the visitor's account.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Get the email address of the visitor.
     *
     * @return The email address of the visitor.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the email address of the visitor.
     *
     * @param email The email address to set for the visitor.
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Retrieves the feedback associated with this object.
     *
     * @return The feedback as a Feedback object.
     */
    public Feedback getFeedback() {
        return feedback;
    }

    /**
     * Sets the feedback for this object.
     *
     * @param feedback The feedback to be set, provided as a Feedback object.
     */
    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    /**
     * Retrieves the membership information associated with this object.
     *
     * @return The membership information as a String.
     */
    public String getMemberShip() {
        return memberShip;
    }

    /**
     * Sets the membership information for this object.
     *
     * @param memberShip The membership information to be set, provided as a String.
     */
    public void setMemberShip(String memberShip) {
        this.memberShip = memberShip;
    }



}
