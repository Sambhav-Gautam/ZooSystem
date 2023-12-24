//Package of VisitorStats.java
package org.Main;


//Header Files Required
import java.util.ArrayList;
//Header Files Required

/**
 * VisitorStats class provides statistics related to the visitors and attractions in the zoo.
 * It tracks the number of visitors and profit earned.
 */
public class VisitorStats {
    private static int numberOfVisitors;
    private static double profitEarned =0.0;

    /**
     * Returns the list of attractions that are most visited by visitors.
     *
     * @return An ArrayList of attractions that have the highest number of visitors.
     */
    public static ArrayList<Attraction> mostVisitedAttractions() {
        int maxVisitors = -1; // Initialize with a value lower than the possible count
        ArrayList<Attraction> maxVisitedAttractions = new ArrayList<>();

        for (Attraction presentAttraction : Attraction.presentAttractions) {
            int visitors = presentAttraction.getCountOfTicketedVisitors();
            if (visitors > maxVisitors) {
                maxVisitors = visitors;
                maxVisitedAttractions.clear(); // Clear the list, as we found a new max
                maxVisitedAttractions.add(presentAttraction);
            } else if (visitors == maxVisitors) {
                maxVisitedAttractions.add(presentAttraction);
            }
        }

        if (maxVisitedAttractions.isEmpty()) {
            System.out.println("Every attraction has no visitors.");
        }

        return maxVisitedAttractions;
    }

    /**
     * Retrieves the total number of visitors to the zoo.
     *
     * @return The total number of visitors.
     */
    public static int getNumberOfVisitors() {
        return numberOfVisitors;
    }

    /**
     * Sets the total number of visitors to the zoo.
     *
     * @param numberOfVisitors The total number of visitors to be set.
     */
    public static void setNumberOfVisitors(int numberOfVisitors) {
        VisitorStats.numberOfVisitors = numberOfVisitors;
    }

    /**
     * Retrieves the total profit earned from visitors.
     *
     * @return The total profit earned.
     */
    public static double getProfitEarned() {
        return profitEarned;
    }

    /**
     * Sets the total profit earned from visitors.
     *
     * @param profitEarned The total profit earned to be set.
     */
    public static void setProfitEarned(double profitEarned) {
        VisitorStats.profitEarned = profitEarned;
    }
}
