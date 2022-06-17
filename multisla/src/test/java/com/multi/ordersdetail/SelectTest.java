package com.multi.ordersdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OrdersdetailBiz;
import com.multi.vo.OrdersdetailVO;

@SpringBootTest
class SelectTest {
	@Autowired
	OrdersdetailBiz ordersdetailbiz;
	@Test
	void contextLoads() {
		
		OrdersdetailVO ov;
		
		try {
			ov = ordersdetailbiz.get(2);
			System.out.println(ov);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
