package com.atguigu.springmvc.handler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.atguigu.springmvc.beans.Employee;
import com.atguigu.springmvc.dao.DepartmentDao;
import com.atguigu.springmvc.dao.EmployeeDao;

@Controller
public class RestCrudHandler {

	@Autowired
	public EmployeeDao employeeDao;
	
	@Autowired
	public DepartmentDao departmentDao;
	
	/*
	 *   文件上传
	 *  上传原理 ： 将本地的文件上传到服务器端
	 */
	@RequestMapping(value="/upload")
	public String testUploadFile(@RequestParam("desc")String desc,@RequestParam("uploadFile") MultipartFile uploadFile,HttpSession session) throws Exception {
		
		//获取到上传文件的名字
		String uploadFileName = uploadFile.getOriginalFilename();
		//获取输入流
		InputStream in = uploadFile.getInputStream();
		//获取服务器端的uploads文件夹的真实路径
		ServletContext sc = session.getServletContext();
		String realPath = sc.getRealPath("uploads");
		File targerFile = new File(realPath+"/"+uploadFileName);
		
	//	FileOutputStream os = new FileOutputStream(targerFile);
	
		//写文件
//		int i;
//		while((i=in.read())!=-1) {
//			os.write(i);
//		}
//		in.close();
//		os.close();
//		return "success";
//	
		
		uploadFile.transferTo(targerFile);
		return "success";
	}
	
	
	
	/*  
	 *   使用 HttpMessageConveter完成下载功能
	 *   支持 @RequestBody  @ResponseBody  HttpEntity ResponseEntity 
	 * 下载的原理  : 将服务器端 的文件，以流的形式 写到客户端，
	 * 
	 *   ResponseEntity : 将要下载的文件数据，以及响应信息封装到ResponseEntity ，
	 *                            浏览器通过解析发送回去的相应数据，就可以进行一个下载操作
	 */
	@RequestMapping(value="/download")
	public ResponseEntity<byte[]> testDownload(HttpSession session) throws Exception{
		//将要下载的文件读取成要给字节数据
		byte[] imgs;
	
		ServletContext sc = session.getServletContext();
		InputStream in = sc.getResourceAsStream("image/huan.jpg");
	
		imgs = new byte[in.available()];
		
		in.read(imgs);
		
		///将响应数据，以及一些响应头信息封装到ResponseEntity中
		/*
		 *  参数
		 *   1，发送给浏览器端的数据
		 *   2，设置想听头
		 *   3，设置响应码
		 */
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment;filename=huan.jpg");
		HttpStatus statusCode = HttpStatus.OK; //200
		
		ResponseEntity<byte[]> re = new ResponseEntity<>(imgs,headers,statusCode);
		return re;
	}
	/*
	 * 
	 * 
	 *       处理Json
	 */
	@ResponseBody  //负责将方法的返回值，转化为json 响应给浏览器端
	@RequestMapping(value="/testJson")
	public Collection<Employee> testJson() {
		
			Collection<Employee> emps = employeeDao.getAll();
			return emps;
	}
}
