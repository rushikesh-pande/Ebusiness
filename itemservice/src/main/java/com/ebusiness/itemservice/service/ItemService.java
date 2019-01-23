package com.ebusiness.itemservice.service;

import java.util.List;

import com.ebusiness.itemservice.domain.Item;


public interface ItemService {
	public Item save(Item item);
	public Item getItemDetails(String name);
	public List<Item> getAllItems();
}