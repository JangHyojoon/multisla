package com.multi.carbuild;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CarbuildBiz;
import com.multi.vo.CarbuildVO;

@SpringBootTest
class SelectTest {
	@Autowired
	CarbuildBiz carbuildbiz;
	@Test
	void contextLoads() {
		
		CarbuildVO uv;
		
		try {
			uv = carbuildbiz.get(1000);
			System.out.println(uv);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
