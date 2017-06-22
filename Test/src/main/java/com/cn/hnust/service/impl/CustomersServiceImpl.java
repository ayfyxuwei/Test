/**   
* @Title: CustomersServiceImpl.java 
* @Package com.cn.hnust.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）徐伟  
* @date 2017年6月8日 下午3:44:51 
* @version V1.0   
*/
package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.CustomersMapper;
import com.cn.hnust.pojo.Customers;
import com.cn.hnust.service.CustomersService;

/**
 * @ClassName: CustomersServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author (作者) 徐伟
 * @date 2017年6月8日 下午3:44:51
 * @version V1.0
 */
@Service("CustomersService")
public class CustomersServiceImpl implements CustomersService {
	@Resource
	private CustomersMapper customersMapper;
	//全部查詢
	@Override
	public List<Customers> getAll() {
		return customersMapper.selectByExample(null);
	}
//
//	@Override
//	public Customers selectByPrimaryKey(Integer cusId) {
//		// TODO Auto-generated method stub
//
//		return this.customersMapper.selectByPrimaryKey(cusId);
//	}
//
//	 @Override
//	 public void insertSelective(Customers record) {
//
//	 this.customersMapper.insertSelective(record);
//	
//	
//	 }
//
//	@Override
//	public void deleteByPrimaryKey(Integer id) {
//		// TODO Auto-generated method stub
//		this.customersMapper.deleteByPrimaryKey(id);
//	}

	
	

}
