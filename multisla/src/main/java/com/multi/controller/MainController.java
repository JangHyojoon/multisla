package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.UsersBiz;
import com.multi.vo.UsersVO;

@Controller
public class MainController {
	@Autowired
	UsersBiz usersbiz;
	
	@RequestMapping("/")
	public String main(Model m) {
	
		
		return "index";
		
	}
	@RequestMapping("/login")
	public String login(Model m) {
	
		
		return "login";
		
	}
	@RequestMapping("/register")
	public String register(Model m) {
	
		
		return "register";
		
	}
	@RequestMapping("/registerimpl")
	public String registerimpl(Model m, UsersVO v) {
		try {
			usersbiz.register(v);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "register";
		
	}
}
