package com.cn.hnust.service;

import com.cn.hnust.pojo.Person;

public interface IPersonService {
	
//	public String loginPerson(Person person);
	//检验用户登陆
	Person checkLogin(String username,String password);
	//按用户名查找数据
	Person selectByUsername(String username);
}
