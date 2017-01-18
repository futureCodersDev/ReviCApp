package RevisionTest;

import RevisionTest.RevAPI.Activity.Quiz.QuizMCQuestion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootApplication
public class Application {
    private static List<QuizMCQuestion> mcQuestions = new ArrayList<>();

    public static List<QuizMCQuestion> getMcQuestions() {
        return mcQuestions;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        HashMap<String, Boolean> a = new HashMap<>();

        a.put("x = 2, y = 1", true);
        a.put("x = 4, y = 8", false);
        a.put("x = 6, y = 1", false);

        mcQuestions.add(new QuizMCQuestion(
                "Solve simultaneous equations 13x - 6y = 20, 7x + 4y = 18",
                (HashMap<String, Boolean>) a.clone(),
                "Multiplying the first equation by 2 and the second by 3 gives" +
                        "\n26x - 12y = 40 and 21x + 12y = 54" +
                        "\nAdding the equations gives 47x = 94, therefore x = 2" +
                        "\nSubstituting x gives 14 + 4y = 18. 4y = 4" +
                        "\nTherefore, y = 1",
                0));

        a.clear();

        a.put("x = 1, y = 4", false);
        a.put("x = -3, y = 24", false);
        a.put("x = 3, y = 10", true);

        mcQuestions.add(new QuizMCQuestion(
                "Solve for value of x and y if 5x - y = 5 and 3x + 2y = 29",
                (HashMap<String, Boolean>) a.clone(),
                "Multiply the first equation by 2 to give 10x - 2y = 10 and subtract this from the second equation" +
                        "\nThis gives -7x",
                0));

        a.clear();

        a.put("x = 5, y = 0", false);
        a.put("x = 4, y = 14", false);
        a.put("x = 2.6, y = -2.6", true);

        mcQuestions.add(new QuizMCQuestion(
                "Solving equations 3x - 2y = 13, 2x + 2y = 0 using graphical method gives us:",
                (HashMap<String, Boolean>) a.clone(),
                "",
                0));

        a.clear();

        a.put("x = 3, y = -1", true);
        a.put("x = 2, y = 3", false);
        a.put("x = 4, y = 1", false);

        mcQuestions.add(new QuizMCQuestion(
                "Solving following simultaneous equations, 4x - 5y = 17 and x - 5y = 8, we get:",
                (HashMap<String, Boolean>) a.clone(),
                "Multiply the second equation by -1, giving you -x + 5y = -8" +
                        "\nAdd the two together, which gives 3x = 9, therefore, x = 3" +
                        "\nSubstituting the x back in" +
                        "\n3 - 5y = 8" +
                        "\n3 - 8 = 5y" +
                        "\n-5 = 5y" +
                        "\n-1 = y or y = -1",
                0));

        a.clear();

        a.put("x = -4", false);
        a.put("x = -2", true);
        a.put("x = 2", false);

        mcQuestions.add(new QuizMCQuestion(
                "Which is the solution for x in the simultaneous equations x + 7y = 5 and x -7y = -9",
                (HashMap<String, Boolean>) a.clone(),
                "Solving by elimination, we add the two equations and get 2x = -4 and hence x = -2." +
                        "\nThis then gives y = 1 sice y = (5 - x)/7 = (5 - (-2))/7 = 1 and we check in the second equation. " +
                        "\nand we can see that -2 - 7(1) = -9. So we have x = -2 and y = 1",
                0));

        a.clear();

        a.put("b = 2", false);
        a.put("b = 3", true);
        a.put("b = 4", false);

        mcQuestions.add(new QuizMCQuestion(
                "Solve these simultaneous equations: 2a + 5b = 16 and 10a - 3b = -4",
                (HashMap<String, Boolean>) a.clone(),
                "Multiplying the first equation by 5 gives you 10a + 25b = 80" +
                        "\nSubtract the first equation from this to give you 28b = 84 which means b = 3",
                0));

        a.clear();

        a.put("Multiply the first by 3 and the second by 2 and subtract the resultant equations", true);
        a.put("Multiply the first by 3 and the second by 2 and then add the resultant equations", false);
        a.put("Multiply the first by 5 and the second by 7 and subtract the resultant equations", false);

        mcQuestions.add(new QuizMCQuestion(
                "Consider the simultaneous equations -2x + 7y = 4 and -3x + 5y = -5, which of the following are the correct steps to eliminate x from the equations?",
                (HashMap<String, Boolean>) a.clone(),
                "Answer 1 gives us -6x + 21y = 12 and -6x + 10y = -10." +
                        "\nWhen we subtract one from the other, we get 11y = 22 therefore y = 2",
                0));

        a.clear();

        a.put("x = 4", true);
        a.put("x = 2", false);
        a.put("x = -2", false);

        mcQuestions.add(new QuizMCQuestion(
                "Consider the simultaneous equations: 3x + 2y = 10 and 4x + 3y = 13. Which of the following is the solution for x?",
                (HashMap<String, Boolean>) a.clone(),
                "Solving by elimination, we multiply the first equation by 3 and the second by 2 which gives us" +
                        "\n9x + 6y = 30 and 8x + 6y = 26" +
                        "\nSubtract one equation from the other and we get x = 4" +
                        "\nSubstituting this we get 12 + 2y = 10 so y = -1",
                0));

        a.clear();
    }

}
