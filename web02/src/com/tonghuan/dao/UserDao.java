package com.tonghuan.dao;

import com.tonghuan.bean.User;

public interface UserDao {
	
	public User getUserByUserPassword(String username,String password);
}
