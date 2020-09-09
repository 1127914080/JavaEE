package com.atguigu.springmvc.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.springmvc.beans.User;

@Controller
public class SpringmvcHandler {
	
	
	/*
	 *	 testServletAPI
	 * 
	 */
	@RequestMapping(value="testServletAPI")
	public void testServletAPI(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		System.out.println("request:"+request);  //转发 
		System.out.println("response:"+response);  //重定向 将数据写给客户端
		//转发
		//request.getRequestDispatcher("/WEB-INF/views/huan.jsp").forward(request, response);
		//重定向
		response.sendRedirect("http://www.baidu.com");
	}
	
	
	/**
	 * 
	 * 	@pojo
	 * 
	 * 
	 */
	@RequestMapping(value="testPOJO")
	public String testPOJO(User user) {
		
		System.out.println("user:"+user);
		
		return "huan";
	}

	/**
	 * 
	 *   @CookieValue 映射cookie信息到请求处理方法的形参中
	 */
	@RequestMapping(value="/testCookieValue")
	public String testCookieValue(@CookieValue("JSESSIONID")String sessionID) {
		System.out.println("cookie:"+sessionID);
		return "huan";
	}

	
	/**
	 *  @RequestHeader  映射请求头信息到请求处理方法的形参中
	 *
	 */
	@RequestMapping(value="/testRequestHeader")
	public String testRequestHeader(@RequestHeader("Accept-Language")String acceptLanguage) {
		
		System.out.println("accept:"+acceptLanguage);
		return "huan";
	}

	/**
	 *    @RequestParam 映射请求参数到请求处理方法的形参
	 *    1，如果请求参数名与形参名一致，可以省略@RequestParam的指定
	 * 	  2，注解标注的形参必须要赋值，必须要能从请求对象中获取到对应的参数
	 * 		 可以使用required 来设置为不是必须的
	 * 		例 ：@RequestParam(value="age",required=false )
	 *    3，defaultValue来指定一个默认值取代null
	 *       例 ：@RequestParam(value="age",required=false,defaultValue="0" )
	 */
	@RequestMapping(value="/testRequestParam")
	public String testRequestParam(@RequestParam("username")String username,@RequestParam("age")Integer age) {
		//web request.getParmenter()
		//  request.getParmenterMap()
		
		System.out.println(username+":"+age);
		return "huan";
	}
	
	
	/**
	 * REST PUT
	 */
	@RequestMapping(value="/order",method=RequestMethod.PUT)
	public String testRestPUT() {
		System.out.println("REST PUT");
		return "success";
	}
	/**
	 * REST POST
	 */
	@RequestMapping(value="/order",method=RequestMethod.POST)
	public String testRestPOST() {
		System.out.println("REST POST");
		
		return "success";
	}
	
	
	/**
	 * REST DELETE
	 */
	@RequestMapping(value="/order/{id}",method=RequestMethod.DELETE)
	public String testRestDELETE(@PathVariable("id")Integer id ) {
		System.out.println("REST DELETE: " + id );
		return "success";
	}
	
	/**
	 * REST GET
	 */
	@RequestMapping(value="/order/{id}",method=RequestMethod.GET)
	public String testRestGET(@PathVariable("id")Integer id ) {
		System.out.println("REST GET: " + id );
		return "success";
	
	}
	/**
	 *  @RequestMapping 映射请求参数，以及 ，请求头信息
	 * 
	 * params  username=huanhuan&age=20
	 * headers
	 */
	@RequestMapping(value="/testRequestMappingParamsAndHeaders",params={"username","age=20"})
	public String testRequestMappingParamsAndHeaders() {
		
		return "huan";
	}
	
	/*
	 * 
	 * 	testRequestMapping method : 映射请求方式
	 */
	@RequestMapping(value="/testRequestMappingMethod",method= {RequestMethod.GET,RequestMethod.POST})
	public String testRequestMappingMethod() {
		
		return "huan";
	}
	
	
	
	/*
	 *  @RequestMapping ： 如果类上面有 @RequestMapping 
	 *  				     会优先执行类上面，后执行方法上面
	 */
	
	@RequestMapping(value="/testRequestMapping")
	public String testRequestMapping() {
		
		
		return "huan";
	}

}
