package RevisionTest.RevAPI.Impl;


import RevisionTest.RevAPI.Activity.Util.Activity;
import RevisionTest.RevAPI.RevActivity;

import java.util.Date;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevActivityImpl implements RevActivity {
    private String activityName;
    private String description;
    private Date completionDate;
    private int finalResult;
    private Activity activityType;
    private boolean completed;

    public RevActivityImpl(String activityName, String description, Date completionDate, int finalResult, Activity activityType, boolean completed) {
        this.activityName = activityName;
        this.description = description;
        this.completionDate = completionDate;
        this.finalResult = finalResult;
        this.activityType = activityType;
        this.completed = completed;
    }
}