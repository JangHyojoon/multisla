package com.multi.color;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ColorBiz;
import com.multi.vo.ColorVO;

@SpringBootTest
class SelectTest {

	@Autowired
	ColorBiz biz;
	
	@Test
	void contextLoads() {
		ColorVO obj = null;
		try {
			obj = biz.get(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(obj);
	}

}
