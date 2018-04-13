package com.czk.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.czk.entity.User;
import com.czk.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userServiceImpl;
	
	@RequestMapping("/insert")
	public String insertUser() {
		User user = new User();
		user.setName("小王子");
		user.setAge(23);
		user.setSex("男");
		boolean result = userServiceImpl.insertUser(user);
		if(result == true) {
			return "success";
		}else {
			return "false";
		}
	}
}
