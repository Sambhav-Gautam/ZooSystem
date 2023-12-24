//Package of Exceptions.java
package org.errors;

/**
 * Class for custom exceptions for input errors.
 */
public class Exceptions {
    /**
     * This class is custom exception class for handling out-of-range errors and InputMismatchException as well.
     */
    public static class InputOutOfRangeException extends Exception {

        /**
         * Constructs an InputOutOfRangeException with a specified error message.
         *
         * @param message The error message describing the out-of-range input issue.
         */
        public InputOutOfRangeException(String message) {
            super(message);
        }
    }
}
