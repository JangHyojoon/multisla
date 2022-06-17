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
public class OrdersVO {
	  private int ordersno;
	  private String uid;
	  private Date regdate;
	  private int carprice;
	  private int shipprice;
	  private String pay;
	  private String shipaddr;
	  private Date shipdate;
	  private int finalprice;
	  
	public OrdersVO(String uid, int carprice, int shipprice, String pay, String shipaddr, Date shipdate,
			int finalprice) {
		super();
		this.uid = uid;
		this.carprice = carprice;
		this.shipprice = shipprice;
		this.pay = pay;
		this.shipaddr = shipaddr;
		this.shipdate = shipdate;
		this.finalprice = finalprice;
	}

	public OrdersVO(int ordersno, String uid, int carprice, int shipprice, String pay, String shipaddr, Date shipdate,
			int finalprice) {
		super();
		this.ordersno = ordersno;
		this.uid = uid;
		this.carprice = carprice;
		this.shipprice = shipprice;
		this.pay = pay;
		this.shipaddr = shipaddr;
		this.shipdate = shipdate;
		this.finalprice = finalprice;
	}
	  
	
}
