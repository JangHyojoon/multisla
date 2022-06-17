package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.biz.UsersBiz;
import com.multi.vo.UsersVO;

@RestController
public class AjaxController {
	@Autowired
	UsersBiz usersbiz;
	
	@RequestMapping("checkuid")
	public String checkcateid(String uid) {
		String result = "";
		UsersVO c = null;
		
		if(uid.equals("") || uid == null) {
			result =  "1";
			return result;
		}
		
		try {
			c = usersbiz.get(uid);
			if(c == null) {
				result = "0";
			}else {
				result = "1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
