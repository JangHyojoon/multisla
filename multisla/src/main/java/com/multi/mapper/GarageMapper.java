package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.GarageVO;

@Repository
@Mapper
public interface GarageMapper {
	public void insert(GarageVO obj) throws Exception;
	public void delete(int gid) throws Exception;
	public void update(GarageVO obj) throws Exception;
	public GarageVO select(int gid) throws Exception;
	public List<GarageVO> selectall() throws Exception;
}
