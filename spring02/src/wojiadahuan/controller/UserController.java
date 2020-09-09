package wojiadahuan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import wojiadahuan.service.UserService;


/**
 * @Controller : 作用  
 *  		相当于 在xml文件当中  
 *  
 *  
 *  注解默认id值就是类名首字母小写，可以在注解中手动指定id值     简写为 @Controller("id值")
 * @author 栾昊
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	public void regist() {
		
		//调用userSevice
		userService.handleAddUser();
	}
	

}
