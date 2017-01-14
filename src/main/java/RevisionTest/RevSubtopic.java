package RevisionTest;

import java.util.*;
import RevisionTest.Util.*;

/**
 * Created by JakeDean on 14/12/2016.
 */
public class RevSubtopic {
    private String name;
    private String description;
    private int numActivities;
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
        this.numActivities = 3;
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
        List<RevActivity> allActivities = new ArrayList<RevActivity>();

        //get a list of all activities for this subject from database - REPLACE THIS CODE ***
        if(this.name == "Simultaneous Equations") {
            allActivities.add(new RevActivity("VID1"));
            allActivities.add(new RevActivity("PPQ1"));
            allActivities.add(new RevActivity("MCQ1"));
        }
        return generateRandomActivityList(this.numActivities, allActivities);
    }

    private List<RevActivity> generateRandomActivityList(int numActivities, List<RevActivity> activityList){
        List<RevActivity> shortList = new ArrayList<RevActivity>();
        //generate <numActivities> different random numbers between 0 and list length
        List<Integer> selectedNums = new ArrayList<Integer>();
        //REPLACE with random number generation code ***
        selectedNums.add(0);selectedNums.add(1);selectedNums.add(2);
        //add the activities from those positions in the activityList to a new list
        /*
        for(int i:selectedNums){
            if(i<this.numActivities) {
                shortList.add(activityList.get(i));
            }
        }
        */
        return activityList; //shortList;
    }
}
