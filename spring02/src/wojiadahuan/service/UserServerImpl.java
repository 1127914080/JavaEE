package wojiadahuan.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wojiadahuan.dao.UserDao;

@Service
public class UserServerImpl implements UserService{

	/**
	 *   @Autowired ���bean���Ե��Զ�װ��
	 *   
	 *   ��������  : ���Ȼ�ʹ��byType�ķ�ʽ�����Զ�װ�䣬�����Ψһƥ�䣬��װ��ɹ�
	 *   		   �����ƥ�䵽������ݵ�bean �����᳢��ʹ��byName�ķ�ʽ����Ψһȷ��
	 *   	 	   �����Ψһȷ������װ��ɹ����������Ψһȷ������װ��ʧ�ܣ��׳��쳣
	 *   
	 *   Ĭ������� , ʹ��@Autowired��ע�����Ա��뱻װ�䣬���װ�䲻�ɣ�Ҳ���׳��쳣��
	 *   ����ʹ��require=false�����ò��Ǳ�Ҫ��װ��
	 *   
	 *   ����ж�����������͵�bean  ����ʹ��@Qualifier����һ��װ���bean��idֵ
	 *
	 *		@Autowired ,,@Qualifier ע�⼴���ڳ�Ա�����ϣ�Ҳ���Լ��ڶ�Ӧ��set������
	 *
	 *
	 */
	
	@Autowired
	private UserDao userDao;	
	//�Զ�װ��byName byType
	
	@Override
	public void handleAddUser() {
		// TODO Auto-generated method stub
		//����ҵ��
		//����userDao
		
		userDao.addUser();
	}

}
