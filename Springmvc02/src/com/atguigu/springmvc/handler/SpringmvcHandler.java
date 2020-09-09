package com.atguigu.springmvc.handler;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringmvcHandler {
	/**
	 * 重定向  testRedirectView
	 */
	@RequestMapping(value="/testRedirectView")
	public String testRedirectView() {
		
		return "redirect:/ok.jsp";
	}
	
	
	/**
	 * 视图View
	 */
	@RequestMapping(value="/testView")
	public String testView() {
		
		return "huan";
	}
	/**
	 * testModel
	 */
	@RequestMapping(value="/testModel")
	public String testModel(Model model) {
		//模型数据：loginMsg=用户名或者密码错误
		model.addAttribute("loginMsg","用户名或者密码错误");
		return "huan";
	}
	
	/**
	 *  testMap 方法形参
	 *  猜测 ： SpringMVC会把Map中的模型数据存放到request域对象中
	 *       调用完请求处理方法后，不管方法的返回值是什么类型，都会处理成一个ModelAndView对象
	 */
	@RequestMapping(value="/testMap")
	public String testMap(Map<String, Object> map) {
		//模拟数据 ： password = 123456
		map.put("password", "123456");
		
		return "huan";
		
	}
	
	/**
	 *  ModelAndView
	 *  猜测Springmvc会把ModelAndView中的模型数据存放到request域对象中
	 */
	@RequestMapping(value="/testModelAndView")
	public ModelAndView testModelAndView() {
		//模拟数据： username=admin
		//new 一个modelandview
		ModelAndView mav = new ModelAndView();
		//添加模型数据
		mav.addObject("username","admin");
		//设置视图信息
		mav.setViewName("huan");
		return mav;
	}
}
