package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.GarageMapper;
import com.multi.vo.GarageVO;

@Service
public class GarageBiz implements Biz<Integer, GarageVO>{

	@Autowired
	GarageMapper dao;
	
	@Override
	public void register(GarageVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(GarageVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public GarageVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<GarageVO> get() throws Exception {
		return dao.selectall();
	}
	public List<GarageVO> getuid(String uid) throws Exception {
		return dao.selectuid(uid);
	}
	public List<GarageVO> getmid(int mid) throws Exception {
		return dao.selectmid(mid);
	}
}
