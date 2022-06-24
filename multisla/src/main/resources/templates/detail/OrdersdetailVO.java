package com.multi.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrdersdetailVO {
	private int odetailno;
	private String ostatus;
	private Date shipdate;
	private int ordersno;
	private int codeno;
	public OrdersdetailVO(String ostatus, Date shipdate, int ordersno, int codeno) {
		super();
		this.ostatus = ostatus;
		this.shipdate = shipdate;
		this.ordersno = ordersno;
		this.codeno = codeno;
	}


	  
	
}
