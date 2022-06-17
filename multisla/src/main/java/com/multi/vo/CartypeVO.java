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
public class CartypeVO {
	private int ctid;
	private String ctname;
	private int pid;
	
	public CartypeVO(int ctid, String ctname) {
		this.ctid = ctid;
		this.ctname = ctname;
	}
	
}
