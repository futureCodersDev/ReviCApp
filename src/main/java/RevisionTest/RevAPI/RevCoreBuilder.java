package RevisionTest.RevAPI;

import RevisionTest.RevAPI.Impl.RevCoreImpl;
import RevisionTest.RevAPI.Impl.RevStudentImpl;
import RevisionTest.RevAPI.Impl.RevSubjectImpl;

import java.util.List;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevCoreBuilder {
    public static RevCoreImpl getCore(List<RevSubjectImpl> subjects, List<RevStudentImpl> students) {
        return new RevCoreImpl(subjects, students);
    }
}
