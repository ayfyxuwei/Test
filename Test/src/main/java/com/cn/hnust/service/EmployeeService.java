/**   
* @Title: Employee.java 
* @Package com.cn.hnust.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）徐伟  
* @date 2017年6月13日 上午10:47:02 
* @version V1.0   
*/
package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Employee;

/** 
* @ClassName: Employee 
* @Description: 员工接口 
* @author (作者) 徐伟 
* @date 2017年6月13日 上午10:47:02 
* @version V1.0 
*/
public interface EmployeeService {
	//全部员工查询
	List<Employee> getAll();
	//员工保存
	void saveEmp(Employee employee);
	//检查用户名是否可用
	boolean checkUser(String empName);
	//根据id查询员工
	Employee getEmp(Integer id);
	
	void updateEmp(Employee employee);
	
}
