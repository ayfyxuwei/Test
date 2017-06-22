/**   
* @Title: EmployeeServiceImpl.java 
* @Package com.cn.hnust.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）徐伟  
* @date 2017年6月13日 上午10:47:36 
* @version V1.0   
*/
package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.EmployeeMapper;
import com.cn.hnust.pojo.Employee;
import com.cn.hnust.pojo.EmployeeExample;
import com.cn.hnust.pojo.EmployeeExample.Criteria;
import com.cn.hnust.service.EmployeeService;

/** 
* @ClassName: EmployeeServiceImpl 
* @Description: 员工接口实现
* @author (作者) 徐伟 
* @date 2017年6月13日 上午10:47:36 
* @version V1.0 
*/
@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Resource
	private EmployeeMapper employeeMapper;
	
	@Override
	public List<Employee> getAll() {
		
		return employeeMapper.selectByExampleWithDept(null);
	}

	/* (非 Javadoc) 
	* <p>Title: saveEmp</p> 
	* <p>Description: 员工新增保存</p> 
	* @param employee 
	* @see com.cn.hnust.service.EmployeeService#saveEmp(com.cn.hnust.pojo.Employee) 
	*/
	@Override
	public void saveEmp(Employee employee) {
		// TODO Auto-generated method stub
		employeeMapper.insertSelective(employee);
		
	}

	/* (非 Javadoc) 
	* <p>Title: checkUser</p> 
	* <p>Description: 检查员工用户名是否可用</p> 
	* @param empName
	* @return true当前姓名可用 false当前姓名不可用
	* @see com.cn.hnust.service.EmployeeService#checkUser(java.lang.String) 
	*/
	@Override
	public boolean checkUser(String empName) {
		// TODO Auto-generated method stub
		EmployeeExample example = new EmployeeExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmpNameEqualTo(empName);
		long count = employeeMapper.countByExample(example);
		return count == 0;
	}

	/* (非 Javadoc) 
	* <p>Title: getEmp</p> 
	* <p>Description: 根据id查询员工</p> 
	* @param id
	* @return 
	* @see com.cn.hnust.service.EmployeeService#getEmp(java.lang.Integer) 
	*/
	@Override
	public Employee getEmp(Integer id) {
		// TODO Auto-generated method stub
		Employee employee = employeeMapper.selectByPrimaryKey(id);
		return employee;
	}

	/* (非 Javadoc) 
	* <p>Title: updateEmp</p> 
	* <p>Description: 修改保存</p> 
	* @param employee 
	* @see com.cn.hnust.service.EmployeeService#updateEmp(com.cn.hnust.pojo.Employee) 
	*/
	@Override
	public void updateEmp(Employee employee) {
		// TODO Auto-generated method stub
		employeeMapper.updateByPrimaryKeySelective(employee);
	}
	
	
}
