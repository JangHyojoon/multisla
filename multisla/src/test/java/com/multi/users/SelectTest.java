package com.multi.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.UsersBiz;
import com.multi.vo.UsersVO;

@SpringBootTest
class SelectTest {
	@Autowired
	UsersBiz usersbiz;
	@Test
	void contextLoads() {
		
		UsersVO uv;
		
		try {
			uv = usersbiz.get("id01");
			System.out.println(uv);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
