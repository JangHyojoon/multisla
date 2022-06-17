package com.multi.garage;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.GarageBiz;
import com.multi.vo.GarageVO;

@SpringBootTest
class UpdateTest {

	@Autowired
	GarageBiz biz;
	
	@Test
	void contextLoads() {
		GarageVO obj = new GarageVO(10006, 1003, "id01");
		List<GarageVO> list = null;
		try {
			biz.modify(obj);
			list = biz.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (GarageVO o : list) {
			System.out.println(o);
		}
	}

}
