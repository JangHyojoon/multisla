package com.multi.orders;

import java.util.Date;

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
		Date today = new Date();
		OrdersVO uv = new OrdersVO("id01",1234,56789,"credit","seoul",today,11123);
		
		try {
			ordersbiz.register(uv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
