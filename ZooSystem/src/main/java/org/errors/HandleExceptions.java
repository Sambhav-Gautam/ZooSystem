//Package of HandleExceptions.java
package org.errors;

//Header Files Required
import java.util.InputMismatchException;
import java.util.Scanner;
//Header Files Required

/**
 * The HandleExceptions class provides a method in case if a user give input out of range
 * and also  handles InputMismatchException and will take input until the user gives it withing range and correct type.
 */
public class HandleExceptions {

    /**
     * Get user input within the specified range, re-prompting the user until valid input is provided.
     *
     * @param prompt Message the developer wants to display to user.
     * @param min    Minimum value that is permitted by the program (inclusive).
     * @param max    Maximum value that is permitted by the program (inclusive)
     * @return Input that is valid and in the range.
     */
    public static int getInputInRange(String prompt, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println(prompt);
                userInput = sc.nextInt();
                if (userInput < min || userInput > max) {
                    throw new Exceptions.InputOutOfRangeException("Input is not in the range [" + min + ", " + max + "]");
                }
                validInput = true;
            } catch (InputMismatchException e) {
                System.err.println("Input Mismatch Error: " + e.getMessage());
                sc.nextLine(); // Consume the invalid input
            } catch (Exceptions.InputOutOfRangeException e) {
                System.err.println("Input Range Error: " + e.getMessage());
                sc.nextLine(); // Consume the invalid input
            }
        }
        return userInput;
    }

    /**
     * Prompts the user for input within a specified range and returns the input as a percentage.
     * @param prompt The prompt message to display to the user.
     * @param min The minimum valid percentage.
     * @param max The maximum valid percentage.
     * @return The user's input as a percentage within the specified range.
     */
    public static int correctPercentage(String prompt, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println(prompt);
                userInput = sc.nextInt();
                if (userInput < min || userInput > max) {
                    throw new Exceptions.InputOutOfRangeException("Percentage is not in the range [" + min + ", " + max + "]");
                }
                validInput = true;
            } catch (InputMismatchException e) {
                System.err.println("Input Mismatch Error: " + e.getMessage());
                sc.nextLine(); // Consume the invalid input
            } catch (Exceptions.InputOutOfRangeException e) {
                System.err.println("Input Range Error: " + e.getMessage());
                sc.nextLine(); // Consume the invalid input
            }
        }

        return userInput;
    }
}
