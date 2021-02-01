package com.study.mapper;

import com.study.domain.Comment;

import java.util.List;

/**
 * @author : zhoumin
 * @data :  2021/2/1 22:50
 */
public interface CommentMapper {

  /**
   * id查询评论
   */

  public List<Comment> findByid(Integer id);
}
