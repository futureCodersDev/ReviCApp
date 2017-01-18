package RevisionTest.RevAPI.Activity.Impl;


import RevisionTest.RevAPI.Activity.Quiz.QuizMCQuestion;
import RevisionTest.RevAPI.Activity.Quiz.QuizWrittenQuestion;
import RevisionTest.RevAPI.Activity.Util.Activity;
import RevisionTest.RevAPI.Impl.RevActivityImpl;
import RevisionTest.RevAPI.RevActivity;

import java.util.Date;
import java.util.List;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevQuizActivityImpl extends RevActivityImpl implements RevActivity {
    private List<QuizMCQuestion> multichoiceQuestions;
    private QuizWrittenQuestion writtenQuestion;
    private int result;

    public RevQuizActivityImpl(String activityName, String description, Date completionDate, int finalResult, Activity activityType, boolean completed, List<QuizMCQuestion> multichoiceQuestions, QuizWrittenQuestion writtenQuestion, int result) {
        super(activityName, description, completionDate, finalResult, activityType, completed);
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
