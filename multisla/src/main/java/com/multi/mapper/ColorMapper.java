package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.ColorVO;

@Repository
@Mapper
public interface ColorMapper {
	public void insert(ColorVO obj) throws Exception;
	public void delete(int cid) throws Exception;
	public void update(ColorVO obj) throws Exception;
	public ColorVO select(int cid) throws Exception;
	public List<ColorVO> selectall() throws Exception;
}
