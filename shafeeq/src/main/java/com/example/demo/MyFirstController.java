package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

@RequestMapping("/shafeeq")
	public String Boom() {
	return "Hello my friend";
	}

@RequestMapping("/home")
public String Home() {
	return "This is the home page";
}

}

