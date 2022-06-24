package com.multi.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OrdersBiz;

@SpringBootTest
class SelectLastTest {
	@Autowired
	OrdersBiz ordersbiz;
	@Test
	void contextLoads() {
		
		int last = 0;
		
		try {
			last = ordersbiz.selectlast();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
			System.out.println(last);
		}
	}

