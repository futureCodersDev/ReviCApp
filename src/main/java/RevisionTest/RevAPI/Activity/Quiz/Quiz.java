package RevAPI.Activity.Quiz;

import java.util.List;

/**
 * Created by fcuser1 on 14/12/2016.
 * Contains 5 questions, 4 of which are multiple choice, 1 is written.
 */
public class Quiz {

    private List<QuizMCQuestion> multichoiceQuestions;
    private QuizWrittenQuestion writtenQuestion;
    private String description;
    private int result;

    public Quiz(List<QuizMCQuestion> multichoiceQuestions, QuizWrittenQuestion writtenQuestion, String description, int result) {
        this.multichoiceQuestions = multichoiceQuestions;
        this.writtenQuestion = writtenQuestion;
        this.description = description;
        this.result = result;
    }

    public List<QuizMCQuestion> getMultichoiceQuestions() {
        return multichoiceQuestions;
    }

    public QuizWrittenQuestion getWrittenQuestion() {
        return writtenQuestion;
    }

    public String getDescription() {
        return description;
    }

    public int getResult() {
        return result;
    }
}
