package RevAPI.Activity.Impl;

import RevAPI.Activity.Util.Activity;
import RevAPI.Impl.RevActivityImpl;
import RevAPI.RevActivity;

import java.util.Date;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevRevisionActivityImpl extends RevActivityImpl implements RevActivity {

    public RevRevisionActivityImpl(String activityName, String description, Date completionDate, int finalResult, String resourceURL, Activity activityType) {
        super(activityName, description, completionDate, finalResult, resourceURL, activityType);
    }
}
