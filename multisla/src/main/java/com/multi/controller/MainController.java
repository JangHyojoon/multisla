package com.multi.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CarbuildBiz;
import com.multi.biz.ColorBiz;
import com.multi.biz.GarageBiz;
import com.multi.biz.InteriorBiz;
import com.multi.biz.ModelBiz;
import com.multi.biz.OrdersBiz;
import com.multi.biz.OrdersdetailBiz;
import com.multi.biz.UsersBiz;
import com.multi.biz.WheelBiz;
import com.multi.vo.CarbuildVO;
import com.multi.vo.ColorVO;
import com.multi.vo.GarageVO;
import com.multi.vo.InteriorVO;
import com.multi.vo.ModelVO;
import com.multi.vo.OrdersVO;
import com.multi.vo.OrdersdetailVO;
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
	@Autowired
	OrdersdetailBiz ordersdetailbiz;
	
	@RequestMapping("/garage")
	public String garage(Model m,String uid) {
		List<GarageVO> list =null;
		try {
			list =garagebiz.getuid(uid);
			m.addAttribute("ugarage", list);
			m.addAttribute("uid", uid);
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
		Date today = new Date();
		int codeno = 0;
		int ordersno = 0;
		int odetailno = 0;
		try {
			//orders insert
			ordersbiz.register(v);
			gv = garagebiz.get(gid);
			codeno = gv.getCodeno();
			cbv = carbuildbiz.get(codeno);
			cbv.setCorder(true);
			carbuildbiz.modify(cbv);
			
			//ordersdetail insert
			ordersno = ordersbiz.selectlast();
			OrdersdetailVO odv = new OrdersdetailVO("제작중",today,ordersno,codeno);
			ordersdetailbiz.register(odv);
			odetailno = ordersdetailbiz.selectlast();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return "redirect:garagedetail?gid="+gid;
	}
	@RequestMapping("/ordersdetail")
	public String ordersdetail(Model m,int codeno) {
		OrdersdetailVO odv = null;
		OrdersVO ov = null;
		ModelVO mv = null;
		ColorVO cv =null;
		WheelVO wv =null;
		InteriorVO iv = null;
		
		int ordersno = 0;
		int mid=0;
		int colid =0;
		int wid=0;
		int iid=0;
		try {
			odv = ordersdetailbiz.selectcodeno(codeno);
			ordersno = odv.getOrdersno();
			ov = ordersbiz.get(ordersno);
			m.addAttribute("od", odv);
			m.addAttribute("o", ov);
			mid=ov.getMid();
			mv = modelbiz.get(mid);
			m.addAttribute("m",mv);
			colid=ov.getColid();
			cv = colorbiz.get(colid);
			m.addAttribute("c",cv);
			wid = ov.getWid();
			wv = wheelbiz.get(wid);
			m.addAttribute("w",wv);
			iid = ov.getIid();
			iv = interiorbiz.get(iid);
			m.addAttribute("i",iv);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		m.addAttribute("center", "ordersdetail");
		return "index";
	}
	
	// MainController 2
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
	
	// MainController3
	// always return garage list for index.html
		@ModelAttribute("cartlist")
		public List<GarageVO> cartmenu() {
			List<GarageVO> cartlist = null;
			try {
				cartlist = garagebiz.getcart();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return cartlist;
		}
		
		// go to model S detail page
		@RequestMapping("/models")
		public String models(Model m) {
			m.addAttribute("center", "detail/modelSdetail");
			return "index";
		}
		
		// build model Y
		@RequestMapping("/buildmodely")
		public String buildmodely(Model m, HttpSession session) {
			ModelVO model = null;
			List<ColorVO> color = null;
			List<WheelVO> wheel = null;
			List<InteriorVO> inter = null;
			try {
				model = modelbiz.get(101);
				color = colorbiz.get();
				wheel = wheelbiz.get();
				inter = interiorbiz.get();
			} catch (Exception e) {
				e.printStackTrace();
			}
			m.addAttribute("model", model);
			m.addAttribute("color", color);
			m.addAttribute("wheel", wheel);
			m.addAttribute("interior", inter);
			m.addAttribute("session", session.getAttribute("loginusers"));
			m.addAttribute("center", "carbuild/modelY");
			return "index";
		}
		
		// build model S
		@RequestMapping("/buildmodels")
		public String carbuild(Model m, HttpSession session) {
			ModelVO model = null;
			List<ColorVO> color = null;
			List<WheelVO> wheel = null;
			List<InteriorVO> inter = null;
			try {
				model = modelbiz.get(100);
				color = colorbiz.get();
				wheel = wheelbiz.get();
				inter = interiorbiz.get();
			} catch (Exception e) {
				e.printStackTrace();
			}
			m.addAttribute("model", model);
			m.addAttribute("color", color);
			m.addAttribute("wheel", wheel);
			m.addAttribute("interior", inter);
			m.addAttribute("session", session.getAttribute("loginusers"));
			m.addAttribute("center", "carbuild/modelS");
			return "index";
		}
		
		// build model X
		@RequestMapping("/buildmodelx")
		public String buildmodelx(Model m, HttpSession session) {
			ModelVO model = null;
			List<ColorVO> color = null;
			List<WheelVO> wheel = null;
			List<InteriorVO> inter = null;
			try {
				model = modelbiz.get(102);
				color = colorbiz.get();
				wheel = wheelbiz.get();
				inter = interiorbiz.get();
			} catch (Exception e) {
				e.printStackTrace();
			}
			m.addAttribute("model", model);
			m.addAttribute("color", color);
			m.addAttribute("wheel", wheel);
			m.addAttribute("interior", inter);
			m.addAttribute("session", session.getAttribute("loginusers"));
			m.addAttribute("center", "carbuild/modelX");
			return "index";
		}
		
		
		// build -> garage
		// login 상태에서 build하면 garage로 이동
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
		// login하지 않고 build할 때, login으로 이동
		@RequestMapping("/buildlogin")
		public String buildlogin(Model m) {
			m.addAttribute("center", "carbuild/login");
			return "index";
		}
		
		// build -> login -> garage
		// login하지 않고 build할 때, login 성공하면 쿠키 정보를 garage로 register
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
			for (Cookie c : cookie) {	// cookie value를 변수에 담기
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
			try {	// cookie값을 담은 변수로 carbuild를 register하고 그 후에 garage에 register
				carbuildbiz.register(new CarbuildVO(mid, colid, wid, iid, corder));
				int codeno = carbuildbiz.selectlast();
				garagebiz.register(new GarageVO(codeno, users.getUid()));
			} catch (Exception e) {
				e.printStackTrace();
			}
			m.addAttribute("center", "garage/garage");
			return "redirect:/garage?uid="+users.getUid();
		}
		
		// build -> login -> register
		// build 후 login에서 계정이 없을 때 register로 이동
		@RequestMapping("/buildregister")
		public String buildregister(Model m) {
			m.addAttribute("center", "carbuild/register");
			return "index";
		}
		
		// build -> login -> register -> garage
		// 회원가입을 하고 자동 로그인 후 garage로 이동
		@RequestMapping("/build_register")
		public String build_register(Model m, UsersVO obj, HttpSession session, HttpServletRequest resq) {
			UsersVO users = null;
			try {
				usersbiz.register(obj);
				users = usersbiz.get(obj.getUid());
				session.setAttribute("loginusers", users);	// 자동 로그인
				m.addAttribute("loginusers", users);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Cookie[] cookie = resq.getCookies();	// servlet에서 쿠키 요청 후 cookie 배열에 담기
			int mid = 0;
			int colid = 0;
			int wid = 0;
			int iid = 0;
			boolean corder = false;
			for (Cookie c : cookie) {		// 각각의 변수에 쿠키의 value 넣기
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
			try {	// 받아 온 쿠키 value를 기반으로 carbuild에 register, garage에도 register
				carbuildbiz.register(new CarbuildVO(mid, colid, wid, iid, corder));
				int codeno = carbuildbiz.selectlast();
				garagebiz.register(new GarageVO(codeno, users.getUid()));
			} catch (Exception e) {
				e.printStackTrace();
			}
			m.addAttribute("center", "garage/garage");
			return "redirect:/garage?uid="+users.getUid();
		}
		
		// garage detail -> modify build
		// 차고 상세 조회에서 수정하기 누르면 수정 페이지로 이동
		@RequestMapping("/modifygarage")
		public String modifygarage(Model mo, int gid) {
			GarageVO g = null;
			CarbuildVO car = null;
			ModelVO m = null;
			ColorVO c = null;
			WheelVO w = null;
			InteriorVO i = null;
			List<ColorVO> color = null;
			List<WheelVO> wheel = null;
			List<InteriorVO> inter = null;
			try {
				g = garagebiz.get(gid);
				car = carbuildbiz.get(g.getCodeno());
				m = modelbiz.get(car.getMid());
				c = colorbiz.get(car.getColid());
				w = wheelbiz.get(car.getWid());
				i = interiorbiz.get(car.getIid());
				color = colorbiz.get();
				wheel = wheelbiz.get();
				inter = interiorbiz.get();
			} catch (Exception e) {
				e.printStackTrace();
			}
			mo.addAttribute("g", g);
			mo.addAttribute("car", car);
			mo.addAttribute("m", m);
			mo.addAttribute("c",c);
			mo.addAttribute("w", w);
			mo.addAttribute("i", i);
			mo.addAttribute("color", color);
			mo.addAttribute("wheel", wheel);
			mo.addAttribute("interior", inter);
			mo.addAttribute("center", "garage/modify");
			return "index";
		}
		
		// modify build -> garage
		// 수정페이지에서 modify 하고 garage로 이동
		@RequestMapping("/modifybuild")
		public String modifybuild(Model m, CarbuildVO obj, String uid, int gid) {
			try {
				carbuildbiz.modify(obj);
			} catch (Exception e) {
				e.printStackTrace();
			}
			m.addAttribute("center", "garage/garagedetail");
			return "redirect:/garagedetail?gid="+gid;
		}
}
