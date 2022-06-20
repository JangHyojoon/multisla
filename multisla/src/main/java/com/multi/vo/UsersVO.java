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
public class UsersVO {
	private String uid;
	private String upwd;
	private String uname;
	private String uphone;
	private String upost;
	private String uaddr;
	private String udaddr;
	private Date regdate;
	public UsersVO(String uid, String upwd, String uname, String uphone, String upost, String uaddr, String udaddr) {
		super();
		this.uid = uid;
		this.upwd = upwd;
		this.uname = uname;
		this.uphone = uphone;
		this.upost = upost;
		this.uaddr = uaddr;
		this.udaddr = udaddr;
	}
	
	
	
}
