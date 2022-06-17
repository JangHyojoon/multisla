package com.multi.cartype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartypeBiz;
import com.multi.vo.CartypeVO;

@SpringBootTest
class CartypeUpdateTest {

	@Autowired
	CartypeBiz biz;
	
	@Test
	void contextLoads() {
		CartypeVO c = new CartypeVO(50, "소형444");
		try {
			biz.modify(c);
			System.out.println("updated");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
