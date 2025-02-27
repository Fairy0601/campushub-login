package com.campushub.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * ClassName: User
 * Package: com.campushub.community.entity
 * Description:
 *
 * @Author 欣欣欣
 * @Create 2025/2/13 11:51
 * @Version 1.0
 */
@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private int type;
    private int status;
    private String activationCode;
    private String headerUrl;
    private Date createTime;
}
