package com.multi.model;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartypeBiz;
import com.multi.biz.ModelBiz;
import com.multi.vo.CartypeVO;
import com.multi.vo.ModelVO;

@SpringBootTest
class ModelSelectAllTest {

	@Autowired
	ModelBiz biz;
	
	@Test
	void contextLoads() {
		List<ModelVO> list = null;
		try {
			list = biz.get();
			for (ModelVO modelvo : list) {
				System.out.println(modelvo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
