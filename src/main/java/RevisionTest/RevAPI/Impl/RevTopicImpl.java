package RevisionTest.RevAPI.Impl;


import RevisionTest.RevAPI.RevTopic;

import java.util.List;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevTopicImpl implements RevTopic {
    private String topicName;
    private String description;
    private List<RevSubtopicImpl> subtopics;

    public RevTopicImpl(String topicName, String description, List<RevSubtopicImpl> subtopics) {

        this.topicName = topicName;
        this.description = description;
        this.subtopics = subtopics;
    }

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

    public List<RevSubtopicImpl> getSubtopics() {
        return subtopics;
    }

    public void setSubtopics(List<RevSubtopicImpl> subtopics) {
        this.subtopics = subtopics;
    }
}
