package RevisionTest;

import java.util.*;
import RevisionTest.Util.*;

/**
 * Created by JakeDean on 14/12/2016.
 */
public class RevActivity {
    private String activityName;
    private String description;
    private Date completionDate;
    private int finalResult;
    private int maxResult;  //added to allow progress to be shown
    private String resourceURL;
    private Activity activityType;
    private String fromYear;

    public RevActivity(String activityName, String description, Date completionDate, int finalResult, String resourceURL, Activity activityType, String fromYear) {
        this.activityName = activityName;
        this.description = description;
        this.completionDate = completionDate;
        this.finalResult = finalResult;
        this.resourceURL = resourceURL;
        this.activityType = activityType;
        this.fromYear = fromYear;
    }

    public RevActivity(String activityName){
        this.activityName = activityName;
        this.description = "";
        this.completionDate = new Date();
        this.finalResult = 0;
        this.maxResult = 5;
        this.resourceURL = resourceURL;
        this.activityType = Activity.QUIZ;
        this.fromYear = fromYear;
    }

    //getters and setters
    public String getActivityName() {
        return activityName;
    }
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCompletionDate() {
        return completionDate;
    }
    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public int getFinalResult() {
        return finalResult;
    }
    public void setFinalResult(int finalResult) {
        this.finalResult = finalResult;
    }

    public int getMaxResult() {
        return maxResult;
    }
    public void setMaxResult(int maxResult) {
        this.maxResult = maxResult;
    }

    public String getResourceURL() {
        return resourceURL;
    }
    public void setResourceURL(String resourceURL) {
        this.resourceURL = resourceURL;
    }

    public Activity getActivityType() {
        return activityType;
    }
    public void setActivityType(Activity activityType) {
        this.activityType = activityType;
    }

    public String getFromYear() {
        return fromYear;
    }
    public void setFromYear(String fromYear) {
        this.fromYear = fromYear;
    }
}