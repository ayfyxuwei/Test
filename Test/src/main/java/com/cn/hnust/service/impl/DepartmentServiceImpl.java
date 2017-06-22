/**   
* @Title: DepartmentServiceImpl.java 
* @Package com.cn.hnust.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）徐伟  
* @date 2017年6月13日 上午10:45:14 
* @version V1.0   
*/
package com.cn.hnust.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.DepartmentMapper;
import com.cn.hnust.pojo.Department;
import com.cn.hnust.service.DepartmentService;

/** 
* @ClassName: DepartmentServiceImpl 
* @Description: 职位实现 
* @author (作者) 徐伟 
* @date 2017年6月13日 上午10:45:14 
* @version V1.0 
*/
@Service("DepartmentService")
public class DepartmentServiceImpl implements DepartmentService{
	
	@Resource
	private DepartmentMapper departmentMapper;
	/* (非 Javadoc) 
	* <p>Title: getDepts</p> 
	* <p>Description: </p> 
	* @return 
	* @see com.cn.hnust.service.DepartmentService#getDepts() 
	*/
	@Override
	public List<Department> getDepts() {
		// TODO Auto-generated method stub
		List<Department> list = departmentMapper.selectByExample(null);
		return list;
	}
}
