package RevAPI;

import RevAPI.Impl.RevCoreImpl;

/**
 * Created by fcuser1 on 14/12/2016.
 */
public class RevCoreBuilder {
    public static RevCore getCore() {
        return new RevCoreImpl();
    }
}
