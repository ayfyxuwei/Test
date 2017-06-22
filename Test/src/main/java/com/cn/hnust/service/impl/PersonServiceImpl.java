package com.cn.hnust.service.impl;



import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.cn.hnust.dao.PersonMapper;
import com.cn.hnust.pojo.Person;
import com.cn.hnust.service.IPersonService;

@Service("personService")
public class PersonServiceImpl implements IPersonService {

	@Resource
	private PersonMapper personMapper;
	
//	private static Logger logger = Logger.getLogger(LoginController.class);
	//检验用户登陆业务
	@Override
	public Person checkLogin(String username, String password) {
		Person person = personMapper.selectByUsername(username);
		if(person != null && person.getPassword().equals(password)){
			return person;
		}
		return null;
	}

	
	@Override
	public Person selectByUsername(String username) {
		
		return this.personMapper.selectByUsername(username);
	}
}
