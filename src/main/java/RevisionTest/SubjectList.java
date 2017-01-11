package RevisionTest;

import java.util.*;
import RevisionTest.Util.*;

public class SubjectList {

    private List<String> subjList;
    private String username;

    public SubjectList(String username) {
        this.username = initialiseUser(username);
        this.subjList = initialiseList();
    }

    public List<String> getsubjList() { return this.subjList; }

    public void setSubjList(List<String> subject_List) { this.subjList = subject_List; }

    private List<String> initialiseList(){
        List<String> subject_List =new ArrayList<String>();
        subject_List.add("Maths");
        subject_List.add("English");
        subject_List.add("Science");
        subject_List.add("Geography");
        subject_List.add("French");
        return subject_List;
    }

    public String getUsername() {return this.username;}

    public void setUsername(String username) { this.username = username;}

    private String initialiseUser(String username) {
        if (username == "") {
            return "Michael Peaches";
        } else {
            return username;
        }
    }
}