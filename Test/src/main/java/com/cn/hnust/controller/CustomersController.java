/**   
* @Title: CustomersController.java 
* @Package com.cn.hnust.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）徐伟  
* @date 2017年6月9日 上午9:16:12 
* @version V1.0   
*/
package com.cn.hnust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.dao.CustomersMapper;
import com.cn.hnust.pojo.Customers;
import com.cn.hnust.pojo.Msg;
import com.cn.hnust.service.CustomersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/** 
* @ClassName: CustomersController 
* @Description: 处理员工CRUD请求 
* @author (作者) 徐伟 
* @date 2017年6月9日 上午9:16:12 
* @version V1.0 
*/
@Controller
public class CustomersController {
	//调用service层
	@Autowired
	CustomersService customersService;
	/*
	 * 查询全部客户数据（分页查询）
	 * 
	 */
	@RequestMapping("/cus")
	public String getCus(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Model model) {
		// 这不是一个分页查询；
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询	
		List<Customers> cus = customersService.getAll();
		//使用Pageinfo包装查询后的结果，只需要将pageInfo交给页面。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(cus, 5);
		model.addAttribute("pageInfo", page);
		return "cus";
	}
}
