package shared.communication;

import shared.model.*;

// TODO: Auto-generated Javadoc
/**
 * The Class ValidateUserCredentials.
 */
public class ValidateUserCredentials {
    
    /** The username. */
    private String username;
    
    /** The password. */
    private String password;

    /**
     * Instantiates a new validate user credentials.
     *
     * @param u the u
     * @param p the p
     */
    public ValidateUserCredentials(String u, String p) {
        username = u;
        password = p;
    }

    /**
     * gets username.
     *
     * @return -> returns the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * sets username.
     *
     * @param s            -> new username
     */
    public void setUsername(String s) {
        username = s;
    }

    /**
     * gets password.
     *
     * @return -> returns the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * sets password.
     *
     * @param s            -> new password
     */
    public void setPassword(String s) {
        password = s;
    }

    /**
     * Gets the user.
     *
     * @return the user
     */
    public User getUser() {
        User user = new User();
        return user;
    }
}
