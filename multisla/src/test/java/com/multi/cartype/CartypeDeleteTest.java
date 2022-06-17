package com.multi.cartype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartypeBiz;

@SpringBootTest
class CartypeDeleteTest {

	@Autowired
	CartypeBiz biz;
	
	@Test
	void contextLoads() {
		try {
			biz.remove(44);
			System.out.println("deteted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
