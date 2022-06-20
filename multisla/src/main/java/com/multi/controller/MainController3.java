package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.UsersBiz;

// 신승욱
@Controller
public class MainController3 {
	@Autowired
	UsersBiz usersbiz;

	@RequestMapping("/model01")
	public String model01(Model m) {
		m.addAttribute("center", "detail/modeldetail");
		return "index";
	}
	
	@RequestMapping("/model02")
	public String model02(Model m) {
		m.addAttribute("center", "model02");
		return "/index";
	}
	
	@RequestMapping("/model03")
	public String model03(Model m) {
		m.addAttribute("center", "model03");
		return "/index";
	}
	
	@RequestMapping("/model04")
	public String model04(Model m) {
		m.addAttribute("center", "model04");
		return "/index";
	}
}