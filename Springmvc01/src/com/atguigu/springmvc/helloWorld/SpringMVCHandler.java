package com.atguigu.springmvc.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *  请求处理器 / 控制器
 */
@Controller
public class SpringMVCHandler {
	/*
	 *  处理客户端的请求 ： http://localhost :8080/Springmvc01/hello
	 *   @RequestMapping : 完成请求与请求处理方法的映射
	 */
	@RequestMapping(value="/hello")
	public String handleHello() {
		System.out.println("Hello SpringMVC");
		return "success"; //通过视图解析器得到具体的视图。在转发去往该视图
	}
}
