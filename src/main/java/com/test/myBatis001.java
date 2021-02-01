package com.test;

import com.study.domain.Article;
import com.study.mapper.ArticleMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author : zhoumin
 * @data :  2020/11/10 15:54
 */
public class myBatis001 {

  @Test
  public void mybatisTest() throws IOException {

    //加载核心配置文件
    InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
    //获取sqlsessionFactory
    SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
    //获取sqlsession会话
    SqlSession sqlSession = build.openSession();
    ArticleMapper mapper = sqlSession.getMapper(ArticleMapper.class);
    List<Article> allWithComment = mapper.findAllWithComment();
    for (Article article : allWithComment) {
      System.out.println(article);
      System.out.println(article.getCommentList());
    }
    //释放资源

    sqlSession.close();
  }
}
