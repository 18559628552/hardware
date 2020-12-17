package com.pojo;

import lombok.Data;

@Data
public class Goods {
	private String gid;
	private String g_type;
	private String g_name;
	private String g_batch;
	private String g_spe;
	private String supplier;
	private Double in_price;
	private Double out_price;
	private Integer sh_num;
	private Integer sh_state;
	private String g_intro;
	private String route;

	
}
