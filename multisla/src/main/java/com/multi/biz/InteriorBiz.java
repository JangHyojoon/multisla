package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.InteriorMapper;
import com.multi.vo.InteriorVO;

@Service
public class InteriorBiz implements Biz<Integer, InteriorVO>{

	@Autowired
	InteriorMapper dao;
	
	@Override
	public void register(InteriorVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(InteriorVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public InteriorVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<InteriorVO> get() throws Exception {
		return dao.selectall();
	}
	
}
