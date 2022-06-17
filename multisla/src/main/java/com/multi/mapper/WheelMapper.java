package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.WheelVO;

@Repository
@Mapper
public interface WheelMapper {
	public void insert(WheelVO obj) throws Exception;
	public void delete(int wid) throws Exception;
	public void update(WheelVO obj) throws Exception;
	public WheelVO select(int wid) throws Exception;
	public List<WheelVO> selectall() throws Exception;
}
