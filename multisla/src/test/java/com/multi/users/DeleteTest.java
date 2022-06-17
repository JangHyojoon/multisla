package com.multi.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.UsersBiz;

@SpringBootTest
class DeleteTest {
	@Autowired
	UsersBiz usersbiz;
	@Test
	void contextLoads() {
		
	
		
		try {
			usersbiz.remove("id02");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
