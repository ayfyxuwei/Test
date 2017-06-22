/**   
* @Title: CustomersService.java 
* @Package com.cn.hnust.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）徐伟  
* @date 2017年6月9日 下午2:48:25 
* @version V1.0   
*/
package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Customers;

/** 
* @ClassName: CustomersService 
* @Description: 
* @author (作者) 徐伟 
* @date 2017年6月9日 下午2:48:25 
* @version V1.0 
*/
public interface CustomersService {
	
//	Customers selectByPrimaryKey(Integer cusId);
//	
//	 void deleteByPrimaryKey(Integer cusId);
//
//	 void  insertSelective(Customers record);
	 //查询全部数据	 
	 List<Customers> getAll();
	 
	 
}
