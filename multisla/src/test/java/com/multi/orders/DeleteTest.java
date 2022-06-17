package com.multi.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OrdersBiz;

@SpringBootTest
class DeleteTest {
	@Autowired
	OrdersBiz ordersbiz;
	@Test
	void contextLoads() {
		
	
		
		try {
			ordersbiz.remove(3);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
