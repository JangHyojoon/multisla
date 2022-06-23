package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.biz.CarbuildBiz;
import com.multi.vo.CarbuildVO;

@RestController
public class AjaxController3 {
	@Autowired
	CarbuildBiz carbuildbiz;
	
	@RequestMapping("getprice")
	public int getprice(int mid, int colid, int wid, int iid) {
		CarbuildVO c = new CarbuildVO(mid, colid, wid, iid, false);
		int result = 0;
		try {
			result = carbuildbiz.selectprice(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
