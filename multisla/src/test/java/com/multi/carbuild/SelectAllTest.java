package com.multi.carbuild;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CarbuildBiz;
import com.multi.vo.CarbuildVO;

@SpringBootTest
class SelectAllTest {
	@Autowired
	CarbuildBiz carbuildbiz;
	@Test
	void contextLoads() {
		
		List<CarbuildVO> list = null;
		
		try {
			list = carbuildbiz.get();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (CarbuildVO uv : list) {
			System.out.println(uv);
		}
	}

}
