package com.multi.garage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.GarageBiz;
import com.multi.vo.GarageVO;

@SpringBootTest
class SelectTest {

	@Autowired
	GarageBiz biz;
	
	@Test
	void contextLoads() {
		GarageVO obj = null;
		try {
			obj = biz.get(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(obj);
	}

}
