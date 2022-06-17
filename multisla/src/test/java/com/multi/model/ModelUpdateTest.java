package com.multi.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartypeBiz;
import com.multi.biz.ModelBiz;
import com.multi.vo.CartypeVO;
import com.multi.vo.ModelVO;

@SpringBootTest
class ModelUpdateTest {

	@Autowired
	ModelBiz biz;
	
	@Test
	void contextLoads() {
		ModelVO c = new ModelVO(108,"카니발12", 323232, 32);
		try {
			biz.modify(c);
			System.out.println("updated");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
