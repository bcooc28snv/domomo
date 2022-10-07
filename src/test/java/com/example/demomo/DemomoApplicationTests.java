package com.example.demomo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demomo.entity.Person;
import com.example.demomo.servive.ifs.Active_ifs;
import com.example.demomo.servive.ifs.PersonService_ifs;

@SpringBootTest
class DemomoApplicationTests {
	
	@Autowired
	private PersonService_ifs personService;

	@Test
	public void contextLoads() {
		Person person1 = personService.getPersonInfo("GAGAGA");
		System.out.println(person1.getId());
	}
	
	@Autowired
	private Active_ifs  pepeActiveService;
			//想連結的	//自創名
	@Test
	public void activeTest() {
		pepeActiveService.fly("Kavin", 7);
		//自創名點fly呼叫
	}
}
