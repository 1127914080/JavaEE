package com.atguigu.spring.tx.annotation.dao;

public interface BookShopDao {
	
	//根据书号查询书的价格
	public int findPriceByIsbn(String iSbn) ;
	
	//更新书的库存
	public void update(String isbn);
	
	
	//更新用户的余额
	public void updateUserAccount(String username,Integer price);
	

}
