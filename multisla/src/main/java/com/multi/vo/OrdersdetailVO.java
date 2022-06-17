package com.multi.vo;

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
	private int oredersno;
	private int codeno;
	public OrdersdetailVO(String ostatus, int oredersno, int codeno) {
		super();
		this.ostatus = ostatus;
		this.oredersno = oredersno;
		this.codeno = codeno;
	}
	  
	
}
