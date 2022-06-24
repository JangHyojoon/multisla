package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.multi.biz.CarbuildBiz;
import com.multi.biz.ColorBiz;
import com.multi.biz.GarageBiz;
import com.multi.biz.InteriorBiz;
import com.multi.biz.ModelBiz;
import com.multi.biz.UsersBiz;
import com.multi.biz.WheelBiz;

// 신승욱
@Controller
public class MainController3 {
	
	@Autowired
	CarbuildBiz carbuildbiz;
	
	@Autowired
	GarageBiz garagebiz;
	
	@Autowired
	UsersBiz usersbiz;
	
	@Autowired
	ModelBiz modelbiz;
	
	@Autowired
	ColorBiz colorbiz;
	
	@Autowired
	WheelBiz wheelbiz;
	
	@Autowired
	InteriorBiz interiorbiz;
	
	
}
