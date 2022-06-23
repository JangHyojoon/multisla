package com.multi.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CarbuildBiz;
import com.multi.biz.GarageBiz;
import com.multi.biz.UsersBiz;
import com.multi.vo.CarbuildVO;
import com.multi.vo.GarageVO;
import com.multi.vo.UsersVO;

// 신승욱
@Controller
public class MainController3 {
	
	@Autowired
	CarbuildBiz carbuildbiz;
	
	@Autowired
	GarageBiz garagebiz;
	
	@Autowired
	UsersBiz usersbiz;
	
	// go to model S detail page
	@RequestMapping("/models")
	public String models(Model m) {
		m.addAttribute("center", "detail/modelSdetail");
		return "index";
	}
	
	// build model Y
	@RequestMapping("/buildmodely")
	public String buildmodely(Model m) {
		m.addAttribute("center", "carbuild/modelY");
		return "index";
	}
	
	// build model S
	@RequestMapping("/buildmodels")
	public String carbuild(Model m, HttpSession session) {
		m.addAttribute("session", session.getAttribute("loginusers"));
		m.addAttribute("center", "carbuild/modelS");
		return "index";
	}
	
	// build model X
	@RequestMapping("/buildmodelx")
	public String buildmodelx(Model m) {
		m.addAttribute("center", "carbuild/modelX");
		return "index";
	}
	
	
	// build -> garage
	@RequestMapping("/gogarage")
	public String gogarage(Model m, CarbuildVO obj, String uid) {
		int codeno = 0;
		try {
			carbuildbiz.register(obj);				// register obj to carbuild table
			codeno = carbuildbiz.selectlast();		// get PK FROM latest registered carbuild tuple
			GarageVO g = new GarageVO(codeno, uid);	// create new GarageVO object
			garagebiz.register(g);					// register GarageVO object
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "garage/garage");
		return "redirect:/garage?uid="+uid;
	}
	
	// build -> login
	@RequestMapping("/buildlogin")
	public String buildlogin(Model m) {
		m.addAttribute("center", "carbuild/login");
		return "index";
	}
	
	// build -> login -> garage
	@RequestMapping("/logintogarage")
	public String logintogarage(Model m, String uid, String upwd, HttpSession session, HttpServletRequest resq) {
		UsersVO users = null;
		try {
			users = usersbiz.get(uid);
			if (users != null) {
				if (users.getUpwd().equals(upwd)) {
					session.setAttribute("loginusers", users);
					m.addAttribute("loginusers", users);
				} else {
					throw new Exception();
				}
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			m.addAttribute("center", "carbuild/login");
			m.addAttribute("msg", "회원정보를 확인해주세요");
			return "index";
		}
		Cookie[] cookie = resq.getCookies();
		int mid = 0;
		int colid = 0;
		int wid = 0;
		int iid = 0;
		boolean corder = false;
		for (Cookie c : cookie) {
			if (c.getName().equals("mid")) {
				mid = Integer.parseInt(c.getValue());
			}
			if (c.getName().equals("colid")) {
				colid = Integer.parseInt(c.getValue());
			}
			if (c.getName().equals("wid")) {
				wid = Integer.parseInt(c.getValue());
			}
			if (c.getName().equals("iid")) {
				iid = Integer.parseInt(c.getValue());
			}
			if (c.getName().equals("corder")) {
				corder = Boolean.parseBoolean(c.getValue());
			}
		}
		try {
			carbuildbiz.register(new CarbuildVO(mid, colid, wid, iid, corder));
			int codeno = carbuildbiz.selectlast();
			garagebiz.register(new GarageVO(codeno, uid));
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "garage/garage");
		return "redirect:/garage?uid="+uid;
	}
}
