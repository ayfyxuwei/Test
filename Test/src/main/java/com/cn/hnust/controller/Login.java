/**   
* @Title: Login.java 
* @Package com.cn.hnust.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）徐伟  
* @date 2017年6月8日 上午8:34:36 
* @version V1.0   
*/
package com.cn.hnust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cn.hnust.pojo.Person;
import com.cn.hnust.service.IPersonService;
import com.cn.hnust.service.impl.PersonServiceImpl;

/** 
* @ClassName: Login 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author (作者) 徐伟 
* @date 2017年6月8日 上午8:34:36 
* @version V1.0 
*/
@Controller
public class Login {
	private IPersonService iPersonService;
	@RequestMapping("/login")
	public String login(Person person,Model model){
		person = iPersonService.checkLogin(person.getUsername(), person.getPassword());
		if (person != null)   
        {  
            model.addAttribute("person", person);  
            return "No";  
        } else {  
            return "Ok";  
        }  
	}
}
