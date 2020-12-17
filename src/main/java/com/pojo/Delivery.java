package com.pojo;

import lombok.Data;

@Data
public class Delivery {
	private Integer oid;
	private String gid;
	private String g_type;
	private String g_name;
	private String g_batch;
	private String g_spe;
	private String supplier;
	private Integer out_num;
	private String out_time;
	private String sid;
	private String email_id;

	
}
