package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.UsersVO;

@Repository
@Mapper
public interface UsersMapper {
	public void insert(UsersVO users) throws Exception;
	public void delete(String id) throws Exception;
	public void update(UsersVO users) throws Exception;
	
	public UsersVO select(String id) throws Exception;
	public List<UsersVO> selectall() throws Exception;

}
