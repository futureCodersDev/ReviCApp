package RevAPI.Impl;

import RevAPI.RevActivity;
import RevAPI.RevStudent;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevStudentImpl implements RevStudent {
    private String firstName;
    private String lastName;
    private String profilePicture;
    private String username;
    private String password;
    private Date dateOfBirth;
    private String emailAddress;
    private HashMap<RevActivity, Boolean> completedActivities; //true: Completed, false: Incomplete

    public RevStudentImpl(String firstName, String lastName, String profilePicture, String username, String password, Date dateOfBirth, String emailAddress, HashMap<RevActivity, Boolean> completedActivities) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.profilePicture = profilePicture;
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.completedActivities = completedActivities;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public HashMap<RevActivity, Boolean> getCompletedActivities() {
        return completedActivities;
    }

    public void setCompletedActivities(HashMap<RevActivity, Boolean> completedActivities) {
        this.completedActivities = completedActivities;
    }
}
