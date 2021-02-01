package com.study.mapper;

import com.study.domain.Article;

import java.util.List;

/**
 * @author : zhoumin
 * @data :  2021/2/1 21:55
 */
public interface ArticleMapper {

  /**
   * 查询文章信息及关联的评论信息时
   */

  public List<Article> findAllWithComment();
}
