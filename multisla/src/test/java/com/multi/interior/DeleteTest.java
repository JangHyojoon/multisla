package com.multi.interior;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.InteriorBiz;
import com.multi.vo.InteriorVO;

@SpringBootTest
class DeleteTest {

	@Autowired
	InteriorBiz biz;
	
	@Test
	void contextLoads() {
		List<InteriorVO> list = null;
		try {
			biz.remove(403);
			list = biz.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (InteriorVO o : list) {
			System.out.println(o);
		}
	}

}
