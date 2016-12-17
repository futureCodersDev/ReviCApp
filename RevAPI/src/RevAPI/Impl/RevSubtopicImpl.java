package RevAPI.Impl;

import RevAPI.RevActivity;
import RevAPI.RevSubtopic;

import java.util.List;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevSubtopicImpl implements RevSubtopic {
    private String name;
    private String description;
    private List<RevActivity> activities;

    public RevSubtopicImpl(String name, String description, List<RevActivity> activities) {
        this.name = name;
        this.description = description;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<RevActivity> getActivities() {
        return activities;
    }
}
