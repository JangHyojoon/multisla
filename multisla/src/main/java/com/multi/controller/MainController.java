package com.multi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CarbuildBiz;
import com.multi.biz.ColorBiz;
import com.multi.biz.GarageBiz;
import com.multi.biz.InteriorBiz;
import com.multi.biz.ModelBiz;
import com.multi.biz.OrdersBiz;
import com.multi.biz.UsersBiz;
import com.multi.biz.WheelBiz;
import com.multi.vo.CarbuildVO;
import com.multi.vo.ColorVO;
import com.multi.vo.GarageVO;
import com.multi.vo.InteriorVO;
import com.multi.vo.ModelVO;
import com.multi.vo.OrdersVO;
import com.multi.vo.UsersVO;
import com.multi.vo.WheelVO;

@Controller
public class MainController {
	@Autowired
	UsersBiz usersbiz;
	@Autowired
	GarageBiz garagebiz;
	@Autowired
	ColorBiz colorbiz;
	@Autowired
	WheelBiz wheelbiz;
	@Autowired
	InteriorBiz interiorbiz;
	@Autowired
	ModelBiz modelbiz;
	@Autowired
	OrdersBiz ordersbiz;
	@Autowired
	CarbuildBiz carbuildbiz;
	@RequestMapping("/garage")
	public String garage(Model m,String uid) {
		List<GarageVO> list =null;
		try {
			list =garagebiz.getuid(uid);
			m.addAttribute("ugarage", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "garage/garage");
	
		return "index";

	}
	@RequestMapping("/garagedetail")
	public String garagedetail(Model m,int gid) {
		GarageVO list =null;
		try {
			list =garagebiz.get(gid);
			m.addAttribute("ugarage", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "garage/garagedetail");
	
		return "index";

	}
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
	@RequestMapping("/delete")
	public String delete(Model m,int gid) {
		GarageVO gv = null;
		String uid=null;
		try {
		
			gv =garagebiz.get(gid);
			garagebiz.remove(gid) ;
			uid=gv.getUid();
		} catch (Exception e) {
			e.printStackTrace();
		
		}

		return "redirect:garage?uid="+ uid;


	}

	@RequestMapping("/orders")
	public String orders(Model m,int gid) {
		GarageVO gv =null;
		UsersVO uv =null;
		ModelVO mv = null;
		ColorVO cv =null;
		WheelVO wv =null;
		InteriorVO iv = null;
		String uid =null;
		int mid=0;
		int colid =0;
		int wid=0;
		int iid=0;
		
		try {
			gv = garagebiz.get(gid);
			uid = gv.getUid();
			uv =usersbiz.get(uid);
			mid=gv.getMid();
			mv = modelbiz.get(mid);
			colid=gv.getColid();
			cv = colorbiz.get(colid);
			wid=gv.getWid();
			wv = wheelbiz.get(wid);
			iid=gv.getIid();
			iv = interiorbiz.get(iid);
			m.addAttribute("garage", gv);
			m.addAttribute("users", uv);
			m.addAttribute("model", mv);
			m.addAttribute("color", cv);
			m.addAttribute("wheel", wv);
			m.addAttribute("interior", iv);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		m.addAttribute("center", "orders");
		return "index";


	}
	@RequestMapping("/ordersimpl")
	public String ordersimpl(Model m,OrdersVO v,int gid) {

		GarageVO gv =null;
		CarbuildVO cbv = null;
		int codeno = 0;
		
		
		try {
			ordersbiz.register(v);
			gv = garagebiz.get(gid);
			codeno = gv.getCodeno();
			cbv = carbuildbiz.get(codeno);
			cbv.setCorder(true);
			carbuildbiz.modify(cbv);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		m.addAttribute("center", "center");
		return "index";
	}
}
