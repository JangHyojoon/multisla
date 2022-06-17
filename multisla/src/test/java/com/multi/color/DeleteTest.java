package com.multi.color;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ColorBiz;
import com.multi.vo.ColorVO;

@SpringBootTest
class DeleteTest {

	@Autowired
	ColorBiz biz;
	
	@Test
	void contextLoads() {
		List<ColorVO> list = null;
		try {
			biz.remove(208);
			list = biz.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (ColorVO o : list) {
			System.out.println(o);
		}
	}

}
