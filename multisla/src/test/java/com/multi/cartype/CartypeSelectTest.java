package com.multi.cartype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartypeBiz;
import com.multi.vo.CartypeVO;

@SpringBootTest
class CartypeSelectTest {
	
	@Autowired
	CartypeBiz biz;

	@Test
	void contextLoads() {
		CartypeVO c = null;
		try {
			c = biz.get(50);
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
