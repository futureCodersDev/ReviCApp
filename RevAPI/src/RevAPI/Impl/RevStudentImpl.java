package RevAPI.Impl;

import RevAPI.RevActivity;
import RevAPI.RevStudent;

import java.net.URL;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevStudentImpl implements RevStudent {
    private String name;
    private URL profilePicture;
    private String username;
    private String password;
    private Date dateOfBirth;
    private String emailAddress;
    private int schoolYear;
    private HashMap<RevActivity, Boolean> completedActivities; //true: Completed, false: Incomplete

    public RevStudentImpl(String name, URL profilePicture, String username, String password, Date dateOfBirth, String emailAddress, int schoolYear, HashMap<RevActivity, Boolean> completedActivities) {
        this.name = name;
        this.profilePicture = profilePicture;
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.schoolYear = schoolYear;
        this.completedActivities = completedActivities;
    }

    public String getName() {
        return name;
    }

    public URL getProfilePicture() {
        return profilePicture;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public HashMap<RevActivity, Boolean> getCompletedActivities() {
        return completedActivities;
    }
}
