package RevAPI.Impl;

import RevAPI.Activity.Util.Activity;
import RevAPI.RevActivity;

import java.net.URL;
import java.util.Date;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevActivityImpl implements RevActivity {
    private String activityName;
    private String description;
    private Activity activityType;
    private Date completionDate;
    private int finalResult;
    private URL resourceURL;

    public RevActivityImpl(String activityName, String description, Activity activityType, Date completionDate, int finalResult, URL resourceURL) {
        this.activityName = activityName;
        this.description = description;
        this.activityType = activityType;
        this.completionDate = completionDate;
        this.finalResult = finalResult;
        this.resourceURL = resourceURL;
    }

    public String getActivityName() {
        return activityName;
    }

    public String getDescription() {
        return description;
    }

    public Activity getActivityType() {
        return activityType;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public int getFinalResult() {
        return finalResult;
    }

    public URL getResourceURL() {
        return resourceURL;
    }
}
