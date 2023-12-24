package org.Main;

/**
 * This interface defines methods for user actions such as login and logout.
 */
public interface UserAction {

    /**
     * Logs the user out.
     *
     * @return {@code true} if the logout is successful, {@code false} otherwise.
     */
    boolean Logout();

    /**
     * Logs the user in.
     */
    void Login();
}
