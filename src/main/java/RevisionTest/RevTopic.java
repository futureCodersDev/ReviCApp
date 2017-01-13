package RevisionTest;

import java.util.*;
import RevisionTest.Util.*;

/**
 * Created by JakeDean on 14/12/2016.
 */
public class RevTopic {
    private String topicName;
    private String description;
    private List<RevSubtopic> subtopics;  //Replace with RevSubTopics once implemented

    //constructor leading to creation of a new topic - needs to know which subject it is linked to
    public RevTopic(String topicName, String description, List<RevSubtopic> subtopics) {

        this.topicName = topicName;
        this.description = description;
        this.subtopics = initialiseSubTopics();
    }

    //constructor leading to search database on subjectName for list of topics related to that subject
    public RevTopic(String topicName) {

        this.topicName = topicName;
        this.description = "";  //not yet used
        this.subtopics = initialiseSubTopics();
    }

    //getters and setters
    public String getTopicName() {
        return topicName;
    }
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public List<RevSubtopic> getSubtopics() {
        return subtopics;
    }
    public void setSubtopics(List<RevSubtopic> subtopics) {
        this.subtopics = subtopics;
    }

    //set up initial list of subtopics from database search
    private List<RevSubtopic> initialiseSubTopics(){
        List<RevSubtopic> subtopic_List = new ArrayList<RevSubtopic>();  //change to RevTopic lists
        //adapt for database search
        if(topicName == "Algebra") {
            subtopic_List.add(new RevSubtopic("Linear Equation"));
            subtopic_List.add(new RevSubtopic("Simultaneous Equations"));
            subtopic_List.add(new RevSubtopic("Quadratic Equations"));
        }

        return subtopic_List;
    }
}
