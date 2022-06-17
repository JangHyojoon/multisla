package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.WheelMapper;
import com.multi.vo.WheelVO;

@Service
public class WheelBiz implements Biz<Integer, WheelVO>{

	@Autowired
	WheelMapper dao;
	
	@Override
	public void register(WheelVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(WheelVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public WheelVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<WheelVO> get() throws Exception {
		return dao.selectall();
	}
	
}
