package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.ModelMapper;
import com.multi.vo.ModelVO;
@Service
public class ModelBiz implements Biz<Integer,ModelVO>{
	
	@Autowired
	ModelMapper dao;

	@Override
	public void register(ModelVO v) throws Exception {
		dao.insert(v);		
	}

	@Override
	public void modify(ModelVO v) throws Exception {
		dao.update(v);			
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);		
	}

	@Override
	public ModelVO get(Integer k) throws Exception {
		return 	dao.select(k);
	}

	@Override
	public List<ModelVO> get() throws Exception {
		return dao.selectall();
	}

}