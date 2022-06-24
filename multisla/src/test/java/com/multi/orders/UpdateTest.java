package com.multi.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OrdersBiz;
import com.multi.vo.OrdersVO;

@SpringBootTest
class UpdateTest {
	@Autowired
	OrdersBiz ordersbiz;
	@Test
	void contextLoads() {
		
		OrdersVO uv = new OrdersVO(1,"id01",1022000,100,200,300,400,5000,"pay","JANG","phone","post","addr","daddr",7777777);
		
		try {
			ordersbiz.modify(uv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
