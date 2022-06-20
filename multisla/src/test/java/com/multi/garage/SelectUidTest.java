package com.multi.garage;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.GarageBiz;
import com.multi.vo.GarageVO;

@SpringBootTest
class SelectUidTest {

	@Autowired
	GarageBiz biz;
	
	@Test
	void contextLoads() {
		List<GarageVO> obj = null;
		try {
			obj = biz.getuid("id01");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(obj);
	}

}
