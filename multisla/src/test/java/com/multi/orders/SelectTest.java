package com.multi.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OrdersBiz;
import com.multi.vo.OrdersVO;

@SpringBootTest
class SelectTest {
	@Autowired
	OrdersBiz ordersbiz;
	@Test
	void contextLoads() {
		
		OrdersVO ov;
		
		try {
			ov = ordersbiz.get(2);
			System.out.println(ov);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
