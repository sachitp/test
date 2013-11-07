package com.mybatis.traning.mybatis1;

import java.io.IOException;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException 
    {
        System.out.println( "Hello World!sss" );
        
        String resource = "mybatis-config.xml";
        System.out.println( "Hello World!" );
        Reader inputStream = Resources.getResourceAsReader( resource);
       SqlSessionFactory   sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
       System.out.println( "Hello World!" );
     
     /* 
       try {
        blog = (Blog) session.selectOne("org.mybatis.BlogMapper.selectBlog", 1);
       } finally {
         session.close();
       }*/
       Blog b1=new Blog();
       b1.setId(2);
       b1.setBlog("i am a software engineer too hi");

       SqlSession session = sqlSessionFactory.openSession();
       try {
         BlogMapper mapper = session.getMapper(BlogMapper.class);
         Blog blog = mapper.selectBlog(1);
         System.out.println(blog);
         System.out.println(b1);
          
         mapper.updateBlog(b1);
       session.commit();
    
          b1.setId(3);
          b1.setBlog("hey");
          
       /*   mapper.insertBlog(b1);
        session.commit();*/
          
         
       } finally {
         session.close();
       }
       
    
       
    }
}
