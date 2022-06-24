package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.OrdersVO;

@Repository
@Mapper
public interface OrdersMapper {
	public void insert(OrdersVO orders) throws Exception;
	public void delete(int ordersno) throws Exception;
	public void update(OrdersVO orders) throws Exception;
	
	public OrdersVO select(int ordersno) throws Exception;
	public List<OrdersVO> selectall() throws Exception;
	public Integer selectlast() throws Exception;
}
