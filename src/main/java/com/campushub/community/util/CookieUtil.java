package com.campushub.community.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * ClassName: CookieUtil
 * Package: com.campushub.community.util
 * Description:cookie相关工具类
 *
 * @Author 欣欣欣
 * @Create 2025/2/26 21:25
 * @Version 1.0
 */
public class CookieUtil {
    /**
     * 根据浏览器的请求和传入的name，对应cookie的name，找到相应cookie的value
     * @param request
     * @param name
     * @return
     */
    public static String getValue(HttpServletRequest request, String name) {
        if (request == null || name == null) {
            throw new IllegalArgumentException("参数为空!");
        }

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(name)) {
                    return cookie.getValue();
                }
            }
        }

        return null;
    }
}
