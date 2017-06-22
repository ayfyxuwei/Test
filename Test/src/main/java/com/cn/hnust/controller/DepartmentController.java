/**   
* @Title: DepartmentController.java 
* @Package com.cn.hnust.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）徐伟  
* @date Jun 14, 2017 3:44:29 PM 
* @version V1.0   
*/
package com.cn.hnust.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.pojo.Department;
import com.cn.hnust.pojo.Msg;
import com.cn.hnust.service.DepartmentService;

/** 
* @ClassName: DepartmentController 
* @Description: 处理和部门有关的请求 
* @author (作者) 徐伟 
* @date Jun 14, 2017 3:44:29 PM 
* @version V1.0 
*/
@Controller
public class DepartmentController {
	
	@Resource
	private DepartmentService departmentService;
	
	@RequestMapping("/depts")
	@ResponseBody
	public Msg getDepts(){
		//查出的所有部门信息
		List<Department> list = departmentService.getDepts();
		return Msg.success().add("depts", list);
	}
}
