package RevisionTest.RevAPI.Impl;


import RevisionTest.RevAPI.RevSubtopic;

import java.util.List;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevSubtopicImpl implements RevSubtopic {
    private String name;
    private String description;
    private List<RevActivityImpl> activities;

    public RevSubtopicImpl(String name, String description, List<RevActivityImpl> activities) {

        this.name = name;
        this.description = description;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<RevActivityImpl> getActivities() {
        return activities;
    }

    public void setActivities(List<RevActivityImpl> activities) {
        this.activities = activities;
    }
}
