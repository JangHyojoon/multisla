package com.multi.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.UsersBiz;
import com.multi.vo.UsersVO;

@SpringBootTest
class UpdateTest {
	@Autowired
	UsersBiz usersbiz;
	@Test
	void contextLoads() {
		
		UsersVO uv = new UsersVO("id02","pwd02","JANG","BUSAN","01012345678",null);
		
		try {
			usersbiz.modify(uv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
