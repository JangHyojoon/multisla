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
	  private int mid;
	  private int colid;
	  private int wid;
	  private int iid;
	  private int shipprice;
	  private String pay;
	  private String shipphone;
	  private String shippost;
	  private String shipaddr;
	  private String shipdaddr;
	  
	  private int finalprice;
	  
	  private String mname;
	  private String coloption; 
	  private String woption;  
	  private String ioption;
	public OrdersVO(String uid, int carprice, int mid, int colid, int wid, int iid, int shipprice, String pay,
			String shipphone, String shippost, String shipaddr, String shipdaddr, int finalprice) {
		super();
		this.uid = uid;
		this.carprice = carprice;
		this.mid = mid;
		this.colid = colid;
		this.wid = wid;
		this.iid = iid;
		this.shipprice = shipprice;
		this.pay = pay;
		this.shipphone = shipphone;
		this.shippost = shippost;
		this.shipaddr = shipaddr;
		this.shipdaddr = shipdaddr;
		this.finalprice = finalprice;
	}
	public OrdersVO(int ordersno, String uid, int carprice, int mid, int colid, int wid, int iid, int shipprice,
			String pay, String shipphone, String shippost, String shipaddr, String shipdaddr, int finalprice) {
		super();
		this.ordersno = ordersno;
		this.uid = uid;
		this.carprice = carprice;
		this.mid = mid;
		this.colid = colid;
		this.wid = wid;
		this.iid = iid;
		this.shipprice = shipprice;
		this.pay = pay;
		this.shipphone = shipphone;
		this.shippost = shippost;
		this.shipaddr = shipaddr;
		this.shipdaddr = shipdaddr;
		this.finalprice = finalprice;
	}
	public OrdersVO(int ordersno, String uid, Date regdate, int carprice, int shipprice, String pay, String shipphone,
			String shippost, String shipaddr, String shipdaddr, int finalprice, String mname,
			String coloption, String woption, String ioption) {
		super();
		this.ordersno = ordersno;
		this.uid = uid;
		this.regdate = regdate;
		this.carprice = carprice;
		this.shipprice = shipprice;
		this.pay = pay;
		this.shipphone = shipphone;
		this.shippost = shippost;
		this.shipaddr = shipaddr;
		this.shipdaddr = shipdaddr;
		this.finalprice = finalprice;
		this.mname = mname;
		this.coloption = coloption;
		this.woption = woption;
		this.ioption = ioption;
	}
	
	  
	  
	  
	  

	  

	
	
	  
	  

	  
	  
	  

	
	  

	  
	
}
