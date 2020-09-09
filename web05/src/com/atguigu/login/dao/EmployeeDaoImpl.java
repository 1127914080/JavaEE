package com.atguigu.login.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.atguigu.login.beans.Department;
import com.atguigu.login.beans.Employee;
import com.atguigu.login.utils.ConnectionUtils;
import com.mysql.jdbc.Connection;

public class EmployeeDaoImpl implements EmployeeDao{
	
	Connection conn =null;
	PreparedStatement ps= null;
	@Override
	public List<Employee> selectAllEmps() {
		List<Employee> emps = new ArrayList<Employee>();
	try {
		conn=(Connection) ConnectionUtils.getConn();
		String sql = "select e.id eid,e.last_name,e.email,e.gender,d.id did,d.dept_name from tbl_employee e,tbl_dept d where e.d_id = d.id";
		ps=conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {//下一个
			Employee employee = new Employee();
			employee.setId(rs.getInt("eid"));
			employee.setLastName(rs.getString("last_Name"));
			employee.setEmail(rs.getString("email"));
			employee.setGender(rs.getString("gender"));
			Department dept = new Department();
			dept.setId(rs.getInt("did"));
			dept.setDeptName(rs.getString("dept_name"));
			employee.setDept(dept);
			emps.add(employee);
		}
		return emps;
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			ConnectionUtils.getConn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return null;
	}

}
