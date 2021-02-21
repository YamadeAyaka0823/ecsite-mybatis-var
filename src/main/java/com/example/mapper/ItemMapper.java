package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Item;

@Mapper
public interface ItemMapper {
	
	/**
	 * 商品を全件検索する.
	 * @return
	 */
	List<Item> findAll();
	
	/**
	 * 商品IDで商品を1件検索する.
	 * @param itemId
	 * @return
	 */
	Item findByItemId(Integer itemId);

}
