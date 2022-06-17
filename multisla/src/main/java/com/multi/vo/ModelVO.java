package com.multi.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ModelVO {
	private int mid;
	private int ctid;
	private String mname;
	private int mprice;
	private Date regdate;
	
	public ModelVO(int mid, String mname, int mprice, Date regdate) {
		this.mid = mid;
		this.mname = mname;
		this.mprice = mprice;
		this.regdate = regdate;
	}
	public ModelVO(int mid, String mname, int mprice) {
		this.mid = mid;
		this.mname = mname;
		this.mprice = mprice;
	}
	public ModelVO(String mname, int mprice, int ctid) {
		this.mname = mname;
		this.mprice = mprice;
		this.ctid = ctid;
	}
	public ModelVO(int mid, String mname, int mprice, int ctid) {
		this.mid = mid;
		this.mname = mname;
		this.mprice = mprice;
		this.ctid = ctid;
	}
	
	
}
