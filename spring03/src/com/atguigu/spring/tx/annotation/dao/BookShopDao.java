package com.atguigu.spring.tx.annotation.dao;

public interface BookShopDao {
	
	//������Ų�ѯ��ļ۸�
	public int findPriceByIsbn(String iSbn) ;
	
	//������Ŀ��
	public void update(String isbn);
	
	
	//�����û������
	public void updateUserAccount(String username,Integer price);
	

}
