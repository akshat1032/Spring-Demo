package com.demo.springdemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

//	@RequestMapping("/Naruto")
//	public String greetUser() {
//		return "Hello World!";
//	}

	@RequestMapping("/Naruto")
	public List<DemoField> greetUser() {
		return Arrays.asList(
				new DemoField("shikamaru", 23),
				new DemoField("sasuke", 24), 
				new DemoField("rin", 26));

	}
}
