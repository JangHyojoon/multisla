package com.multi.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ModelBiz;
import com.multi.vo.ModelVO;

@SpringBootTest
class ModelSelectTest {
	
	@Autowired
	ModelBiz biz;

	@Test
	void contextLoads() {
		ModelVO c = null;
		try {
			c = biz.get(100);
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
