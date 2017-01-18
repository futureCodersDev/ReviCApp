package RevisionTest.RevAPI.Activity.Impl;


import RevisionTest.RevAPI.Activity.Util.Activity;
import RevisionTest.RevAPI.Impl.RevActivityImpl;
import RevisionTest.RevAPI.RevActivity;

import java.util.Date;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevRevisionActivityImpl extends RevActivityImpl implements RevActivity {


    public RevRevisionActivityImpl(String activityName, String description, Date completionDate, int finalResult, Activity activityType, boolean completed) {
        super(activityName, description, completionDate, finalResult, activityType, completed);
    }
}
