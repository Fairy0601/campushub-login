package com.campushub.community.mapper;

import com.campushub.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: UserMapper
 * Package: com.campushub.community.mapper
 * Description:
 *
 * @Author 欣欣欣
 * @Create 2025/2/13 11:59
 * @Version 1.0
 */
@Mapper
public interface UserMapper {

    /**
     * 通过用户的id获取用户信息
     * @param id
     * @return
     */
    User selectById(int id);

    /**
     * 通过用户的username获取用户信息
     * @param username
     * @return
     */
    User selectByName(String username);

    /**
     * 通过用户的email获取用户信息
     * @param email
     * @return
     */
    User selectByEmail(String email);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 更新对应id用户的status
     * @param id
     * @param status
     * @return
     */
    int updateStatus(int id, int status);

    /**
     * 更新对应id用户的headerUrl（头像地址）
     * @param id
     * @param headerUrl
     * @return
     */
    int updateHeader(int id, String headerUrl);

    /**
     * 更新对应id用户的password
     * @param id
     * @param password
     * @return
     */
    int updatePassword(int id, String password);

}
