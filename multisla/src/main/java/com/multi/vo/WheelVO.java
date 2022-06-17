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
public class WheelVO {
	// Fields
	private int wid;
	private String woption;
	private int wprice;
	
	// Constructors
	public WheelVO(String woption, int wprice) {
		this.woption = woption;
		this.wprice = wprice;
	}
}
