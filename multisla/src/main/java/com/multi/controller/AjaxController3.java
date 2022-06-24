package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.biz.CarbuildBiz;
import com.multi.biz.ColorBiz;
import com.multi.biz.InteriorBiz;
import com.multi.biz.ModelBiz;
import com.multi.biz.WheelBiz;
import com.multi.vo.CarbuildVO;
import com.multi.vo.ColorVO;
import com.multi.vo.InteriorVO;
import com.multi.vo.ModelVO;
import com.multi.vo.WheelVO;

@RestController
public class AjaxController3 {
	@Autowired
	CarbuildBiz carbuildbiz;
	
	@Autowired
	ModelBiz modelbiz;
	
	@Autowired
	ColorBiz colorbiz;
	
	@Autowired
	WheelBiz wheelbiz;
	
	@Autowired
	InteriorBiz interiorbiz;
	
	// carbuild와 modify에서 가격 표시를 위해 사용
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
	
	// modify에서 id를 입력 받아 해당 id에 맞는 option name을 return
	@RequestMapping("getname")
	public String getname(int id) {
		String result = "";
		ModelVO model = null;
		ColorVO color = null;
		WheelVO wheel = null;
		InteriorVO interior = null;
		try {
			model = modelbiz.get(id);
			color = colorbiz.get(id);
			wheel = wheelbiz.get(id);
			interior = interiorbiz.get(id);
			if (model != null) {
				result =  model.getMname();
			}else if (color != null) {
				result =  color.getColoption();
			}else if (wheel != null) {
				result =  wheel.getWoption();
			}else if (interior != null) {
				result =  interior.getIoption();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
