package com.multi.orders;

import java.util.Date;

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
		Date today = new Date();
		OrdersVO ov = new OrdersVO(2,"id01",1234,56789,"credit","seoul",today,20202020);
		
		try {
			ordersbiz.modify(ov);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
