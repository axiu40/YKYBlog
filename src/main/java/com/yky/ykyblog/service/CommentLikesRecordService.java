package com.yky.ykyblog.service;


import com.yky.ykyblog.model.CommentLikesRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author: yky
 * @CreateTime: 2020-08-06
 * Describe:评论点赞记录业务操作
 */

public interface CommentLikesRecordService {

    /**
     * 评论是否点赞
     * @return true -- 已经点过赞  false -- 还没有点过赞
     */
    boolean isLiked(long articleId, long pId, String username);

    /**
     * 保存评论中点赞的记录
     * @param commentLikesRecord
     */
    void insertCommentLikesRecord(CommentLikesRecord commentLikesRecord);

    /**
     * 通过文章id删除该文章的所有点赞记录
     * @param articleId 文章id
     */
    void deleteCommentLikesRecordByArticleId(long articleId);
}