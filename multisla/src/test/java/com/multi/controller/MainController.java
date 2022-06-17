
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
	public String index(Model m) {
		return "index";		
	}
	
	@RequestMapping("login")
	public String login(Model m) {
		m.addAttribute("login");
		return "login";
		
	}
	@RequestMapping("loginimpl")
	public String loginimpl(Model m, String uid, String upwd) {
		UsersVO user = null;
		return "index";
	}
}
