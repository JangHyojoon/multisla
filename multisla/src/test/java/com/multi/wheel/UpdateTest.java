package com.multi.wheel;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.WheelBiz;
import com.multi.vo.WheelVO;

@SpringBootTest
class UpdateTest {

	@Autowired
	WheelBiz biz;
	
	@Test
	void contextLoads() {
		WheelVO obj = new WheelVO(304,"yellow", 6000);
		List<WheelVO> list = null;
		try {
			biz.modify(obj);
			list = biz.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (WheelVO o : list) {
			System.out.println(o);
		}
	}

}
