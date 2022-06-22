package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.CarbuildVO;

@Repository
@Mapper
public interface CarbuildMapper {

	public void insert(CarbuildVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(CarbuildVO obj) throws Exception;
	public CarbuildVO select(int obj) throws Exception;
	public List<CarbuildVO> selectall() throws Exception;
	public int selectlast() throws Exception;
}
