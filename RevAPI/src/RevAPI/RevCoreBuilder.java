package RevAPI;

import RevAPI.Impl.RevActivityImpl;
import RevAPI.Impl.RevCoreImpl;
import RevAPI.Impl.RevStudentImpl;
import RevAPI.Impl.RevSubjectImpl;

import java.util.List;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevCoreBuilder {
    public static RevCoreImpl getCore(List<RevSubjectImpl> subjects, List<RevStudentImpl> students) {
        return new RevCoreImpl(subjects, students);
    }
}
