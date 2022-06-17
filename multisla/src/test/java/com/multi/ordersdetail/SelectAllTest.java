package com.multi.ordersdetail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OrdersdetailBiz;
import com.multi.vo.OrdersdetailVO;

@SpringBootTest
class SelectAllTest {
	@Autowired
	OrdersdetailBiz ordersdetailbiz;
	@Test
	void contextLoads() {
		
		List<OrdersdetailVO> list = null;
		
		try {
			list = ordersdetailbiz.get();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (OrdersdetailVO ov : list) {
			System.out.println(ov);
		}
	}

}
