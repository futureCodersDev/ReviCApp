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
    private List<RevTopic> topics;

    public RevSubjectImpl(String subjectName, Examboard examboard, Level level, List<RevTopic> topics) {
        this.subjectName = subjectName;
        this.examboard = examboard;
        this.level = level;
        this.topics = topics;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public Examboard getExamboard() {
        return examboard;
    }

    public Level getLevel() {
        return level;
    }

    public List<RevTopic> getTopics() {
        return topics;
    }
}
