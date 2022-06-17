package com.multi.interior;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.InteriorBiz;
import com.multi.vo.InteriorVO;

@SpringBootTest
class SelectTest {

	@Autowired
	InteriorBiz biz;
	
	@Test
	void contextLoads() {
		InteriorVO obj = null;
		try {
			obj = biz.get(400);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(obj);
	}

}
