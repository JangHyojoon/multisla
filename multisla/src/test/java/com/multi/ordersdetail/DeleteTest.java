package com.multi.ordersdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OrdersdetailBiz;

@SpringBootTest
class DeleteTest {
	@Autowired
	OrdersdetailBiz ordersdetailbiz;
	@Test
	void contextLoads() {
		
	
		
		try {
			ordersdetailbiz.remove(3);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
