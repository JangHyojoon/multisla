package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.UsersBiz;
import com.multi.vo.UsersVO;

@Controller
public class MainController2 {
	
	@RequestMapping("carbuild")
	public String carbuild(Model m) {

		m.addAttribute("center", "carbuild");

		return "index";

	}

}
