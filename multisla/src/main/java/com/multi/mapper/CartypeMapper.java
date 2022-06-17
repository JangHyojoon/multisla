package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.CartypeVO;

@Repository
@Mapper
public interface CartypeMapper {

	public void insert(CartypeVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(CartypeVO obj) throws Exception;
	public CartypeVO select(int obj) throws Exception;
	public List<CartypeVO> selectall() throws Exception;
	
}
