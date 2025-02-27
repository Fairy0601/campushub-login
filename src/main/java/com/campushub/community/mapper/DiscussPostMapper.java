package com.campushub.community.mapper;

import com.campushub.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: DiscussPostMapper
 * Package: com.campushub.community.mapper
 * Description:
 *
 * @Author 欣欣欣
 * @Create 2025/2/13 11:58
 * @Version 1.0
 */
@Mapper
public interface DiscussPostMapper {
    /**
     * 查询帖子
     *      userId用于将来查询“我的”帖子
     *      分页：offset起始行行号，limit每页最多显示多少行数据
     * @param userId
     * @return 查询到的帖子列表
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    /**
     * 查询帖子的行数
     * @param userId
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);
}
