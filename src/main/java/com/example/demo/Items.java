package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="ITEMS")
public class Items extends Thread{
	
	@Id
	int id;
	

	public Items() {
		super();
	}
	public Items(int id) {
		super();
		this.id = id;

	}
	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "items [id=" + id + "]";
	}
	public void run() {
		int num=50;
		
		for(int i=0;i<=100;i=i+10) {
			int num1=(int)( Math.random() * 100);
			System.out.println("Horse number: " + id
					 + ", percent complete: " + i );
			try {
				Thread.sleep(num+num1);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}
