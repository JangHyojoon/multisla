package com.multi.ordersdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OrdersdetailBiz;
import com.multi.vo.OrdersdetailVO;

@SpringBootTest
class SelectLastTest {
	@Autowired
	OrdersdetailBiz ordersdetailbiz;
	@Test
	void contextLoads() {
		
		int ov = 0;
		
		try {
			ov = ordersdetailbiz.selectlast();
			System.out.println(ov);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
