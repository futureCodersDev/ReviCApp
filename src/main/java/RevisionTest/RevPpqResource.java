package RevisionTest;

import java.util.*;
import RevisionTest.Util.*;

/**
 * Created by Karen Scott on 14/1/2017.
 */
public class RevPpqResource {
    private String resID;
    private String questionText;
    private List<String> keyTerms;
    private String answer;
    private String feedback;
    private int maxResult;
    private int finalResult;

    public RevPpqResource(String resID, String questionText, List<String> keyTerms, String feedback, int maxResult, int finalResult) {
        this.resID = resID;
        this.questionText = questionText;
        this.keyTerms = keyTerms;
        this.answer = "";
        this.feedback = feedback;
        this.maxResult = maxResult;
        this.finalResult = finalResult;
    }

    public RevPpqResource(String resID){
        this.resID = resID;
        initialisePpqResource();
    }

    //constructor for errors
    public RevPpqResource(String resID, String feedback, int finalResult) {
        this.resID = resID;
        this.feedback = feedback;
        this.finalResult = finalResult;
    }

    //getters and setters
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

    public List<String> getKeyTerms() {
        return keyTerms;
    }
    public void setKeyTerms(List<String> keyTerms) {
        this.keyTerms = keyTerms;
    }

    public String getAnswer() { return answer; }
    public void setAnswer(String answer) { this.answer = answer; }

    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String answer) {
        this.feedback = generateFeedback(answer);
    }

    public int getMaxResult() {
        return maxResult;
    }
    public void setMaxResult(int maxResult) {
        this.maxResult = maxResult;
    }

    public int getFinalResult() {
        return finalResult;
    }
    public void setFinalResult(int finalResult) {
        this.finalResult = finalResult;
    }

    //get resource content from database
    private void initialisePpqResource(){
        //REPLACE with code to get resource with ID resID from database
        if(resID.equals("PPQ1")){
            this.questionText =
                    "<p>Solve the simultaneous equations (4 marks)</p>" +
                    "<p>5x + 2y = 11</p>" +
                    "<p>4x – 3y = 18</p>" +
                    "<p>4x – 3y = 18</p>";
            this.keyTerms = new ArrayList<String>(Arrays.asList("15x + 6y = 33",
                    "8x – 6y = 36",
                    "23x = 69",
                    "5 × 3 + 2y = 11",
                    "x = (11 - 2y) / 5",
                    "4 x ((11 - 2y) / 5) - 3y = 18",
                    "44 - 8y - 15y = 90",
                    "-46 = 23y"));
            this.answer = "";
            this.feedback = "";
            this.maxResult = 4;
            this.finalResult = 0;
        };
    }

    private String generateFeedback(String answer){
        String feedback = "";
        int result = 0;
        //REPLACE here with checking code ***
        feedback = feedback + "<p>The correct answer:  x = 3 and y = 2</p>"
                + "<p>You could have included the following key points: </p>";
        for(String keyTerm: this.keyTerms){
            feedback = feedback + "<p>" + keyTerm + "</p> ";
        }

        if(result >= maxResult) {
            this.finalResult = maxResult;
        }
        else{
            this.finalResult = result;
        }
        return feedback;
    }
}