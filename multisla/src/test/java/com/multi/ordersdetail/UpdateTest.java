package com.multi.ordersdetail;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OrdersdetailBiz;
import com.multi.vo.OrdersdetailVO;

@SpringBootTest
class UpdateTest {
	@Autowired
	OrdersdetailBiz ordersdetailbiz;
	@Test
	void contextLoads() {
		Date today = new Date();

		OrdersdetailVO uv = new OrdersdetailVO(2,"배송중",today,1,1000);
		
		try {
			ordersdetailbiz.modify(uv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
