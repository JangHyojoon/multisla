package com.multi.vo;

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
public class CarbuildVO {
	// Fields
	private int codeno;
	private int mid;
	private int colid;
	private int wid;
	private int iid;
	private boolean corder;
	private int carprice;
	private int cnt;
	
	// Constructors
	public CarbuildVO(int mid, int colid, int wid, int iid, boolean corder) {
		super();
		this.mid = mid;
		this.colid = colid;
		this.wid = wid;
		this.iid = iid;
		this.corder = corder;
	}
	public CarbuildVO(int codeno, int mid, int colid, int wid, int iid, boolean corder) {
		super();
		this.codeno = codeno;
		this.mid = mid;
		this.colid = colid;
		this.wid = wid;
		this.iid = iid;
		this.corder = corder;
	}

	

}
