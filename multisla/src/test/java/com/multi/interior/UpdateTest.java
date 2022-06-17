package com.multi.interior;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.InteriorBiz;
import com.multi.vo.InteriorVO;

@SpringBootTest
class UpdateTest {

	@Autowired
	InteriorBiz biz;
	
	@Test
	void contextLoads() {
		InteriorVO obj = new InteriorVO(403,"futuristic", 50000);
		List<InteriorVO> list = null;
		try {
			biz.modify(obj);
			list = biz.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (InteriorVO o : list) {
			System.out.println(o);
		}
	}

}
