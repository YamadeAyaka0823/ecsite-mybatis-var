package com.example.domain;

import java.util.List;

import lombok.Data;

@Data
public class Item {
	
	/** 商品ID */
	private Integer id;
	/** 商品名 */
	private String name;
	/** 商品の説明 */
	private String description;
	/** 価格(M) */
	private Integer price_m;
	/** 価格(L) */
	private Integer price_l;
	/** 商品画像パス */
	private String image_path;
	/** トッピングリスト */
	private List<Topping> toppingList;

}
