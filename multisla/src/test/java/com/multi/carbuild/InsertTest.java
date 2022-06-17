package com.multi.carbuild;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CarbuildBiz;
import com.multi.vo.CarbuildVO;

@SpringBootTest
class InsertTest {
	@Autowired
	CarbuildBiz carbuildbiz;
	@Test
	void contextLoads() {
		
		CarbuildVO cv = new CarbuildVO(102,202,302,402,true);
		
		try {
			carbuildbiz.register(cv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
