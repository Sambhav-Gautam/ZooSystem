//Package for Discount.java
package org.Main;

//Header files Required
import org.errors.HandleExceptions;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
//Header files Required

/**
 * The Discount class provides different methods that for admin to add remove modify and view Discounts
 * and also discountCategory , discountPercentage and couponCode as data Members
 */
public class Discount implements ModifyInterface {
    private String discountCategory;
    private int discountPercentage;
    private String couponCode;

    static ArrayList<Discount> presentDiscounts = new ArrayList<>();
    /**
     * Initializes a new Discount with the specified discount category and percentage.
     * It also generates a coupon code based on the category and percentage.
     *
     * @param discountCategory   The category of the discount.
     * @param discountPercentage The percentage value of the discount.
     */
    public Discount(String discountCategory, int discountPercentage) {
        this.discountCategory = discountCategory;
        this.discountPercentage = discountPercentage;
        // Generate a coupon code based on the category and percentage
        setCouponCode((discountCategory.toUpperCase() + this.getDiscountPercentage()));
    }


    /**
     * Searches for a discount by its category in the list of present discounts.
     *
     * @param discountCategory The category of the discount to search for.
     * @return The index of the discount with the specified category, or -1 if not found.
     */
    public static int search(String discountCategory) {
        for (int i = 0; i < presentDiscounts.size(); i++) {
            if (Objects.equals(presentDiscounts.get(i).getDiscountCategory().toLowerCase(), discountCategory.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Searches for a discount by its category in the list of present discounts and apply discount if coupon code is valid.
     *
     * @param balance The price where coupon code will be applied .
     * @param discountCode code entered by the user
     * @return The index of the discount with the specified category, or -1 if not found.
     */
    public static double applyDiscountCode(double balance, String discountCode){
        double percentage ;
        for(Discount currDiscount : presentDiscounts){
            if(Objects.equals(currDiscount.couponCode.toLowerCase(), discountCode.toLowerCase())){
                percentage = currDiscount.getDiscountPercentage();
                return (balance - ((percentage/100)*balance)) ;
            }
        }
       return -1;
    }
    /**
     * Prints all discount codes available.
     */
    public static void viewForVisitors(){
        if(presentDiscounts.size()==0) System.out.println("No Discount Available ...");
        else{
            int counting = 1;
            for(Discount available: presentDiscounts){
                System.out.print(counting+". ");
                System.out.println(available.discountCategory+"("+available.discountCategory+"%"+available.discountPercentage +")-"+available.getCouponCode());
            }
        }
    }

    /**
     * Prints all Discount Code with category and percentage.
     */
    public static void view(){
        if(presentDiscounts.size()==0) System.out.println("No Discounts Available...");
        else{
            for(Discount available: presentDiscounts){
                System.out.println("Discount Category :::"+available.discountCategory);
                System.out.println("Discount Percentage :::"+available.discountPercentage);
            }
        }

    }

    /**
     * Adds the discounts to presentDiscounts ArrayList .
     */
    @Override
    public void add() {
        presentDiscounts.add(this);
        System.out.println("Discount Has been added Successfully .....");

    }

    /**
     * Ask for new name and new percentage and modifies the discount accordingly .
     */
    @Override
    public void modify() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new discount Category :::");
        String newDiscountCategory = sc.nextLine();
        System.out.println("Enter the new  Discount Percentage :::");
        int newDiscountPercentage = HandleExceptions.correctPercentage("Enter Discount Percentage [1-100]",1,100);
        this.setDiscountCategory(newDiscountCategory);
        this.setDiscountPercentage(newDiscountPercentage);
        System.out.println("Discount Has Been Modified successfully .....");
    }

    /**
     * Remove the discount from the presentDiscounts ArrayList .
     */
    @Override
    public void remove() {
        presentDiscounts.remove(this);
        System.out.println("Discount Has been Removed Successfully ......");
    }

    /**
     * Retrieves the category of the discount.
     *
     * @return The category of the discount.
     */
    public String getDiscountCategory() {
        return discountCategory;
    }


    /**
     * Sets the Category of the discount
     * @param discountCategory discount category that needs to be set
     */
    public void setDiscountCategory(String discountCategory) {
        this.discountCategory = discountCategory;
    }
    /**
     * Retrieves the Percentage of the discount.
     *
     * @return The Percentage of the discount.
     */
    public int getDiscountPercentage() {
        return discountPercentage;
    }
    /**
     * Sets the Percentage of the discount.
     *
     */
    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    /**
     * Retrieves the couponCode of the discount.
     *
     * @return The Cop of the discount.
     */
    public String getCouponCode() {
        return couponCode;
    }
    /**
     * Sets the Coupon Code of the discount.
     *
     */
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }
}
