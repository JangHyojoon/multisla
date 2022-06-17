package com.multi.ordersdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OrdersdetailBiz;
import com.multi.vo.OrdersdetailVO;

@SpringBootTest
class InsertTest {
	@Autowired
	OrdersdetailBiz ordersdetailbiz;
	@Test
	void contextLoads() {
		
		OrdersdetailVO uv = new OrdersdetailVO("제작중",1,1000);
		
		try {
			ordersdetailbiz.register(uv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
