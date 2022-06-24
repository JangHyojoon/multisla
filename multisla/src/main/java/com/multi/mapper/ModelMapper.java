package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.ModelVO;

@Repository
@Mapper
public interface ModelMapper {

	public void insert(ModelVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(ModelVO obj) throws Exception;
	public ModelVO select(int obj) throws Exception;
	public List<ModelVO> selectall() throws Exception;
	
}
