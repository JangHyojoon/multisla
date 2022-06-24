package com.multi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.UsersBiz;
import com.multi.vo.GarageVO;
import com.multi.vo.UsersVO;

@Controller
public class MainController2 {
	
	@RequestMapping("/modely")
	public String modely(Model m) {
		m.addAttribute("center", "detail/modelYdetail");
		return "/index";
	}
	
	@RequestMapping("/modelx")
	public String modelx(Model m) {
		m.addAttribute("center", "detail/modelXdetail");
		return "/index";
	}
	

	


}
