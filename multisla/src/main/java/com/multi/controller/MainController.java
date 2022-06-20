package com.multi.controller;

import javax.servlet.http.HttpSession;

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

		m.addAttribute("center", "center");

		return "index";

	}
	@RequestMapping("/login")
	public String login(Model m,String msg) {
		if(msg != null && msg.equals("f")) {
			m.addAttribute("msg", "회원정보를 확인해주세요");
	
		}
		m.addAttribute("center", "login");
		return "/index";

	}
	@RequestMapping("/logout")
	public String logout(Model m,HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
		return "index";
	}
	
	@RequestMapping("/register")
	public String register(Model m, String msg) {

		m.addAttribute("center", "register");
		return "/index";
	}
	
	@RequestMapping("/registerimpl")
	public String registerimpl(Model m, UsersVO v) {
		try {

		
			usersbiz.register(v);
		} catch (Exception e) {
			e.printStackTrace();
		
		}

		return "redirect:login";


	}
	@RequestMapping("/loginimpl")
	public String loginimpl(Model m, String uid, String upwd, HttpSession session) {

		
		UsersVO users = null;
		
		try {
			users = usersbiz.get (uid);
			if(users != null) {
				if(users.getUpwd().equals(upwd)) {
					session.setAttribute("loginusers", users);
					m.addAttribute("loginusers", users);
					
					
				}else {
					throw new Exception();
				}
					
			}else {
				throw new Exception();
			}
			
		} catch (Exception e) {
			return "redirect:login?msg=f";
		}
		
	
		return "index";
	}
}
