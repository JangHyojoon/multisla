package com.multi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CarbuildBiz;
import com.multi.vo.CarbuildVO;

// 신승욱
@Controller
public class MainController3 {
	
	@Autowired
	CarbuildBiz carbuildbiz;
	
	// go to model S detail page
	@RequestMapping("/model01")
	public String model01(Model m) {
		m.addAttribute("center", "detail/modelSdetail");
		return "/index";
	}
	
	// build model Y
	@RequestMapping("/buildmodely")
	public String buildmodely(Model m) {
		m.addAttribute("center", "carbuild/modelY");
		return "/index";
	}
	
	// build model S
	@RequestMapping("/carbuild")
	public String carbuild(Model m, HttpSession session) {
		m.addAttribute("session", session.getAttribute("loginusers"));
		m.addAttribute("center", "carbuild/carbuild");
		return "/index";
	}
	
	// build model X
	@RequestMapping("/buildmodelx")
	public String buildmodelx(Model m) {
		m.addAttribute("center", "carbuild/modelX");
		return "/index";
	}
	
	
	// build -> garage
	@RequestMapping("/gogarage")
	public String gogarage(Model m, CarbuildVO obj) {
		System.out.println(obj);
//		carbuildbiz.register(obj);
//		CarbuildVO build = null;
//		build = carbuildbiz.get();
//		m.addAttribute("carbuild", obj);
//		m.addAttribute("center", "garage/garage");
		return "/index";
	}
		
}
