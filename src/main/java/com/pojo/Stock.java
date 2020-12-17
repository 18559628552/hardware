package com.pojo;

import lombok.Data;

@Data
public class Stock {
	private String gid;
	private String g_type;
	private String g_name;
	private String g_batch;
	private String g_spe;
	private String supplier;
	private Double in_price;
	private Integer st_num;
	private String gsid;

}
