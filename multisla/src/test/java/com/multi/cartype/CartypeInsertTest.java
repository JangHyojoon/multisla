package com.multi.cartype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartypeBiz;
import com.multi.vo.CartypeVO;

@SpringBootTest
class CartypeInsertTest {

	@Autowired
	CartypeBiz biz;
	
	@Test
	void contextLoads() {
		CartypeVO cartype = new CartypeVO(50, "소형33");
		try {
			biz.register(cartype);
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}

 }
}
