package RevAPI.Impl;

import RevAPI.RevSchool;
import RevAPI.RevStudent;

import java.util.List;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevSchoolImpl implements RevSchool {
    private String name;
    private List<RevStudent> students;

    public RevSchoolImpl(String name, List<RevStudent> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RevStudent> getStudents() {
        return students;
    }

    public void setStudents(List<RevStudent> students) {
        this.students = students;
    }
}
