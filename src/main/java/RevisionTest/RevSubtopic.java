package RevisionTest;

import java.util.*;
import RevisionTest.Util.*;

/**
 * Created by JakeDean on 14/12/2016.
 */
public class RevSubtopic {
    private String name;
    private String description;
    private List<RevActivity> activities; //change to RevActivity later

    //for potential creation of new subtopics
    public RevSubtopic(String name, String description, List<String> activities) {

        this.name = name;
        this.description = description;
        this.activities = initialiseActivities();
    }

    //to create a new subtopic for a topic list
    public RevSubtopic(String name) {

        this.name = name;
        this.description = "";
        this.activities = initialiseActivities();
    }

    //getters and setters
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

    public List<RevActivity> getActivities() {
        return activities;
    }
    public void setActivities(List<RevActivity> activities) {
        this.activities = activities;
    }

    //initialisation
    private List<RevActivity> initialiseActivities(){
        List<RevActivity> activities = new ArrayList<RevActivity>();
        //generate random list of three activities for the chosen subtopic
        if(this.name == "Simultaneous Equations") {
            activities.add(new RevActivity("Activity 1"));
            activities.add(new RevActivity("Activity 2"));
            activities.add(new RevActivity("Activity 3"));
        }

        return activities;
    }
}
