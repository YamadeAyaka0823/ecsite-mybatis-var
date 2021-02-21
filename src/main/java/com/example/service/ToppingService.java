package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Topping;
import com.example.mapper.ToppingMapper;

@Service
@Transactional
public class ToppingService {
	
	@Autowired
	private ToppingMapper toppingMapper;
	
	/**
	 * トッピングの全件検索.
	 * @return
	 */
	public List<List<Topping>> findAll(){
		return array3Topping(toppingMapper.findAll());
	}
	
	/**
	 * トッピングを３つずつ表示させるロジック.
	 * @param toppingList
	 * @return
	 */
	public List<List<Topping>> array3Topping(List<Topping> toppingList){
		List<Topping> topping3List = new ArrayList<>();
		List<List<Topping>> toppingAllList = new ArrayList<>();
		for(int i = 1; i <= toppingList.size(); i++) {
			topping3List.add(toppingList.get(i-1));
			if((i % 3) == 0) {
				toppingAllList.add(topping3List);
				topping3List = new ArrayList<>();
			}
		}
//		if(item3List.size() == 0) {
//			return itemAllList;
//		}
//		itemAllList.add(item3List);
		return toppingAllList;
	}

}
