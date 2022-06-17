package com.multi.users;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.UsersBiz;
import com.multi.vo.UsersVO;

@SpringBootTest
class SelectAllTest {
	@Autowired
	UsersBiz usersbiz;
	@Test
	void contextLoads() {
		
		List<UsersVO> list = null;
		
		try {
			list = usersbiz.get();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (UsersVO uv : list) {
			System.out.println(uv);
		}
	}

}
