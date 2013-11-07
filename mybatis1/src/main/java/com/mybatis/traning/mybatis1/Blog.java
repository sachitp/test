package com.mybatis.traning.mybatis1;

public class Blog {
 int id;
 String blog;



public String toString()
   { System.out.println(id+"  "+blog);
	   return "";
   }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBlog() {
	return blog;
}

public void setBlog(String blog) {
	this.blog = blog;
} 
	
}
