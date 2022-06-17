package com.multi.orders;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OrdersBiz;
import com.multi.vo.OrdersVO;

@SpringBootTest
class SelectAllTest {
	@Autowired
	OrdersBiz ordersbiz;
	@Test
	void contextLoads() {
		
		List<OrdersVO> list = null;
		
		try {
			list = ordersbiz.get();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (OrdersVO ov : list) {
			System.out.println(ov);
		}
	}

}
