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
	
	@RequestMapping("/buildmodely")
	public String model02(Model m) {
		m.addAttribute("center", "carbuild/modelY");
		return "/index";
	}
}
