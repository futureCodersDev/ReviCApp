package RevAPI.Impl;

import RevAPI.RevSubtopic;
import RevAPI.RevTopic;

import java.util.List;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevTopicImpl implements RevTopic {
    private String topicName;
    private String description;
    private List<RevSubtopic> subtopics;

    public RevTopicImpl(String topicName, String description, List<RevSubtopic> subtopics) {
        this.topicName = topicName;
        this.description = description;
        this.subtopics = subtopics;
    }

    public String getTopicName() {
        return topicName;
    }

    public String getDescription() {
        return description;
    }

    public List<RevSubtopic> getSubtopics() {
        return subtopics;
    }
}
