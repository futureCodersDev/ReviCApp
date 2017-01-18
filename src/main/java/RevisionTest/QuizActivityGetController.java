package RevisionTest;

import RevisionTest.RevAPI.Activity.Quiz.QuizMCQuestion;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by fcuser1 on 14/01/2017.
 */
@RestController
public class QuizActivityGetController {
    private static List<QuizMCQuestion> set = new ArrayList<>();

    public static List<QuizMCQuestion> getSet() {
        return set;
    }

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/activity/quiz/get")
    public List<QuizMCQuestion> quizGet(@RequestParam(value = "count", defaultValue = "3") int count, @RequestParam(value = "t", defaultValue = "") String text) {
        if (count >= Application.getMcQuestions().size()) {
            return Application.getMcQuestions();
        }
        set.clear();

        Random rand = new Random();
        for (int i = 1; i <= count; i++) {
            int n = rand.nextInt(Application.getMcQuestions().size() - 1);
            if (!(set.contains(Application.getMcQuestions().get(n)))) {
                set.add(Application.getMcQuestions().get(n));
            } else {
                i--;
            }
        }

        return set;
    }
}

