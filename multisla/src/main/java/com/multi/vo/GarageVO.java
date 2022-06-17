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
public class GarageVO {
	// Fields
	private int gid;
	private int codeno;
	private String uid;
	private String uname;	// Select를 위한 Fields
	private String mname;
	private String coloption;
	private String woption;
	private String ioption;
	private int price;
	private boolean corder;
	
	// Constructors
	public GarageVO(int codeno, String uid) {	// Insert를 위한 Constructor
		this.codeno = codeno;
		this.uid = uid;
	}
	public GarageVO(int gid, int codeno, String uid) {	// Update를 위한 Constructor
		this.gid = gid;
		this.codeno = codeno;
		this.uid = uid;
	}
}
