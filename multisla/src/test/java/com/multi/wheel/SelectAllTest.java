package com.multi.wheel;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.WheelBiz;
import com.multi.vo.WheelVO;

@SpringBootTest
class SelectAllTest {

	@Autowired
	WheelBiz biz;
	
	@Test
	void contextLoads() {
		List<WheelVO> list = null;
		try {
			list = biz.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (WheelVO obj : list) {
			System.out.println(obj);
		}
	}

}
