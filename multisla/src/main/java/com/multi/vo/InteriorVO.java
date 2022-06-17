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
public class InteriorVO {
	// Fields
	private int iid;
	private String ioption;
	private int iprice;
	
	// Constructors
	public InteriorVO(String ioption, int iprice) {
		this.ioption = ioption;
		this.iprice = iprice;
	}
}
