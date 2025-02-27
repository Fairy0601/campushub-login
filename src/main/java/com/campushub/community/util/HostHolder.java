package com.campushub.community.util;

import com.campushub.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * ClassName: HostHolder
 * Package: com.campushub.community.util
 * Description:持有用户信息,用于代替session对象.
 *
 * @Author 欣欣欣
 * @Create 2025/2/26 21:41
 * @Version 1.0
 */
@Component
public class HostHolder {
    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user) {
        users.set(user);
    }

    public User getUser() {
        return users.get();
    }

    public void clear() {
        users.remove();
    }
}
