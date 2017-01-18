package RevisionTest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static RevisionTest.QuizActivityGetController.getSet;

@RestController
public class QuizActivityCheckController {

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/activity/quiz/check")
    public String quizCheck(@RequestParam(value = "answers", defaultValue = "") String answers
    ) {

        if (answers.length() != getSet().size()) {
            return null;
        }

        List<Boolean> r = new ArrayList<>();
        List<Integer> z = new ArrayList<>();

        for (int i = 0; i < answers.length(); i++) {
            z.add(Integer.valueOf(Character.toString(answers.charAt(i))));
        }

        for (int i = 0; i <= answers.length() - 1; i++) {
            int c = 0;
            for (Map.Entry<String, Boolean> u : getSet().get(i).getAnswers().entrySet()) {
                c++;

                if (z.get(i) == c) {
                    r.add(u.getValue());
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int g = 0;
        for (Boolean b : r) if (b) g++;

        sb.append("Question 1: ").append(r.get(0));
        sb.append("<p>Question 1 Feedback: ").append(QuizActivityGetController.getSet().get(0).getFeedback());
        sb.append("<p>Question 2: ").append(r.get(1));
        sb.append("<p>Question 2 Feedback: ").append(QuizActivityGetController.getSet().get(1).getFeedback());
        sb.append("<p>Question 3: ").append(r.get(2));
        sb.append("<p>Question 3 Feedback: ").append(QuizActivityGetController.getSet().get(2).getFeedback());
        sb.append("<p>Total score: ").append(g);

        return sb.toString();
    }
}
