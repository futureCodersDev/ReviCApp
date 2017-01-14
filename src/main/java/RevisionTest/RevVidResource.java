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
    private String feedback;
    private int maxResult;

    public RevVidResource(String resID, String embedText, List<String> keyTerms, String feedback) {
        this.resID = resID;
        this.embedText = embedText;
        this.keyTerms = keyTerms;
        this.feedback = feedback;
    }

    public RevVidResource(String resID){
        this.resID = resID;
        initialiseVidResource();
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

    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getMaxResult() { return maxResult; }
    public void setMaxResult(int maxResult) { this.maxResult = maxResult; }

    //get resource content from database
    private void initialiseVidResource(){
        //REPLACE with code to get resource with ID resID from database
        if(resID == "VID1"){
            this.embedText = "";
            this.keyTerms = new ArrayList<String>(Arrays.asList("simultaneous","equations"));
            this.feedback = "Question complete";
        };
    }
}