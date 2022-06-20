package com.multi.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.UsersBiz;
import com.multi.vo.UsersVO;

@SpringBootTest
class InsertTest {
	@Autowired
	UsersBiz usersbiz;
	@Test
	void contextLoads() {
		
		UsersVO uv = new UsersVO("id03","pwd02","KIM","01012345678","11111","BUSAN","01012345678",null);
		
		try {
			usersbiz.register(uv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
