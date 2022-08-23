package programmer.lp.ds.sgg.prototype;

import java.util.HashMap;
import java.util.Map;

public final class LPMyBatis {
    private LPMyBatis() {
    }
    private final Map<String, User> userCache = new HashMap<>();
    public User getUser(String username) {
        if (null == username || username.isEmpty()) return null;
        final User userFromDB = getUserFromDB(username);
        // 不能将数据本体对象返回出去，太危险了
        return userFromDB.clone();
    }
    private User getUserFromDB(String username) {
        User user = userCache.get(username);
        if (user == null) {
            final User u = new User();
            u.setName("张3");
            u.setId(20);
            userCache.put(username, u);
            user = u;
        }
        return user;
    }
}
