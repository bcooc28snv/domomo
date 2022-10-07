package com.example.demomo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demomo.entity.Person;
import com.example.demomo.servive.ifs.PersonService_ifs;

//介面定義方法完 1.進入實作 Impl紅蚯蚓import完 複寫自動跳出

@Service
public class PersonServiceImpl implements PersonService_ifs {

	@Override
	public Person getPersonInfo(String id) {
		Person person1 = new Person(); //2.new出來
		person1.setAge(87);
		person1.setName("Bob");
		person1.setId(id);
		person1.setCity("HongKong");
		return person1;
	}	
//	public String getPersonId() {
//		String str = "HK";
//		return str;
	
	public void printPersonAttributes(Person person) {
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getCity());
		
	}
	}
	

