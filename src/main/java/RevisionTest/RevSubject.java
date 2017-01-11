package RevisionTest;

import java.util.*;
import RevisionTest.Util.*;

public class RevSubject {

    private String subjectName;  //taken from list in subjectTable
    private Examboard examboard;  //from database
    private Level level; //GCSE or ALevel
    private List<String> topics;  //change to RevTopic when implemented

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

    public List<String> getTopics() {
        return topics;
    }
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }{}

    //initialisation - set up topic list from database
    private List<String> initialiseTopics(){
        List<String> topic_List = new ArrayList<String>();  //change to RevTopic lists
        //adapt for database search
        topic_List.add("Algebra");
        topic_List.add("Shape and space");
        topic_List.add("Measure");
        topic_List.add("Number");
        topic_List.add("Statistics");

        return topic_List;
    }
}