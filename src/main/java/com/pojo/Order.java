package com.pojo;

import lombok.Data;

@Data
public class Order {
	private Integer oid;
	private Integer o_state;
	private String price;
	private Integer paystate;
	private String o_time;
	private String receiver;
	private String cid;
	private String r_add;
	private String r_phone;
	private Integer deletestate;
	private String back_r;
	private String email_id;

	
}
