package RevAPI.Handlers;

import RevAPI.Activity.Impl.RevQuizActivityImpl;
import RevAPI.Activity.Impl.RevVideoActivityImpl;
import RevAPI.Activity.Quiz.QuizMCQuestion;
import RevAPI.Activity.Quiz.QuizWrittenQuestion;
import RevAPI.Activity.Util.Activity;
import RevAPI.Impl.*;
import RevAPI.RevActivity;
import RevAPI.RevCoreBuilder;
import RevAPI.RevSubtopic;
import RevAPI.RevTopic;
import RevAPI.Util.Examboard;
import RevAPI.Util.Level;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by fcuser1 on 14/12/2016.
 * Manages the initialization of the RevAPI
 */
public class Main {
    private static RevCoreImpl rc;

    public static void main(String[] args) {
        List<RevActivityImpl> activities = new ArrayList<>();
        List<RevTopic> topics = new ArrayList<>();
        List<RevSubtopic> subtopics = new ArrayList<>();
        List<RevSubjectImpl> subjects = new ArrayList<>();

        List<RevStudentImpl> students = new ArrayList<>();

        HashMap<RevActivity, Boolean> stuActivities = new HashMap<>();

        List<QuizMCQuestion> mcQuestions = new ArrayList<>();

        HashMap<String, Boolean> answers = new HashMap<>();

        List<String> keyTerms = new ArrayList<>();
        activities.add(new RevQuizActivityImpl("A quiz", "A simple quiz!", new Date(), 10, "A URL", Activity.QUIZ, mcQuestions, new QuizWrittenQuestion("Question 2", "A model answer", keyTerms, "", 30), 10));
        activities.add(new RevVideoActivityImpl("video activity", "A video activity", new Date(), 3, "URL", Activity.VIDEO));
        answers.put("Answer 1", false);
        answers.put("Answer 2", true);
        answers.put("Answer 3", false);

        keyTerms.add("Key term 1");
        keyTerms.add("Key term 2");

        mcQuestions.add(new QuizMCQuestion("A question", answers, "", 20));

        subtopics.add(new RevSubtopicImpl("Simultaneous Equations", "Finding the missing values", activities));

        topics.add(new RevTopicImpl("Algebra", "Working with non-numerical characters", subtopics));

        subjects.add(new RevSubjectImpl("Mathematics", Examboard.EDEXCEL, Level.GCSE, topics));

        Boolean b = false;
        for (RevActivity r : activities) {
            b = !b;
            stuActivities.put(r, b);

            /*
            Iterates through activities, adds to the HashMap,
            flipping the Boolean between false and true for each iteration
             */
        }


        students.add(new RevStudentImpl("John", "Doe", "URL to Profile Picture", "JohnDoe47", "12345", new Date(), "johndoe47@gmail.com", stuActivities));

        rc = RevCoreBuilder.getCore(activities, subjects, students);
        RevQuizActivityImpl r;

        System.out.println("Size of activities list: " + rc.getActivities().size());
        switch (rc.getActivities().get(0).getActivityType()) {
            case EXAMPLES:
            case GAME:
            case QUIZ:
                r = ((RevQuizActivityImpl) rc.getActivities().get(0));

                System.out.println("Value for answer 2: " + r.getMultichoiceQuestions().get(0).getAnswers().get("Answer 2"));
            case REVISION:
            case VIDEO:
        }
        System.out.println("The first student's completion list for the currently added activities: ");
        for (RevActivityImpl actv : rc.getActivities()) {
            System.out.println(actv.getActivityName() + ": " + rc.getStudents().get(0).getCompletedActivities().get(actv));
        }
    }
}
