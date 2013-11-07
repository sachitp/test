package com.mybatis.traning.mybatis1;

public interface BlogMapper {

	
  public Blog selectBlog(int id);
  public void updateBlog(Blog blog);
  public void  insertBlog(Blog blog);
}
