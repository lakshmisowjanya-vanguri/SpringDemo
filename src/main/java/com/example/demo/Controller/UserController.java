package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

@RestController
public class UserController {
	@RequestMapping("/User")
	
	public User getUser() {
		return user;
	}
	User user=new User("sowji","female");
}
