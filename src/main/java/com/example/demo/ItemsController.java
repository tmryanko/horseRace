package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController extends Thread{

	@Autowired
	ItemsRepository repo;
	
	@PostMapping("/items")
	public List<Items> getAllItems(int num) {
		Items item[] = new Items[num];
		for(int i=0;i<num;i++) {
			item[i] = new Items(i);
			item[i].start();
		}
		
		return (List<Items>) repo.findAll();
	}
	

}
