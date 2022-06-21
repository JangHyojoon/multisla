package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 신승욱
@Controller
public class MainController3 {

	@RequestMapping("/model01")
	public String model01(Model m) {
		m.addAttribute("center", "detail/modelSdetail");
		return "/index";
	}
	
	@RequestMapping("/model02")
	public String model02(Model m) {
		m.addAttribute("center", "detail/modelYdetail");
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
