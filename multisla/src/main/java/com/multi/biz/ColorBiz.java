package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.ColorMapper;
import com.multi.vo.ColorVO;

@Service
public class ColorBiz implements Biz<Integer, ColorVO>{

	@Autowired
	ColorMapper dao;
	
	@Override
	public void register(ColorVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(ColorVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public ColorVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<ColorVO> get() throws Exception {
		return dao.selectall();
	}
	
}
