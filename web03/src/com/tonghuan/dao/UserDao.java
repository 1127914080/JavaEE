package com.tonghuan.dao;

import com.tonghuan.bean.User;

public interface UserDao {
	
	public User getUserByUserPassword(String username,String password);

	public User getUserByUser(String username);
	
	//如果对象特别多，建议封装对象进行传递
	public void insertUser(String username,String password);


}
