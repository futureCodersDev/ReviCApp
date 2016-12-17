package RevAPI.Activity.Quiz;

import java.util.HashMap;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class QuizMCQuestion {
    private String question;
    private HashMap<String, Boolean> answers; //<question, correct answer>
    private String feedback;
    private int pointValue;

    public QuizMCQuestion(String question, HashMap<String, Boolean> answers, String feedback, int pointValue) {
        this.question = question;
        this.answers = answers;
        this.feedback = feedback;
        this.pointValue = pointValue;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public HashMap<String, Boolean> getAnswers() {
        return answers;
    }

    public void setAnswers(HashMap<String, Boolean> answers) {
        this.answers = answers;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
}
