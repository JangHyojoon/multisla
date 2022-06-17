package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.InteriorVO;

@Repository
@Mapper
public interface InteriorMapper {
	public void insert(InteriorVO obj) throws Exception;
	public void delete(int iid) throws Exception;
	public void update(InteriorVO obj) throws Exception;
	public InteriorVO select(int iid) throws Exception;
	public List<InteriorVO> selectall() throws Exception;
}
