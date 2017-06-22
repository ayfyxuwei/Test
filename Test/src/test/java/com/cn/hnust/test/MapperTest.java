/**   
* @Title: MapperTest.java 
* @Package com.cn.hnust.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）徐伟  
* @date 2017年6月8日 下午2:45:59 
* @version V1.0   
*/
package com.cn.hnust.test;


import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cn.hnust.pojo.Employee;
import com.cn.hnust.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/** 
* @ClassName: MapperTest 
* @Description: employeesMapper客户测试类
* @author (作者) 徐伟 
* @date 2017年6月8日 下午2:45:59 
* @version V1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class MapperTest {
	@Resource
	EmployeeService employeeService;
	
	@Test
	public void CrufTest(){
	//	System.out.println(employeesMapper);
		 
	//	employeesMapper.insert(new  employees(null,"aa","女","地址啊地址","12345678911","dd"));
	//	PageHelper.startPage(1,5);
		List<Employee> list = employeeService.getAll();
	//	System.out.println("当前页码："+list.);
	//	PageInfo page = new PageInfo(list);
//		System.out.println("当前页码："+page.getPageNum());
//		System.out.println("总页码："+page.getPages());
//		System.out.println("总记录数："+page.getTotal());
//		System.out.println("在页面需要连续显示的页码");
//		int[] nums = page.getNavigatepageNums();
//		for (int i : nums) {
//			System.out.print(" "+i);
//		}
		
		for(Employee employee:list){
			System.out.println("ID："+employee.getEmpId()+"==>Name:"+employee.getEmpName()+"==>email:"+employee.getEmail()+"==>gender:"+employee.getGender()+"==>职位:"+employee.getdId());
		}
	}
}
