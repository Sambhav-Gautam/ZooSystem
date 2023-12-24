package org.Main;

/**
 * The abstract User class serves as a base class for user-related functionality.
 */
public abstract class User {
    private String name;
    private String password;

    /**
     * Parameterized constructor for the `User` class.
     * @param name     The name of the user.
     * @param password The password of the user.
     */
    public User(String name, String password) {
        setName(name);
        setPassword(password);
    }

    /**
     * Default constructor for the User class.
     */
    public User() {

    }

    /**
     * Get the name of the user.
     * @return The user's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the user.
     * @param name The user's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the password of the user.
     * @return The user's password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the password of the user.
     *
     * @param password The user's password.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
