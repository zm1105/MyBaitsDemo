package com.study.domain;

/**
 * @author : zhoumin
 * @data :  2021/2/1 21:44
 */
public class Comment {

  private int id;
  private String content;
  private String author;
  private int aId;

  @Override
  public String toString() {
    return "Comment{" +
        "id=" + id +
        ", content='" + content + '\'' +
        ", author='" + author + '\'' +
        ", aId=" + aId +
        '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getaId() {
    return aId;
  }

  public void setaId(int aId) {
    this.aId = aId;
  }
}
