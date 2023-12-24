//Package of Feedback.java
package org.Main;

/**
 * Represents feedback provided by users.
 */
public class Feedback {
    private String feedback;

    /**
     * Gets the feedback.
     *
     * @return The feedback provided by the user.
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * Sets the feedback.
     *
     * @param feedback The feedback to set.
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * Returns the feedback as a string.
     *
     * @return The feedback as a string.
     */
    @Override
    public String toString() {
        return getFeedback();
    }
}
