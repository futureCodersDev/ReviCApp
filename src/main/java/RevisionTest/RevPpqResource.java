package RevisionTest;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jake Dean on 14/1/2017.
 */
public class RevPpqResource {
    private static final Pattern PATTERN_1 = Pattern.compile("(x\\s*=\\s*3)"); //x=3
    private static final Pattern PATTERN_2 = Pattern.compile("(y\\s*=\\s*-\\s*2)"); //y=-2
    private static final Pattern PATTERN_3 = Pattern.compile("(15\\s*x\\s*[+]\\s*6\\s*y\\s*=\\s*33)"); //15x+6y=33
    private static final Pattern PATTERN_4 = Pattern.compile("(8\\s*x\\s*-\\s*6\\s*y\\s*=\\s*36)"); //8x-6y=36
    private static final Pattern PATTERN_5 = Pattern.compile("(\\(?\\s*5\\s*[*x]\\s*3\\s*\\)?\\s*[+]\\s*2\\s*y\\s*=\\s*11)"); //5*3+2y=11
    private static final Pattern PATTERN_6 = Pattern.compile("(23\\s*x\\s*=\\s*69)"); //23x=69
    private static final Pattern PATTERN_7 = Pattern.compile("(x\\s*=\\s*\\({1}\\s*11\\s*-\\s*2\\s*y\\s*\\){1}\\s*/\\s*5)"); //x=(11-2y)/5;
    private static final Pattern PATTERN_8 = Pattern.compile("(4\\s*x\\s*\\({1}\\s*\\({1}\\s*11\\s*-\\s*2\\s*y\\s*\\){1}\\s*/\\s*5\\s*\\){1}\\s*-\\s*3\\s*y\\s*=\\s*18)"); //4x((11-2y)/5)-3y=18
    private static final Pattern PATTERN_9 = Pattern.compile("(44\\s*-\\s*8\\s*y\\s*-\\s*15\\s*y\\s*=\\s*90)"); //44-8y-15y=90
    private static final Pattern PATTERN_10 = Pattern.compile("(-\\s*46\\s*=\\s*23\\s*y)"); //-46=23y

    private List<Pattern> patterns = new ArrayList<>();

    private String resID;
    private String questionText;
    private String feedback;
    private int maxResult;

    public RevPpqResource(String resID, String questionText, String feedback, int maxResult) {
        this.resID = resID;
        this.questionText = questionText;
        this.feedback = feedback;
        this.maxResult = maxResult;
        patterns.clear();
        patterns.add(PATTERN_1);
        patterns.add(PATTERN_2);
        patterns.add(PATTERN_3);
        patterns.add(PATTERN_4);
        patterns.add(PATTERN_5);
        patterns.add(PATTERN_6);
        patterns.add(PATTERN_7);
        patterns.add(PATTERN_8);
        patterns.add(PATTERN_9);
        patterns.add(PATTERN_10);

    }

    public String getResID() {
        return resID;
    }

    public void setResID(String resID) {
        this.resID = resID;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getMaxResult() {
        return maxResult;
    }

    public void setMaxResult(int maxResult) {
        this.maxResult = maxResult;
    }

    //get resource content from database
    private void initialisePpqResource() {
        //REPLACE with code to get resource with ID resID from database
        if (resID == "PPQ1") {
            this.questionText =
                    "<p>Solve the simultaneous equations (4 marks)</p>" +
                            "<p>5x + 2y = 11</p>" +
                            "<p>4x – 3y = 18</p>" +
                            "<p>4x – 3y = 18</p>";

            this.feedback = "";
            this.maxResult = 4;
        }
    }

    private String generateFeedback(String answer, int maxResult) {
        String feedback = "";
        int result = 0;

        answer = answer.toLowerCase();
        List<String> ps = new ArrayList<>();

        for (Pattern p : patterns) {
            Matcher m = p.matcher(answer);
            if (m.find()) {
                ps.add(m.group());
            }
        }

        result = ps.size() > 0 ? ps.size() > maxResult ? maxResult : ps.size() : 0;

        feedback += "<p>Your result is: " + result + " </p><p>Correct answer:  x = 3 and y = 2</p>"
                + "<p>You included the following key points: </p>";

        for (String n : ps) feedback += "<p><b>" + n + "</b></p>";

        return feedback;
    }
}