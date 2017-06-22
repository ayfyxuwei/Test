/**   
* @Title: DepartmentService.java 
* @Package com.cn.hnust.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）徐伟  
* @date 2017年6月13日 上午10:44:45 
* @version V1.0   
*/
package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Department;



/** 
* @ClassName: DepartmentService 
* @Description: 职位 
* @author (作者) 徐伟 
* @date 2017年6月13日 上午10:44:45 
* @version V1.0 
*/
public interface DepartmentService {
	
		List<Department> getDepts();
}
