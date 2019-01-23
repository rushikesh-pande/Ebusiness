package com.ebusiness.itemservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ebusiness.itemservice.domain.Item;
import com.ebusiness.itemservice.service.ItemService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RequestMapping("/items")
@RestControllerAdvice
@RestController
//@Api(value="onlinestore", description="Operations pertaining to items in Online Store")

public class ItemServiceController {
	
	@Autowired
	ItemService  itemService;
	

    
	
	//@ResponseStatus(HttpStatus.OK)
	@GetMapping("show/all")
	@RequestMapping(value = "/", method= RequestMethod.GET, produces = "application/json")
	public List<Item> all() {
		return itemService.getAllItems();
	}
	
	//@ResponseStatus(HttpStatus.OK)
	@GetMapping(value="show/{itemName}")
	//@RequestMapping(value = "/show/{itemName}", method= RequestMethod.GET, produces = "application/json")
	public Item get(@PathVariable String itemName) {
		return itemService.getItemDetails(itemName);
	}
	
	//@ResponseStatus(HttpStatus.OK)
	@PutMapping(value="/modify/{itemName}")
	//@RequestMapping(value = "/modify/{itemName}", method = RequestMethod.POST, produces = "application/json")
	public Item put(@PathVariable String itemName,@RequestBody Item item) {
		item.setName(itemName);
		return itemService.save(item);
	}
	
	//@PostMapping("/")
	//@ResponseStatus(HttpStatus.CREATED)
	//@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
	@PostMapping(value = "/add")
	public Item add(@RequestBody Item item) {
		System.out.println(item);
		return itemService.save(item);
	}
}
