package com.multi.wheel;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.WheelBiz;
import com.multi.vo.WheelVO;

@SpringBootTest
class InsertTest {

	@Autowired
	WheelBiz biz;
	
	@Test
	void contextLoads() {
		WheelVO obj = new WheelVO("space black", 5000);
		List<WheelVO> list = null;
		try {
			biz.register(obj);
			list = biz.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (WheelVO o : list) {
			System.out.println(o);
		}
	}

}
