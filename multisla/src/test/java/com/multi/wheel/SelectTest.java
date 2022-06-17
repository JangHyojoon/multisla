package com.multi.wheel;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.WheelBiz;
import com.multi.vo.WheelVO;

@SpringBootTest
class SelectTest {

	@Autowired
	WheelBiz biz;
	
	@Test
	void contextLoads() {
		WheelVO obj = null;
		try {
			obj = biz.get(301);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(obj);
	}

}
