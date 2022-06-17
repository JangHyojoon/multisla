package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.CartypeMapper;
import com.multi.vo.CartypeVO;
@Service
public class CartypeBiz implements Biz<Integer,CartypeVO>{
	
	@Autowired
	CartypeMapper dao;

	@Override
	public void register(CartypeVO v) throws Exception {
		dao.insert(v);
		
	}

	@Override
	public void modify(CartypeVO v) throws Exception {
		dao.update(v);	
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);		
		
	}

	@Override
	public CartypeVO get(Integer k) throws Exception {
		return 	dao.select(k);
	}

	@Override
	public List<CartypeVO> get() throws Exception {
		return dao.selectall();
	}

	

}
