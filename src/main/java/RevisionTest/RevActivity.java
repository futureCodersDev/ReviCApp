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
    private String resourceID;
    private Activity activityType;


    public RevActivity(String activityName, String description, Date completionDate, int finalResult, int maxResult, String resourceID, Activity activityType) {
        this.activityName = activityName;
        this.description = description;
        this.completionDate = completionDate;
        this.finalResult = finalResult;
        this.maxResult = maxResult;
        this.resourceID = resourceID;
        this.activityType = activityType;
    }

    public RevActivity(String activityName){
        this.activityName = activityName;
        this.description = "";
        this.completionDate = new Date();
        this.finalResult = 0;
        this.maxResult = 5;
        this.resourceID = resourceID;
        this.activityType = Activity.QUIZ;
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

    public String getResourceID() {
        return resourceID;
    }
    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }

    public Activity getActivityType() {
        return activityType;
    }
    public void setActivityType(Activity activityType) {
        this.activityType = activityType;
    }


    //get resource
    public RevVidResource generateVidResource(String resourceID) {
        RevVidResource vidContent = new RevVidResource(resourceID);
        return vidContent;
    }

    public RevPpqResource generatePpqContent(String resourceID) {
        RevPpqResource ppqContent = new RevPpqResource(resourceID);
        return ppqContent;
    }

//    public RevMcqResource generateMcqContent(String resourceID){
//        RevMcqResource mcqContent = new RevMcqResource(resourceID);
//        return McqContent;
//    }
}