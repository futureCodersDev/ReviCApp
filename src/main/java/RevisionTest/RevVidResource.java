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
    public void setFeedback(String answer) {
        this.feedback = generateFeedback(answer);
    }

    public int getMaxResult() { return maxResult; }
    public void setMaxResult(int maxResult) { this.maxResult = maxResult; }

    public int getFinalResult() { return finalResult; }
    public void setFinalResult(int maxResult) { this.finalResult = finalResult; }


    //get resource content from database
    private void initialiseVidResource(){
        //REPLACE with code to get resource with ID resID from database
        if(this.resID.equals("VID1")){
            String resText = "<iframe width=\"560\" height=\"315\"";
            resText = resText + "src=\"https://www.youtube.com/embed/8ockWpx2KKI?rel=0\"";
            resText = resText + "frameborder=\"0\" allowfullscreen></iframe>";
            this.embedText =  resText;
            this.keyTerms = new ArrayList<String>(Arrays.asList("substitute", "check", "back"));
            this.answer = "";
            this.feedback = "Here you learned how, in some situations it is best to substitute one equation into another to provide the solution";
            this.maxResult = 3;
            this.finalResult = 0;
        }
        else{
            this.embedText = "No resource available";
            this.keyTerms = new ArrayList<String>();
            this.answer = "";
            this.feedback = "No feedback";
            this.maxResult = 3;
            this.finalResult = 0;
        }
    }

    private String generateFeedback(String answer){
        String feedback = "";
        int result = 0;

        this.answer = answer;
        if(!this.answer.equals("")) {
            //REPLACE here with checking code ***
            if(this.resID.equals("VID1")) {
                feedback = "<p>These are the relevant key terms for this video: </p>";
                for(String keyTerm:this.keyTerms){
                    feedback = feedback + "<p>" + keyTerm + "</p>";
                }
            }
        }
        else {
            feedback = "No answer to evaluate";
        }

        if(result >= maxResult) {
            this.finalResult = maxResult;
        }
        else {
            this.finalResult = result;
        }
        return feedback;
    }
}