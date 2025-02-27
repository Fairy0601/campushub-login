package com.campushub.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * ClassName: LoginTicket
 * Package: com.campushub.community.entity
 * Description:
 *
 * @Author 欣欣欣
 * @Create 2025/2/26 9:41
 * @Version 1.0
 */
@Data
public class LoginTicket {
    private int id;
    private int userId;
    private String ticket;
    private int status;
    private Date expired;
}
