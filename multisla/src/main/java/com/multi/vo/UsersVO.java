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
	private String uaddr;
	private String uphone;
	private Date regdate;
}
