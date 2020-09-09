package wojiadahuan.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wojiadahuan.dao.UserDao;

@Service
public class UserServerImpl implements UserService{

	/**
	 *   @Autowired 完成bean属性的自动装配
	 *   
	 *   工作机制  : 首先会使用byType的方式进行自动装配，如果能唯一匹配，则装配成功
	 *   		   如果能匹配到多个兼容的bean ，还会尝试使用byName的方式进行唯一确定
	 *   	 	   如果能唯一确定，则装配成功，如果不能唯一确定，则装配失败，抛出异常
	 *   
	 *   默认情况下 , 使用@Autowired标注的属性必须被装配，如果装配不辽，也会抛出异常，
	 *   可以使用require=false来设置不是必要被装配
	 *   
	 *   如果有多个到兼容类型的bean  可以使用@Qualifier来进一步装配的bean的id值
	 *
	 *		@Autowired ,,@Qualifier 注解即可在成员变量上，也可以加在对应的set方法上
	 *
	 *
	 */
	
	@Autowired
	private UserDao userDao;	
	//自动装配byName byType
	
	@Override
	public void handleAddUser() {
		// TODO Auto-generated method stub
		//处理业务
		//调用userDao
		
		userDao.addUser();
	}

}
