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
public class ColorVO {
	// Fields
	private int colid;
	private String coloption;
	private int colprice;
	
	// Constructors
	public ColorVO(String coloption, int colprice) {
		this.coloption = coloption;
		this.colprice = colprice;
	}
}
