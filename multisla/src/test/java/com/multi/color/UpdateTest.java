package com.multi.color;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ColorBiz;
import com.multi.vo.ColorVO;

@SpringBootTest
class UpdateTest {

	@Autowired
	ColorBiz biz;
	
	@Test
	void contextLoads() {
		ColorVO obj = new ColorVO(208,"pastel", 300000);
		List<ColorVO> list = null;
		try {
			biz.modify(obj);
			list = biz.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (ColorVO o : list) {
			System.out.println(o);
		}
	}

}
