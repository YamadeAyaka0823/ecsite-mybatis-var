package com.example.domain;

import lombok.Data;

@Data
public class OrderTopping {
	
	/** 注文トッピングID */
	private Integer id;
	/** トッピングID */
	private Integer toppingId;
	/** 注文商品ID */
	private Integer orderItemId;
	/** トッピング */
	private Topping topping;

}
