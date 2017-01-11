package RevAPI.Activity.Impl;

import RevAPI.Activity.Quiz.QuizMCQuestion;
import RevAPI.Activity.Quiz.QuizWrittenQuestion;
import RevAPI.Activity.Util.Activity;
import RevAPI.Impl.RevActivityImpl;
import RevAPI.RevActivity;

import java.util.Date;
import java.util.List;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevQuizActivityImpl extends RevActivityImpl implements RevActivity {
    private List<QuizMCQuestion> multichoiceQuestions;
    private QuizWrittenQuestion writtenQuestion;
    private int result;

    public RevQuizActivityImpl(String activityName, String description, Date completionDate, int finalResult, String resourceURL, Activity activityType, List<QuizMCQuestion> multichoiceQuestions, QuizWrittenQuestion writtenQuestion, int result) {
        super(activityName, description, completionDate, finalResult, resourceURL, activityType);
        this.multichoiceQuestions = multichoiceQuestions;
        this.writtenQuestion = writtenQuestion;
        this.result = result;
    }

    public List<QuizMCQuestion> getMultichoiceQuestions() {
        return multichoiceQuestions;
    }

    public void setMultichoiceQuestions(List<QuizMCQuestion> multichoiceQuestions) {
        this.multichoiceQuestions = multichoiceQuestions;
    }

    public QuizWrittenQuestion getWrittenQuestion() {
        return writtenQuestion;
    }

    public void setWrittenQuestion(QuizWrittenQuestion writtenQuestion) {
        this.writtenQuestion = writtenQuestion;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

}
