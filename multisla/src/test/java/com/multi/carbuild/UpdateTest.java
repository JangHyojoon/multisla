package com.multi.carbuild;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CarbuildBiz;
import com.multi.vo.CarbuildVO;

@SpringBootTest
class UpdateTest {
	@Autowired
	CarbuildBiz carbuildbiz;
	@Test
	void contextLoads() {
		
		CarbuildVO cv = new CarbuildVO(1003,100,200,300,400,true);
		
		try {
			carbuildbiz.modify(cv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
