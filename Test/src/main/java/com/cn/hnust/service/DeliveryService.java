/**   
* @Title: Delivery.java 
* @Package com.cn.hnust.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）徐伟  
* @date 2017年6月13日 下午2:23:31 
* @version V1.0   
*/
package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Delivery;

/** 
* @ClassName: Delivery 
* @Description: 送貨接口
* @author (作者) 徐伟 
* @date 2017年6月13日 下午2:23:31 
* @version V1.0 
*/
public interface DeliveryService {
	List<Delivery> getAll();
}
