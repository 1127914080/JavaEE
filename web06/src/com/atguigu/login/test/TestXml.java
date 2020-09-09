package com.atguigu.login.test;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import com.atguigu.login.beans.Employee;

public class TestXml {

	@Test
	public void test() throws Exception {
		// dom 解析
		//创建解析器对象
		SAXReader reader = new SAXReader();
		
		//把一个xml文件解析成 dom数
		Document dom = reader.read("students.xml");
		System.out.println("dom:" + dom );
		
		//获取根节点
		Element root = dom.getRootElement();
		
//		List<Element> els  = root.elements();
//		for (Element element : els) {
//			System.out.println(element.elementText("name") );
//		}
		
		Element cls = root.element("class");
		Element clsName = cls.element("class-name");
		System.out.println("clsName:" + clsName);
		
		String  clsStr = clsName.getText();
		System.out.println("clsStr:" + clsStr);
		
		Employee emp = (Employee)Class.forName(clsStr).newInstance();
		System.out.println(emp);
	}

}
