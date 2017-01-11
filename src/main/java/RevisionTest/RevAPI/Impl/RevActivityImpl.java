package RevAPI.Impl;

import RevAPI.Activity.Util.Activity;
import RevAPI.RevActivity;

import java.util.Date;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevActivityImpl implements RevActivity {
    private String activityName;
    private String description;
    private Date completionDate;
    private int finalResult;
    private String resourceURL;
    private Activity activityType;
    private String fromYear;

    public RevActivityImpl(String activityName, String description, Date completionDate, int finalResult, String resourceURL, Activity activityType, String fromYear) {

        this.activityName = activityName;
        this.description = description;
        this.completionDate = completionDate;
        this.finalResult = finalResult;
        this.resourceURL = resourceURL;
        this.activityType = activityType;
        this.fromYear = fromYear;
    }

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