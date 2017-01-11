package RevisionTest;

import RevisionTest.RevAPI.Activity.Quiz.QuizMCQuestion;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by fcuser1 on 11/01/2017.
 */
@RestController
public class MCQuizController {

    private List<QuizMCQuestion> questions = new ArrayList<>();
    private HashMap<String, Boolean> answers = new HashMap<>();


    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/mcquiz/check")
    public boolean mcquiz(@RequestParam(value="question", defaultValue="none") String question,
                             @RequestParam(value="answer", defaultValue = "none") String answer) {

        if (question.equalsIgnoreCase("none") || answer.equalsIgnoreCase("none")){
            return false;
        }

        answers.clear();

        answers.put("a1", false);
        answers.put("a2", false);
        answers.put("a3", false);
        answers.put("a4", true);

        questions.clear();

        questions.add(new QuizMCQuestion("q1", answers, "f1", 1));

        for (QuizMCQuestion q : questions){
            if (q.getQuestion().equalsIgnoreCase(question)){
                return (q.getAnswers().get(answer));
            }
        }

            return false;
    }
}
