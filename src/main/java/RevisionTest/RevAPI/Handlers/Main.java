package RevAPI.Handlers;

import RevAPI.Activity.Impl.*;
import RevAPI.Activity.Quiz.QuizMCQuestion;
import RevAPI.Activity.Quiz.QuizWrittenQuestion;
import RevAPI.Activity.Util.Activity;
import RevAPI.Impl.*;
import RevAPI.RevCoreBuilder;
import RevAPI.Util.Examboard;
import RevAPI.Util.Level;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by fcuser1 on 14/12/2016.
 * Manages the initialization of the RevAPI
 */
public class Main {
    private static RevCoreImpl rc;

    public static void main(String[] args) {
        List<RevSubjectImpl> subjects = new ArrayList<>();
        List<RevStudentImpl> students = new ArrayList<>();
        List<RevTopicImpl> topics = new ArrayList<>();
        List<RevSubtopicImpl> subtopics = new ArrayList<>();
        List<RevActivityImpl> activities = new ArrayList<>();
        List<QuizMCQuestion> mcQuestions = new ArrayList<>();
        List<String> keyTerms = new ArrayList<>();

        keyTerms.add("Keyterm 1");
        keyTerms.add("Keyterm 2");
        keyTerms.add("Keyterm 3");

        activities.add(new RevExampleActivityImpl("An Example activity", "An example activity", new Date(), 10, "A URL to the resource", Activity.EXAMPLES));
        activities.add(new RevGameActivityImpl("A Game activity", "A Game activity", new Date(), 5, "A URL to the resource", Activity.GAME));
        activities.add(new RevQuizActivityImpl("A Quiz activity", "A Quiz activity", new Date(), 20, "A URL to the resource", Activity.QUIZ, mcQuestions, new QuizWrittenQuestion("For x in y, find z", "...Impossible!", keyTerms, "Your feedback...", 25), 50));
        activities.add(new RevRevisionActivityImpl("A Revision activity", "A Revision activity", new Date(), 25, "A URL to the resource", Activity.REVISION));
        activities.add(new RevVideoActivityImpl("A Video activity", "A Video activity", new Date(), 30, "A URL to the resource", Activity.VIDEO));

        subtopics.add(new RevSubtopicImpl("Linear Equations", "Linear Equations", activities));
        topics.add(new RevTopicImpl("Algebra", "Relates to Algebra and Algebraic Equations", subtopics));

        subjects.add(new RevSubjectImpl("Mathematics", Examboard.EDEXCEL, Level.GCSE, topics));

        rc = RevCoreBuilder.getCore();
    }
}
