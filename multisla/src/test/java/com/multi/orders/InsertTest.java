package com.multi.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OrdersBiz;
import com.multi.vo.OrdersVO;

@SpringBootTest
class InsertTest {
	@Autowired
	OrdersBiz ordersbiz;
	@Test
	void contextLoads() {
		
		OrdersVO uv = new OrdersVO("id01",1000000,100,200,300,400,5000,"pay","phone","post","addr","daddr",8888);

		
		try {
			ordersbiz.register(uv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
