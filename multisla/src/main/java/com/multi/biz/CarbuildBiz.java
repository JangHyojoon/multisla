package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.CarbuildMapper;
import com.multi.vo.CarbuildVO;
@Service
public class CarbuildBiz implements Biz<Integer,CarbuildVO>{

	@Autowired
	CarbuildMapper dao;

	@Override
	public void register(CarbuildVO v) throws Exception {
		dao.insert(v);
		
	}

	@Override
	public void modify(CarbuildVO v) throws Exception {
		dao.update(v);	
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);		
		
	}

	@Override
	public CarbuildVO get(Integer k) throws Exception {
		return 	dao.select(k);
	}

	@Override
	public List<CarbuildVO> get() throws Exception {
		return dao.selectall();
	}

	public int selectlast() throws Exception {
		return dao.selectlast();
	}
	
	public int selectprice(CarbuildVO v) throws Exception {
		return dao.selectprice(v);
	}

}
