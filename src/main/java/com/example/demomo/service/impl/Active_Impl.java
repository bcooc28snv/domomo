package com.example.demomo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demomo.servive.ifs.Active_ifs;
@Service
public class Active_Impl implements Active_ifs {
//實作頁面 沒有回傳型態 
	@Override
	public void fly(String name, int age) {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		
	}
}
