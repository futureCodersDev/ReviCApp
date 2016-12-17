package RevAPI.Impl;

import RevAPI.RevSubject;
import RevAPI.RevTopic;
import RevAPI.Util.Examboard;
import RevAPI.Util.Level;

import java.util.List;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevSubjectImpl implements RevSubject {
    private String subjectName;
    private Examboard examboard;
    private Level level;
    private List<RevTopicImpl> topics;

    public RevSubjectImpl(String subjectName, Examboard examboard, Level level, List<RevTopicImpl> topics) {

        this.subjectName = subjectName;
        this.examboard = examboard;
        this.level = level;
        this.topics = topics;
    }

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

    public List<RevTopicImpl> getTopics() {
        return topics;
    }

    public void setTopics(List<RevTopicImpl> topics) {
        this.topics = topics;
    }
}
