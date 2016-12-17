package RevAPI.Activity.Quiz;

import java.util.List;

/**
 * Created by fcuser1 on 14/12/2016.
 * A question requiring the user's written answer.
 */
public class QuizWrittenQuestion {
    private String question;
    private String modelAnswer; //An example answer
    private List<String> keyTerms;
    private String feedback;
    private int pointValue; //The value of the question, in points

    public QuizWrittenQuestion(String question, String modelAnswer, List<String> keyTerms, String feedback, int pointValue) {
        this.question = question;
        this.modelAnswer = modelAnswer;
        this.keyTerms = keyTerms;
        this.feedback = feedback;
        this.pointValue = pointValue;
    }

    public String getQuestion() {
        return question;
    }

    public String getModelAnswer() {
        return modelAnswer;
    }

    public List<String> getKeyTerms() {
        return keyTerms;
    }

    public String getFeedback() {
        return feedback;
    }

    public int getPointValue() {
        return pointValue;
    }
}
