package com.example.domain;

import lombok.Data;

@Data
public class Topping {
	
	/** トッピングID */
	private Integer id;
	/** トッピング名 */
	private String name;
	/** 価格(M) */
	private Integer priceM;
	/** 価格(L) */
	private Integer priceL;

}
