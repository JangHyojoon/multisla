package com.multi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.ModelBiz;
import com.multi.biz.UsersBiz;
import com.multi.vo.GarageVO;
import com.multi.vo.ModelVO;
import com.multi.vo.UsersVO;

@Controller
public class MainController2 {
	
	@Autowired
	ModelBiz modelbiz;
	
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
	

	

	// build model X
	@RequestMapping("/modelbuildtest")
	public String modelbuildtest(Model m, int mid) {
		ModelVO mlist = null;
		try {
			mlist = modelbiz.get(mid);
			m.addAttribute("model",mlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "carbuild/modelbuildtest");
		return "index";
	}
	


}
