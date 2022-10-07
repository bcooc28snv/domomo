package com.example.demomo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demomo.entity.Person;
import com.example.demomo.service.impl.Active_Impl;
import com.example.demomo.service.impl.PersonServiceImpl;

@SpringBootApplication
public class DemomoApplication_1006 {


/*		SpringApplication.run(DemomoApplication_1006.class, args);
		PersonServiceImpl personservice = new PersonServiceImpl();
							//≈‹º∆			//©I•s
		Person person1 = personservice.getPersonInfo("BOBO");
		personservice.printPersonAttributes(person1);
*/
	public static void main(String[] args) {
		Active_Impl peepee = new Active_Impl();
		peepee.fly("Kavin", 7);
	}
}
	