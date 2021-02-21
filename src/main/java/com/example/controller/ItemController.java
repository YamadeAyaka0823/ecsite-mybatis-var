package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Item;
import com.example.domain.Topping;
import com.example.service.ItemService;
import com.example.service.ToppingService;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@Autowired
	private ToppingService toppingService;
	
	/**
	 * 商品のリスト.(全件検索)
	 * @param model
	 * @return
	 */
	@RequestMapping("/list")
	public String list(Model model) {
		List<List<Item>> itemList = itemService.findAll();
		model.addAttribute("itemList", itemList);
		return "item_list_coffee";
	}
	
	/**
	 * 商品の詳細.
	 * @param itemId
	 * @param model
	 * @return
	 */
	@RequestMapping("/detail")
	public String detail(Integer itemId, Model model) {
		Item item = itemService.findByItemId(itemId); //itemIdでitemを1件検索.
		List<List<Topping>> toppingList = toppingService.findAll(); //toppingを全件検索.
		item.setToppingList(toppingList); //itemにtoppingListをset.
		model.addAttribute("item", item);
		return "item_detail";
	}

}
