package com.myne.TestApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String testMethod(String str) {		
		System.out.print("inside Method");
		return "Hai"+str;
	}

}
