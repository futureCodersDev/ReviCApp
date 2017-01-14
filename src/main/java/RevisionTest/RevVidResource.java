package RevisionTest;

import java.util.*;
import RevisionTest.Util.*;

/**
 * Created by Karen Scott on 14/1/2017.
 */
public class RevVidResource {
    private String resID;
    private String embedText;
    private List<String> keyTerms;
    private String answer;
    private String feedback;
    private int maxResult;
    private int finalResult;

    public RevVidResource(String resID, String embedText, List<String> keyTerms, String feedback) {
        this.resID = resID;
        this.embedText = embedText;
        this.answer = "";
        this.keyTerms = keyTerms;
        this.feedback = feedback;
    }

    public RevVidResource(String resID){
        this.resID = resID;
        initialiseVidResource();
    }

    //constructor for errors
    public RevVidResource(String resID, String feedback, int finalResult) {
        this.resID = resID;
        this.feedback = feedback;
        this.finalResult = finalResult;
    }

    //getters and setters
    public String getResID() { return resID; }
    public void setResID(String resID) { this.resID = resID; }

    public String getEmbedText() {
        return embedText;
    }
    public void setEmbedText(String embedText) {
        this.embedText = embedText;
    }

    public List<String> getKeyTerms() {
        return keyTerms;
    }
    public void setKeyTerms(List<String> keyTerms) {
        this.keyTerms = keyTerms;
    }

    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) { this.answer = answer;  }

    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getMaxResult() { return maxResult; }
    public void setMaxResult(int maxResult) { this.maxResult = maxResult; }

    public int getFinalResult() { return finalResult; }
    public void setFinalResult(int maxResult) { this.finalResult = finalResult; }
    //get resource content from database
    private void initialiseVidResource(){
        //REPLACE with code to get resource with ID resID from database
        if(resID == "VID1"){
            this.embedText = "";
            this.answer = "";
            this.keyTerms = new ArrayList<String>(Arrays.asList("simultaneous","equations"));
            this.feedback = "Question complete";
        };
    }

    public RevVidResource processResults(){
        this.feedback = generateFeedback();
        return this;
    }

    private String generateFeedback(){
        String feedback = "";
        int result = 0;
        //REPLACE here with checking code ***

        if(result >= maxResult) {
            this.finalResult = maxResult;
        }
        else {
            this.finalResult = result;
        }
        feedback = feedback + "<p>Your result is: " + result + " </p><p>Correct answer:  x = 3 and y = 2</p>"
                + "<p>You included the following key points: </p>";
        for(String keyTerm: this.keyTerms){
            feedback = feedback + "<p>" + keyTerm + "</p> ";
        }

        return feedback;
    }
}