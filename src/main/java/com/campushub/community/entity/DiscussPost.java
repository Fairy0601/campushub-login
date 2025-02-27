package com.campushub.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * ClassName: DiscussPost
 * Package: com.campushub.community.entity
 * Description:
 *
 * @Author 欣欣欣
 * @Create 2025/2/13 11:38
 * @Version 1.0
 */
@Data
public class DiscussPost {
    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private int commentCount;
    private double score;
}
