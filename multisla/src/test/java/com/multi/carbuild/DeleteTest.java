package com.multi.carbuild;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CarbuildBiz;

@SpringBootTest
class DeleteTest {
	@Autowired
	CarbuildBiz carbuildbiz;
	@Test
	void contextLoads() {
		
	
		
		try {
			carbuildbiz.remove(1003);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
