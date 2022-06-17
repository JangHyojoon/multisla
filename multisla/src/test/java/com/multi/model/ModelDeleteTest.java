package com.multi.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartypeBiz;
import com.multi.biz.ModelBiz;

@SpringBootTest
class ModelDeleteTest {

	@Autowired
	ModelBiz biz;
	
	@Test
	void contextLoads() {
		try {
			biz.remove(108);
			System.out.println("deteted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
