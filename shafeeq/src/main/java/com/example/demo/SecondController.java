package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SecondController{
	@RequestMapping(method = RequestMethod.GET, value="/record")
	public String Boom() {
		return "Show Record";
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value="/record")
	public String Go() {
		return "Save Record";
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/add/{a}/{b}")
	public String add(@PathVariable int a,@PathVariable int b) {
		int r=a+b;
		return "Sum of " + a + " and " + b + " is :" +r;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/add/{a}/{b}/{c}")
	public String Operation(@PathVariable int a,@PathVariable String b, @PathVariable int c) {
		String Result = "";
		if (b.equals("+")) {
			Result = Integer.toString(a+c);
		} else if (b.equals("-")) {
			Result = Integer.toString(a-c);
		} else if (b.equals("x")) {
			Result = Integer.toString(a*c);
		} else if (b.equals("/")) {
			Result = Float.toString(a/c);
		} else {
			Result = "Please enter a correct operator";
		}
		return Result;
	}
}