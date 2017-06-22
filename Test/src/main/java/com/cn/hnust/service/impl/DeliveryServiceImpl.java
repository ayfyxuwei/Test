/**   
* @Title: DeliveryServiceImpl.java 
* @Package com.cn.hnust.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）徐伟  
* @date 2017年6月13日 下午2:25:19 
* @version V1.0   
*/
package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.DeliveryMapper;
import com.cn.hnust.pojo.Delivery;
import com.cn.hnust.service.DeliveryService;

/** 
* @ClassName: DeliveryServiceImpl 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author (作者) 徐伟 
* @date 2017年6月13日 下午2:25:19 
* @version V1.0 
*/
@Service("DeliveryService")
public class DeliveryServiceImpl implements DeliveryService{

	@Resource
	private DeliveryMapper deliveryMapper;
	@Override
	public List<Delivery> getAll() {
		
		return deliveryMapper.selectByExample(null);
	}

}
