package com.multi.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ModelBiz;
import com.multi.vo.ModelVO;

@SpringBootTest
class ModelInsertTest {

	@Autowired
	ModelBiz biz;
	
	@Test
	void contextLoads() {
		ModelVO c = new ModelVO("카니발23",2232,32);
		try {
			biz.register(c);
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}

 }
}
