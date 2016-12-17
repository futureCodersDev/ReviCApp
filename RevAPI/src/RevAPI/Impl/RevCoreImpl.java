package RevAPI.Impl;

import RevAPI.RevCore;

import java.util.List;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevCoreImpl implements RevCore {
    private List<RevSubjectImpl> subjects;
    private List<RevStudentImpl> students;

    public RevCoreImpl(List<RevSubjectImpl> subjects, List<RevStudentImpl> students) {

        this.subjects = subjects;
        this.students = students;
    }

    public List<RevSubjectImpl> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<RevSubjectImpl> subjects) {
        this.subjects = subjects;
    }

    public List<RevStudentImpl> getStudents() {
        return students;
    }

    public void setStudents(List<RevStudentImpl> students) {
        this.students = students;
    }
}
