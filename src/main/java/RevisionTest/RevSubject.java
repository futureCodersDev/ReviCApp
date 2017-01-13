package RevisionTest;

import java.util.*;
import RevisionTest.Util.*;

public class RevSubject {

    private String subjectName;  //taken from list in subjectTable
    private Examboard examboard;  //from database
    private Level level; //GCSE or ALevel
    private List<RevTopic> topics;  //change to RevTopic when implemented

    //full parameter list for when UI adapted to include choice of exam board and level
    public RevSubject(String subjectName, Examboard examboard, Level level) {

        this.subjectName = subjectName;
        this.examboard = examboard;
        this.level = level;
        this.topics = initialiseTopics();
    }

    //search database on subjectName for list of topics related to that subject
    public RevSubject(String subjectName) {

        this.subjectName = subjectName;
        this.examboard = Examboard.AQA;
        this.level = Level.GCSE;
        this.topics = initialiseTopics();
    }

    //getters and setters
    public String getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Examboard getExamboard() {
        return examboard;
    }
    public void setExamboard(Examboard examboard) {
        this.examboard = examboard;
    }

    public Level getLevel() {
        return level;
    }
    public void setLevel(Level level) {
        this.level = level;
    }

    public List<RevTopic> getTopics() {
        return topics;
    }
    public void setTopics(List<RevTopic> topics) {
        this.topics = topics;
    }{}

    //initialisation - set up topic list from database
    private List<RevTopic> initialiseTopics(){
        List<RevTopic> topic_List = new ArrayList<RevTopic>();  //change to RevTopic lists
        //adapt for database search
        if(subjectName == "Maths") {    //remove after testing
            topic_List.add(new RevTopic("Algebra"));
            topic_List.add(new RevTopic("Number"));
            topic_List.add(new RevTopic("Ratio"));
            topic_List.add(new RevTopic("Proportion and rates of change"));
            topic_List.add(new RevTopic("Geometry and measures"));
            topic_List.add(new RevTopic("Probability"));
            topic_List.add(new RevTopic("Statistics"));
        }
        return topic_List;
    }
}