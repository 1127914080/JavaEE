package wojiadahuan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import wojiadahuan.service.UserService;


/**
 * @Controller : ����  
 *  		�൱�� ��xml�ļ�����  
 *  
 *  
 *  ע��Ĭ��idֵ������������ĸСд��������ע�����ֶ�ָ��idֵ     ��дΪ @Controller("idֵ")
 * @author ���
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	public void regist() {
		
		//����userSevice
		userService.handleAddUser();
	}
	

}
