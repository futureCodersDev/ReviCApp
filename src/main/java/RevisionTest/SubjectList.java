package RevisionTest;

import java.util.*;
import RevisionTest.Util.*;

public class SubjectList {

    private String username;
    private List<RevSubject> subjList;

    public SubjectList(String username) {
        this.username = initialiseUser(username);
        this.subjList = initialiseList();
    }

    //getters and setters
    public String getUsername() {return this.username;}
    public void setUsername(String username) { this.username = username;}

    public List<RevSubject> getSubjList() { return this.subjList; }
    public void setSubjList(List<RevSubject> subject_List) { this.subjList = subject_List; }


    //future implementation - username from login
    private String initialiseUser(String username) {
        if (username == "") {
            return "Michael Peaches";
        } else {
            return username;
        }
    }

    //future implementation subject list comes from user data
    private List<RevSubject> initialiseList(){
        List<RevSubject> subject_List = new ArrayList<RevSubject>();
        subject_List.add(new RevSubject("Maths"));
        subject_List.add(new RevSubject("English"));
        subject_List.add(new RevSubject("Science"));
        subject_List.add(new RevSubject("Geography"));
        subject_List.add(new RevSubject("French"));

        return subject_List;
    }
}