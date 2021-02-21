package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Item;
import com.example.mapper.ItemMapper;

@Service
@Transactional
public class ItemService {
	
	@Autowired
	private ItemMapper itemMapper;
	
	/**
	 * 商品を全件検索する.
	 * @return
	 */
	public List<List<Item>> findAll(){
		return array3Item(itemMapper.findAll());
	}
	
	/**
	 * 商品を３つずつ表示させるロジック.
	 * @param itemList
	 * @return
	 */
	public List<List<Item>> array3Item(List<Item> itemList){
		List<Item> item3List = new ArrayList<>();
		List<List<Item>> itemAllList = new ArrayList<>();
		for(int i = 1; i <= itemList.size(); i++) {
			item3List.add(itemList.get(i-1));
			if((i % 3) == 0) {
				itemAllList.add(item3List);
				item3List = new ArrayList<>();
			}
		}
//		if(item3List.size() == 0) {
//			return itemAllList;
//		}
//		itemAllList.add(item3List);
		return itemAllList;
	}

}
