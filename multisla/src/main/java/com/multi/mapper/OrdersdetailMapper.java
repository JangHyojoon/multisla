package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.OrdersdetailVO;

@Repository
@Mapper
public interface OrdersdetailMapper {
	public void insert(OrdersdetailVO orders) throws Exception;
	public void delete(int odetailno) throws Exception;
	public void update(OrdersdetailVO orders) throws Exception;
	
	public OrdersdetailVO select(int odetailno) throws Exception;
	public List<OrdersdetailVO> selectall() throws Exception;

}
