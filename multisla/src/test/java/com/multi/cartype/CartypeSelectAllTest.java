package com.multi.cartype;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartypeBiz;
import com.multi.vo.CartypeVO;

@SpringBootTest
class CartypeSelectAllTest {

	@Autowired
	CartypeBiz biz;
	
	@Test
	void contextLoads() {
		List<CartypeVO> list = null;
		try {
			list = biz.get();
			for (CartypeVO cartypeVO : list) {
				System.out.println(cartypeVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
